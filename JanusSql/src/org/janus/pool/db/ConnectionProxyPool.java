package org.janus.pool.db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.janus.pool.ShivaPool;

public class ConnectionProxyPool extends ShivaPool<ConnectionProxy> implements
		DBPool , DataSource {
	static Logger log = Logger.getLogger("ConnectionProxyPool");

	static HashMap<String, ConnectionProxyPool> pools = new HashMap<String, ConnectionProxyPool>();
	String resName;

	
	private PrintWriter logWriter = null;
	private int timeout;
	
	
	private ConnectionProxyPool(int normalCount, int maxCount, String name) {
		super(normalCount, maxCount, new ConnectionProxyFabric(name));
		((ConnectionProxyFabric) shiva).setPool(this);
		this.resName = name;
		log.debug("erzeuge ConnectionProxyPool " + name);
	}

	public String getResName() {
		return resName;
	}

	public static synchronized ConnectionProxy getConnection(String name) {
		ConnectionProxyPool pool = pools.get(name);
		if (pool == null) {
			pool = new ConnectionProxyPool(5, 20, name);
			pools.put(name, pool);
		}
		return pool.create();
	}

	public static synchronized void shutdown() {
		for (String key : pools.keySet()) {
			ConnectionProxyPool pool = pools.get(key);
			pool.destroyAll();
		}
		pools.clear();
	}

	public static void destroyAllConnections() {
		for (ConnectionProxyPool p : pools.values()) {
			p.destroyAll();
		}
	}

	public static void info() {
		for (ConnectionProxyPool p : pools.values()) {
			p.infoForPool();
		}
	}

	private void infoForPool() {
		if (log.isDebugEnabled()) {
			log.debug("Pool: " + resName + " Active Count: " + getActiveCount()
					+ " Inactive Count: " + getInActiveCount());
		}
	}

	@Override
	public Connection createOriginal() throws SQLException {
		return ((ConnectionProxyFabric) shiva).makeConnection();
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return logWriter;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		logWriter = out;
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		timeout = seconds;
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return timeout;
	}

	@Override
	public java.util.logging.Logger getParentLogger()
			throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return getConnection(resName);
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return null;
	}
}
