package test.janus.pool;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.janus.pool.db.ConnectionProxy;
import org.janus.pool.db.ConnectionProxyPool;
import org.junit.Test;

import test.janus.db.EmptyConnection;
import test.janus.db.EmptyFabric;
import test.janus.db.EmptyPreparedStatement;
import test.janus.db.EmptyResultSet;
import test.janus.db.EmptyStatement;

public class CountTests {
    private static final String UNERWARTETE_AUSNAHME = "unerwartete Ausnahme";
    static  private final Logger LOG = Logger.getLogger(CountTests.class);
	
	@Test
	public void testDB() {
		try {
			Connection con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			con.close();
			assertTrue(((EmptyConnection)con.unwrap(EmptyConnection.class)).isOpen);
			ConnectionProxyPool.shutdown();
			assertFalse(((EmptyConnection)con.unwrap(EmptyConnection.class)).isOpen);

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}
	
	@Test
	public void testCountOfStatements() {
		try {
			ConnectionProxy con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			Statement stmt = con.createStatement();
			assertEquals(1,con.getStatements().size());
			stmt.close();
			assertEquals(0,con.getStatements().size());
			assertFalse(((EmptyStatement)stmt.unwrap(EmptyStatement.class)).isOpen);
			con.close();
			ConnectionProxyPool.shutdown();

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}
	
	@Test
	public void testCountOfStatements2() {
		try {
			ConnectionProxy con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			Statement stmt = con.createStatement();
			stmt = con.createStatement();
			assertEquals(2,con.getStatements().size());
			stmt.close();
			assertEquals(1,con.getStatements().size());
			assertFalse(((EmptyStatement)stmt.unwrap(EmptyStatement.class)).isOpen);
			con.close();
			ConnectionProxyPool.shutdown();

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}
	
	@Test
	public void testCountOfResultSets() {
		try {
			ConnectionProxy con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select");
			assertEquals(1,con.getResultSets().size());
			result.close();
			assertEquals(0,con.getResultSets().size());
			assertFalse(((EmptyResultSet)result.unwrap(EmptyResultSet.class)).isOpen);
			assertEquals(0,con.getStatements().size());
			assertFalse(((EmptyStatement)stmt.unwrap(EmptyStatement.class)).isOpen);
			con.close();
			ConnectionProxyPool.shutdown();

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}
	
	@Test
	public void testCountOfResultSets2() {
		try {
			ConnectionProxy con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			PreparedStatement stmt = con.prepareStatement("select");
			ResultSet result = stmt.executeQuery();
			assertEquals(1,con.getResultSets().size());
			result.close();
			assertEquals(0,con.getResultSets().size());
			assertFalse(((EmptyResultSet)result.unwrap(EmptyResultSet.class)).isOpen);
			assertEquals(1,con.getPereparedStatements().size());
			assertTrue(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);
			con.close();
			assertTrue(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);
			ConnectionProxyPool.shutdown();
			assertFalse(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}
	
	@Test
	public void testCountOfPreparedStatements() {
		try {
			ConnectionProxy con = ConnectionProxyPool.getConnection("test",new EmptyFabric("test"));
			PreparedStatement stmt = con.prepareStatement("select");
			ResultSet result = stmt.executeQuery();
			assertEquals(1,con.getPereparedStatements().size());
			result.close();
			stmt = con.prepareStatement("select");
			assertEquals(1,con.getPereparedStatements().size());
			
			assertEquals(0,con.getResultSets().size());
			assertFalse(((EmptyResultSet)result.unwrap(EmptyResultSet.class)).isOpen);
			assertEquals(1,con.getPereparedStatements().size());
			assertTrue(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);
			con.close();
			assertTrue(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);
			ConnectionProxyPool.shutdown();
			assertFalse(((EmptyPreparedStatement)stmt.unwrap(EmptyPreparedStatement.class)).isOpen);

		} catch (Exception ex) {
		    LOG.error(UNERWARTETE_AUSNAHME,ex);
			fail("Ausnahme aufgetreten");
		}
	}

}
