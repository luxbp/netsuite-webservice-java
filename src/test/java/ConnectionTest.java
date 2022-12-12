import com.netsuite.application.NetsuiteSession;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectionTest {

    @Test
    public void testConnection() throws Exception {
        NetSuitePortType port = (new NetsuiteSession()).getPort();
        assertTrue(port.getServerTime().getServerTime().getTimeInMillis() > 0);
    }

    @Test
    public void testConnectionWithConfiguration() throws Exception {
        Dotenv dotenv = Dotenv.configure()
                .filename(".env") // instead of '.env', use 'env'
                .load();

        NetSuitePortType port = (new NetsuiteSession(dotenv)).getPort();
        assertTrue(port.getServerTime().getServerTime().getTimeInMillis() > 0);
    }
}
