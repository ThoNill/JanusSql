package org.janus.pool.db;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatementProxy extends SimpleCallableStatementProxy {
	ConnectionProxy connection;
	String stmtString;

	public CallableStatementProxy(CallableStatement original,
			ConnectionProxy connection, String stmtString) {
		super(original);
		this.connection = connection;
		connection.add(this);
		this.stmtString = stmtString;
	}

	@Override
	public void close() throws SQLException {
		connection.remove(this);
		super.close();
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		return new ResultSetProxy(super.executeQuery(sql), connection, sql,
				this);
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		return new ResultSetProxy(super.executeQuery(), connection, stmtString,
				this);
	}

	public Statement getStmt() {
		return original;
	}

	@Override
	public String toString() {
		return "CallableStatementProxy [stmtString=" + stmtString + "]";
	}
}
