package test.janus.pool;

import static org.junit.Assert.fail;

import java.sql.Connection;

import org.janus.pool.db.ConnectionProxyPool;
import org.junit.Test;

public class PoolTest {

	@Test
	public void testDB() {
		try {
			Connection con = ConnectionProxyPool.getConnection("test");
			con.close();
			ConnectionProxyPool.shutdown();

		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Ausnahme aufgetreten");
		}
	}

}
