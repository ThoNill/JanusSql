package org.janus.pool.db;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import org.janus.lists.DoubleLinkedListElement;

public class SimplePreparedStatementProxy extends DoubleLinkedListElement
		implements PreparedStatement {
	protected PreparedStatement original;

	public SimplePreparedStatementProxy(PreparedStatement original) {
		super();
		if (original == null) {
			throw new IllegalArgumentException("Original darf nicht Nulls sein");
		}
		this.original = original;
	}

	@Override
	public void addBatch() throws SQLException {
		original.addBatch();
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
	public void clearParameters() throws SQLException {
		original.clearParameters();
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
	public boolean execute() throws SQLException {
		return original.execute();
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
	public ResultSet executeQuery() throws SQLException {
		return original.executeQuery();
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		return original.executeQuery(sql);
	}

	@Override
	public int executeUpdate() throws SQLException {
		return original.executeUpdate();
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
	public ResultSetMetaData getMetaData() throws SQLException {
		return original.getMetaData();
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
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return original.getParameterMetaData();
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
	public void setArray(int arg0, Array arg1) throws SQLException {
		original.setArray(arg0, arg1);
	}

	@Override
	public void setAsciiStream(int arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.setAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void setAsciiStream(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.setAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void setAsciiStream(int arg0, InputStream arg1) throws SQLException {
		original.setAsciiStream(arg0, arg1);
	}

	@Override
	public void setBigDecimal(int arg0, BigDecimal arg1) throws SQLException {
		original.setBigDecimal(arg0, arg1);
	}

	@Override
	public void setBinaryStream(int arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.setBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void setBinaryStream(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.setBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void setBinaryStream(int arg0, InputStream arg1) throws SQLException {
		original.setBinaryStream(arg0, arg1);
	}

	@Override
	public void setBlob(int arg0, Blob arg1) throws SQLException {
		original.setBlob(arg0, arg1);
	}

	@Override
	public void setBlob(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.setBlob(arg0, arg1, arg2);
	}

	@Override
	public void setBlob(int arg0, InputStream arg1) throws SQLException {
		original.setBlob(arg0, arg1);
	}

	@Override
	public void setBoolean(int arg0, boolean arg1) throws SQLException {
		original.setBoolean(arg0, arg1);
	}

	@Override
	public void setByte(int arg0, byte arg1) throws SQLException {
		original.setByte(arg0, arg1);
	}

	@Override
	public void setBytes(int arg0, byte[] arg1) throws SQLException {
		original.setBytes(arg0, arg1);
	}

	@Override
	public void setCharacterStream(int arg0, Reader arg1, int arg2)
			throws SQLException {
		original.setCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void setCharacterStream(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.setCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void setCharacterStream(int arg0, Reader arg1) throws SQLException {
		original.setCharacterStream(arg0, arg1);
	}

	@Override
	public void setClob(int arg0, Clob arg1) throws SQLException {
		original.setClob(arg0, arg1);
	}

	@Override
	public void setClob(int arg0, Reader arg1, long arg2) throws SQLException {
		original.setClob(arg0, arg1, arg2);
	}

	@Override
	public void setClob(int arg0, Reader arg1) throws SQLException {
		original.setClob(arg0, arg1);
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		original.setCursorName(name);
	}

	@Override
	public void setDate(int arg0, Date arg1, Calendar arg2) throws SQLException {
		original.setDate(arg0, arg1, arg2);
	}

	@Override
	public void setDate(int arg0, Date arg1) throws SQLException {
		original.setDate(arg0, arg1);
	}

	@Override
	public void setDouble(int arg0, double arg1) throws SQLException {
		original.setDouble(arg0, arg1);
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
	public void setFloat(int arg0, float arg1) throws SQLException {
		original.setFloat(arg0, arg1);
	}

	@Override
	public void setInt(int arg0, int arg1) throws SQLException {
		original.setInt(arg0, arg1);
	}

	@Override
	public void setLong(int arg0, long arg1) throws SQLException {
		original.setLong(arg0, arg1);
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
	public void setNCharacterStream(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.setNCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void setNCharacterStream(int arg0, Reader arg1) throws SQLException {
		original.setNCharacterStream(arg0, arg1);
	}

	@Override
	public void setNClob(int arg0, NClob arg1) throws SQLException {
		original.setNClob(arg0, arg1);
	}

	@Override
	public void setNClob(int arg0, Reader arg1, long arg2) throws SQLException {
		original.setNClob(arg0, arg1, arg2);
	}

	@Override
	public void setNClob(int arg0, Reader arg1) throws SQLException {
		original.setNClob(arg0, arg1);
	}

	@Override
	public void setNString(int arg0, String arg1) throws SQLException {
		original.setNString(arg0, arg1);
	}

	@Override
	public void setNull(int arg0, int arg1, String arg2) throws SQLException {
		original.setNull(arg0, arg1, arg2);
	}

	@Override
	public void setNull(int arg0, int arg1) throws SQLException {
		original.setNull(arg0, arg1);
	}

	@Override
	public void setObject(int arg0, Object arg1, int arg2, int arg3)
			throws SQLException {
		original.setObject(arg0, arg1, arg2, arg3);
	}

	@Override
	public void setObject(int arg0, Object arg1, int arg2) throws SQLException {
		original.setObject(arg0, arg1, arg2);
	}

	@Override
	public void setObject(int arg0, Object arg1) throws SQLException {
		original.setObject(arg0, arg1);
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
	public void setRef(int arg0, Ref arg1) throws SQLException {
		original.setRef(arg0, arg1);
	}

	@Override
	public void setRowId(int arg0, RowId arg1) throws SQLException {
		original.setRowId(arg0, arg1);
	}

	@Override
	public void setSQLXML(int arg0, SQLXML arg1) throws SQLException {
		original.setSQLXML(arg0, arg1);
	}

	@Override
	public void setShort(int arg0, short arg1) throws SQLException {
		original.setShort(arg0, arg1);
	}

	@Override
	public void setString(int arg0, String arg1) throws SQLException {
		original.setString(arg0, arg1);
	}

	@Override
	public void setTime(int arg0, Time arg1, Calendar arg2) throws SQLException {
		original.setTime(arg0, arg1, arg2);
	}

	@Override
	public void setTime(int arg0, Time arg1) throws SQLException {
		original.setTime(arg0, arg1);
	}

	@Override
	public void setTimestamp(int arg0, Timestamp arg1, Calendar arg2)
			throws SQLException {
		original.setTimestamp(arg0, arg1, arg2);
	}

	@Override
	public void setTimestamp(int arg0, Timestamp arg1) throws SQLException {
		original.setTimestamp(arg0, arg1);
	}

	@Override
	public void setURL(int arg0, URL arg1) throws SQLException {
		original.setURL(arg0, arg1);
	}

	@Override
	public void setUnicodeStream(int arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.setUnicodeStream(arg0, arg1, arg2);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return original.unwrap(iface);
	}

}
