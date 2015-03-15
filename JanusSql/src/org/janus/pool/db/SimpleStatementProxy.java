package org.janus.pool.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import org.janus.lists.DoubleLinkedListElement;

public class SimpleStatementProxy extends DoubleLinkedListElement implements
		Statement {
	protected Statement original;

	public SimpleStatementProxy(Statement original) {
		super();
		if (original == null) {
			throw new IllegalArgumentException("Original darf nicht Nulls sein");
		}
		this.original = original;
	}

	@Override
	public void addBatch(String sql) throws SQLException {
		original.addBatch(sql);
	}

	@Override
	public void cancel() throws SQLException {
		original.cancel();
	}

	@Override
	public void clearBatch() throws SQLException {
		original.clearBatch();
	}

	@Override
	public void clearWarnings() throws SQLException {
		original.clearWarnings();
	}

	@Override
	public void close() throws SQLException {
		original.close();
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		original.closeOnCompletion();
	}

	@Override
	public boolean execute(String sql, int autoGeneratedKeys)
			throws SQLException {
		return original.execute(sql, autoGeneratedKeys);
	}

	@Override
	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		return original.execute(sql, columnIndexes);
	}

	@Override
	public boolean execute(String sql, String[] columnNames)
			throws SQLException {
		return original.execute(sql, columnNames);
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		return original.execute(sql);
	}

	@Override
	public int[] executeBatch() throws SQLException {
		return original.executeBatch();
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		return original.executeQuery(sql);
	}

	@Override
	public int executeUpdate(String sql, int autoGeneratedKeys)
			throws SQLException {
		return original.executeUpdate(sql, autoGeneratedKeys);
	}

	@Override
	public int executeUpdate(String sql, int[] columnIndexes)
			throws SQLException {
		return original.executeUpdate(sql, columnIndexes);
	}

	@Override
	public int executeUpdate(String sql, String[] columnNames)
			throws SQLException {
		return original.executeUpdate(sql, columnNames);
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		return original.executeUpdate(sql);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return original.getConnection();
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return original.getFetchDirection();
	}

	@Override
	public int getFetchSize() throws SQLException {
		return original.getFetchSize();
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return original.getGeneratedKeys();
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		return original.getMaxFieldSize();
	}

	@Override
	public int getMaxRows() throws SQLException {
		return original.getMaxRows();
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		return original.getMoreResults();
	}

	@Override
	public boolean getMoreResults(int current) throws SQLException {
		return original.getMoreResults(current);
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		return original.getQueryTimeout();
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		return original.getResultSet();
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		return original.getResultSetConcurrency();
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return original.getResultSetHoldability();
	}

	@Override
	public int getResultSetType() throws SQLException {
		return original.getResultSetType();
	}

	@Override
	public int getUpdateCount() throws SQLException {
		return original.getUpdateCount();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return original.getWarnings();
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		return original.isCloseOnCompletion();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return original.isClosed();
	}

	@Override
	public boolean isPoolable() throws SQLException {
		return original.isPoolable();
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return original.isWrapperFor(iface);
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		original.setCursorName(name);
	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		original.setEscapeProcessing(enable);
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		original.setFetchDirection(direction);
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		original.setFetchSize(rows);
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
		original.setMaxFieldSize(max);
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		original.setMaxRows(max);
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		original.setPoolable(poolable);
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		original.setQueryTimeout(seconds);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return original.unwrap(iface);
	}

}