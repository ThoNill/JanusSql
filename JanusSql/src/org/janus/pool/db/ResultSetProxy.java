package org.janus.pool.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetProxy extends SimpleResultSetProxy {
	Statement stmt = null;
	ConnectionProxy connection = null;
	String stmtString;
	boolean open = true;

	public ResultSetProxy(ResultSet original,
			ConnectionProxy connection, String stmtString,Statement stmt) {
		super(original);
		this.stmt = stmt;
		this.connection = connection;
		this.stmtString = stmtString;
		connection.add(this);
	}
	
	public ResultSetProxy(ResultSet original,
			ConnectionProxy connection, String stmtString) {
		this(original,connection,stmtString,null);
	}

	@Override
	public void close() throws SQLException {
		if (open) {
			open = false;
			connection.remove(this);
			super.close();
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	@Override
	public String toString() {
		return "ResultSetProxy [stmtString=" + stmtString + "]";
	}
}
