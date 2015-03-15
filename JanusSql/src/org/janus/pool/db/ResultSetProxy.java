package org.janus.pool.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetProxy extends SimpleResultSetProxy {
	Statement stmt = null;
	ConnectionProxy connection = null;
	String stmtString;
	boolean closeStatement = false;
	boolean open = true;

	public ResultSetProxy(ResultSet original, Statement stmt,
			ConnectionProxy connection, String stmtString,
			boolean closeStatement) {
		super(original);
		this.stmt = stmt;
		this.connection = connection;
		this.stmtString = stmtString;
		this.closeStatement = closeStatement;
		connection.add(this);
	}

	@Override
	public void close() throws SQLException {
		if (open) {
			open = false;
			connection.remove(this);
			super.close();
			if (closeStatement) {
				stmt.close();
			}
		}
	}

	@Override
	public String toString() {
		return "ResultSetProxy [stmtString=" + stmtString + "]";
	}
}
