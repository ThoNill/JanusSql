package org.janus.pool.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementProxy extends SimplePreparedStatementProxy {
	private ConnectionProxy connection;
	private String stmtString;
	private ResultSet bisher = null;

	public PreparedStatementProxy(PreparedStatement original,
			ConnectionProxy connection, String stmtString) {
		super(original);
		this.connection = connection;
		connection.add(this);
		this.stmtString = stmtString;
	}

	public String getStmtString() {
		return stmtString;
	}

	@Override
	public void close() throws SQLException {
		connection.remove(this);
		super.close();
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		closeBisherigesResultSet();
		bisher = new ResultSetProxy(super.executeQuery(sql), connection,stmtString);
		return bisher;
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		closeBisherigesResultSet();
		bisher = new ResultSetProxy(super.executeQuery(),connection,stmtString);
		return bisher;
	}

	public Statement getStmt() {
		return original;
	}

	@Override
	public String toString() {
		return "PreparedStatementProxy [stmtString=" + stmtString + "]";
	}

	private void closeBisherigesResultSet() throws SQLException {
		if (bisher != null) {
			bisher.close();
		}
	}
}
