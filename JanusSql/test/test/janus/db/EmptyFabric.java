package test.janus.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.janus.pool.db.ConnectionProxyFabric;

public class EmptyFabric extends ConnectionProxyFabric {

	public EmptyFabric(String name) {
		super(name);
	}

	public synchronized Connection makeConnection() throws SQLException {
		return new EmptyConnection();
	}
}
