package test.janus.pool;

import static org.junit.Assert.fail;

import java.sql.Connection;

import org.apache.log4j.Logger;
import org.janus.pool.db.ConnectionProxyPool;
import org.junit.Test;

public class PoolTest {
    private static final String UNERWARTETE_AUSNAHME = "unerwartete Ausnahme";
    static  private final Logger LOG = Logger.getLogger(PoolTest.class);
    
	@Test
	public void testDB() {
		try {
			Connection con = ConnectionProxyPool.getConnection("test");
			con.close();
			ConnectionProxyPool.shutdown();

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}

}
