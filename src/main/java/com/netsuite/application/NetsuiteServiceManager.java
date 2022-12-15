package com.netsuite.application;

import com.netsuite.webservices.platform.core_2022_1.DataCenterUrls;
import com.netsuite.webservices.platform.core_2022_1.TokenPassport;
import com.netsuite.webservices.platform.core_2022_1.TokenPassportSignature;
import com.netsuite.webservices.platform.core_2022_1.types.SignatureAlgorithm;
import com.netsuite.webservices.platform_2022_1.NetSuiteBindingStub;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;
import com.netsuite.webservices.platform_2022_1.NetSuiteServiceLocator;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.lang3.RandomStringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URL;

public class NetsuiteServiceManager {
    protected Dotenv environment;

    protected NetSuiteServiceLocator service;
    protected static NetSuitePortType port;

    /**
     * Initializes the netsuite session, loading default .env
     *
     * @throws Exception
     */
    public NetsuiteServiceManager() throws Exception {
        environment = Dotenv.load();
        this.setSession();
    }

    /**
     * Initializes the netsuite session
     * <p>
     * See https://github.com/cdimascio/dotenv-java for documentation
     * on configuring a custom environment file.
     *
     * @throws Exception
     */
    public NetsuiteServiceManager(Dotenv environment) throws Exception {
        this.environment = environment;
        this.setSession();
    }

    public final static NetSuitePortType getInstance() throws Exception {
        if (NetsuiteServiceManager.port != null) {
            return NetsuiteServiceManager.port;
        }

        throw new RuntimeException("Service must be initialized.");
    }

    public NetSuitePortType getService() {
        return port;
    }

    protected void setSession() throws Exception {
        service = new NetSuiteServiceLocator();
        service.setMaintainSession(true);
        port = createPort(environment.get("NETSUITE_ACCOUNT_ID"), new URL(service.getNetSuitePortAddress()));

        // Setting the token on the port
        NetSuiteBindingStub stub = ((NetSuiteBindingStub) port);
        stub.clearHeaders();
        stub.setHeader(
                String.format("urn:messages_%s.platform.webservices.netsuite.com", environment.get("NETSUITE_VERSION", "2022_1")),
                "tokenPassport",
                createPassport()
        );
    }

    protected TokenPassport createPassport() throws Exception {

        String nonce = RandomStringUtils.randomAlphanumeric(20);
        Long timeStamp = System.currentTimeMillis() / 1000L;

        String signature = computeSignature(
                environment.get("NETSUITE_ACCOUNT_ID"),
                environment.get("NETSUITE_CONSUMER_KEY"),
                environment.get("NETSUITE_CONSUMER_SECRET"),
                environment.get("NETSUITE_TOKEN"),
                environment.get("NETSUITE_TOKEN_SECRET"),
                nonce,
                timeStamp);


        TokenPassportSignature sig = new TokenPassportSignature(signature);
        sig.setAlgorithm(SignatureAlgorithm._HMAC_SHA256);

        TokenPassport passport = new TokenPassport(
                environment.get("NETSUITE_ACCOUNT_ID"),
                environment.get("NETSUITE_CONSUMER_KEY"),
                environment.get("NETSUITE_TOKEN"),
                nonce, // nonce
                timeStamp, // timestamp
                sig
        );

        return passport;
    }

    protected NetSuitePortType createPort(String account, URL defaultWsDomainURL) {
        try {
            NetSuitePortType _port = service.getNetSuitePort(defaultWsDomainURL);
            // Get the webservices domain for your account
            DataCenterUrls urls = _port.getDataCenterUrls(account).getDataCenterUrls();
            String wsDomain = urls.getWebservicesDomain();
            // Return URL appropriate for the specific account
            return service.getNetSuitePort(new URL(wsDomain.concat(defaultWsDomainURL.getPath())));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected String computeShaHash(String baseString, String key, String algorithm) throws Exception {

        byte[] bytes = key.getBytes();
        SecretKeySpec mySigningKey = new SecretKeySpec(bytes, algorithm);

        Mac messageAuthenticationCode = Mac.getInstance(algorithm);

        messageAuthenticationCode.init(mySigningKey);

        byte[] hash = messageAuthenticationCode.doFinal(baseString.getBytes());

        String result = new String(java.util.Base64.getEncoder().encode(hash));

        return result;
    }

    public String computeSignature(
            String account,
            String consumerKey,
            String consumerSecret,
            String token,
            String tokenSecret,
            String nonce,
            Long timeStamp
    ) throws Exception {
        String baseString = account + "&" + consumerKey + "&" + token + "&" + nonce + "&" + timeStamp;

        String key = consumerSecret + '&' + tokenSecret;

        String signature = computeShaHash(baseString, key, "HmacSHA256");

        return signature;
    }
}
