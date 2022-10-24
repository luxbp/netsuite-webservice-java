import com.netsuite.webservices.platform.core_2022_1.DataCenterUrls;
import com.netsuite.webservices.platform.core_2022_1.TokenPassport;
import com.netsuite.webservices.platform.core_2022_1.TokenPassportSignature;
import com.netsuite.webservices.platform.core_2022_1.types.SignatureAlgorithm;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;
import com.netsuite.webservices.platform_2022_1.NetSuiteServiceLocator;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.axis.client.Stub;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URL;
import java.rmi.RemoteException;

import static org.junit.Assert.assertTrue;

public class ConnectionTest {

    public NetSuiteServiceLocator service;
    public NetSuitePortType port;

    @Before
    public void setUp() throws Exception {
        Dotenv dotenv = Dotenv.load();

        service = new NetSuiteServiceLocator();
        service.setMaintainSession(true);

        port = getNetSuitePort(dotenv.get("NETSUITE_ACCOUNT_ID"), new URL(service.getNetSuitePortAddress()));

        String nonce = RandomStringUtils.randomAlphanumeric(20);
        Long timeStamp = System.currentTimeMillis() / 1000L;

        String signature = computeSignature(
                dotenv.get("NETSUITE_ACCOUNT_ID"),
                dotenv.get("NETSUITE_CONSUMER_KEY"),
                dotenv.get("NETSUITE_CONSUMER_SECRET"),
                dotenv.get("NETSUITE_TOKEN"),
                dotenv.get("NETSUITE_TOKEN_SECRET"),
                nonce,
                timeStamp);


        TokenPassportSignature sig = new TokenPassportSignature(signature);
        sig.setAlgorithm(SignatureAlgorithm._HMAC_SHA256);

        TokenPassport passport = new TokenPassport(
                dotenv.get("NETSUITE_ACCOUNT_ID"),
                dotenv.get("NETSUITE_CONSUMER_KEY"),
                dotenv.get("NETSUITE_TOKEN"),
                nonce, // nonce
                timeStamp, // timestamp
                sig
        );

        // Setting the token on the port
        ((Stub) port).setHeader(
                String.format("urn:messages_%s.platform.webservices.netsuite.com", dotenv.get("NETSUITE_VERSION", "2022_1")),
                "tokenPassport",
                passport
        );
    }

    @Test
    public void testConnection() throws RemoteException {
        assertTrue(port.getServerTime().getServerTime().getTimeInMillis() > 0);
    }

    protected NetSuitePortType getNetSuitePort(String account, URL defaultWsDomainURL)
    {
        try
        {
            NetSuitePortType _port = service.getNetSuitePort(defaultWsDomainURL);
            // Get the webservices domain for your account
            DataCenterUrls urls = _port.getDataCenterUrls(account).getDataCenterUrls();
            String wsDomain = urls.getWebservicesDomain();
            // Return URL appropriate for the specific account
            return service.getNetSuitePort(new URL(wsDomain.concat(defaultWsDomainURL.getPath())));
        }
        catch (Exception e)
        {
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
