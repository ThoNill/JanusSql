package org.janus.pool.db;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
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
import java.util.Map;

import org.janus.lists.DoubleLinkedListElement;

public class SimpleCallableStatementProxy extends DoubleLinkedListElement
		implements CallableStatement {
	protected CallableStatement original;

	public SimpleCallableStatementProxy(CallableStatement original) {
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
	public void addBatch(String arg0) throws SQLException {
		original.addBatch(arg0);
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
	public boolean execute(String arg0, int arg1) throws SQLException {
		return original.execute(arg0, arg1);
	}

	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		return original.execute(arg0, arg1);
	}

	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		return original.execute(arg0, arg1);
	}

	@Override
	public boolean execute(String arg0) throws SQLException {
		return original.execute(arg0);
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
	public ResultSet executeQuery(String arg0) throws SQLException {
		return original.executeQuery(arg0);
	}

	@Override
	public int executeUpdate() throws SQLException {
		return original.executeUpdate();
	}

	@Override
	public int executeUpdate(String arg0, int arg1) throws SQLException {
		return original.executeUpdate(arg0, arg1);
	}

	@Override
	public int executeUpdate(String arg0, int[] arg1) throws SQLException {
		return original.executeUpdate(arg0, arg1);
	}

	@Override
	public int executeUpdate(String arg0, String[] arg1) throws SQLException {
		return original.executeUpdate(arg0, arg1);
	}

	@Override
	public int executeUpdate(String arg0) throws SQLException {
		return original.executeUpdate(arg0);
	}

	@Override
	public Array getArray(int parameterIndex) throws SQLException {
		return original.getArray(parameterIndex);
	}

	@Override
	public Array getArray(String parameterName) throws SQLException {
		return original.getArray(parameterName);
	}

	@Override
	public BigDecimal getBigDecimal(int parameterIndex, int scale)
			throws SQLException {
		return original.getBigDecimal(parameterIndex, scale);
	}

	@Override
	public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
		return original.getBigDecimal(parameterIndex);
	}

	@Override
	public BigDecimal getBigDecimal(String parameterName) throws SQLException {
		return original.getBigDecimal(parameterName);
	}

	@Override
	public Blob getBlob(int parameterIndex) throws SQLException {
		return original.getBlob(parameterIndex);
	}

	@Override
	public Blob getBlob(String parameterName) throws SQLException {
		return original.getBlob(parameterName);
	}

	@Override
	public boolean getBoolean(int parameterIndex) throws SQLException {
		return original.getBoolean(parameterIndex);
	}

	@Override
	public boolean getBoolean(String parameterName) throws SQLException {
		return original.getBoolean(parameterName);
	}

	@Override
	public byte getByte(int parameterIndex) throws SQLException {
		return original.getByte(parameterIndex);
	}

	@Override
	public byte getByte(String parameterName) throws SQLException {
		return original.getByte(parameterName);
	}

	@Override
	public byte[] getBytes(int parameterIndex) throws SQLException {
		return original.getBytes(parameterIndex);
	}

	@Override
	public byte[] getBytes(String parameterName) throws SQLException {
		return original.getBytes(parameterName);
	}

	@Override
	public Reader getCharacterStream(int parameterIndex) throws SQLException {
		return original.getCharacterStream(parameterIndex);
	}

	@Override
	public Reader getCharacterStream(String parameterName) throws SQLException {
		return original.getCharacterStream(parameterName);
	}

	@Override
	public Clob getClob(int parameterIndex) throws SQLException {
		return original.getClob(parameterIndex);
	}

	@Override
	public Clob getClob(String parameterName) throws SQLException {
		return original.getClob(parameterName);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return original.getConnection();
	}

	@Override
	public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
		return original.getDate(parameterIndex, cal);
	}

	@Override
	public Date getDate(int parameterIndex) throws SQLException {
		return original.getDate(parameterIndex);
	}

	@Override
	public Date getDate(String parameterName, Calendar cal) throws SQLException {
		return original.getDate(parameterName, cal);
	}

	@Override
	public Date getDate(String parameterName) throws SQLException {
		return original.getDate(parameterName);
	}

	@Override
	public double getDouble(int parameterIndex) throws SQLException {
		return original.getDouble(parameterIndex);
	}

	@Override
	public double getDouble(String parameterName) throws SQLException {
		return original.getDouble(parameterName);
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
	public float getFloat(int parameterIndex) throws SQLException {
		return original.getFloat(parameterIndex);
	}

	@Override
	public float getFloat(String parameterName) throws SQLException {
		return original.getFloat(parameterName);
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return original.getGeneratedKeys();
	}

	@Override
	public int getInt(int parameterIndex) throws SQLException {
		return original.getInt(parameterIndex);
	}

	@Override
	public int getInt(String parameterName) throws SQLException {
		return original.getInt(parameterName);
	}

	@Override
	public long getLong(int parameterIndex) throws SQLException {
		return original.getLong(parameterIndex);
	}

	@Override
	public long getLong(String parameterName) throws SQLException {
		return original.getLong(parameterName);
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
	public boolean getMoreResults(int arg0) throws SQLException {
		return original.getMoreResults(arg0);
	}

	@Override
	public Reader getNCharacterStream(int parameterIndex) throws SQLException {
		return original.getNCharacterStream(parameterIndex);
	}

	@Override
	public Reader getNCharacterStream(String parameterName) throws SQLException {
		return original.getNCharacterStream(parameterName);
	}

	@Override
	public NClob getNClob(int parameterIndex) throws SQLException {
		return original.getNClob(parameterIndex);
	}

	@Override
	public NClob getNClob(String parameterName) throws SQLException {
		return original.getNClob(parameterName);
	}

	@Override
	public String getNString(int parameterIndex) throws SQLException {
		return original.getNString(parameterIndex);
	}

	@Override
	public String getNString(String parameterName) throws SQLException {
		return original.getNString(parameterName);
	}

	@Override
	public <T> T getObject(int parameterIndex, Class<T> type)
			throws SQLException {
		return original.getObject(parameterIndex, type);
	}

	@Override
	public Object getObject(int parameterIndex, Map<String, Class<?>> map)
			throws SQLException {
		return original.getObject(parameterIndex, map);
	}

	@Override
	public Object getObject(int parameterIndex) throws SQLException {
		return original.getObject(parameterIndex);
	}

	@Override
	public <T> T getObject(String parameterName, Class<T> type)
			throws SQLException {
		return original.getObject(parameterName, type);
	}

	@Override
	public Object getObject(String parameterName, Map<String, Class<?>> map)
			throws SQLException {
		return original.getObject(parameterName, map);
	}

	@Override
	public Object getObject(String parameterName) throws SQLException {
		return original.getObject(parameterName);
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
	public Ref getRef(int parameterIndex) throws SQLException {
		return original.getRef(parameterIndex);
	}

	@Override
	public Ref getRef(String parameterName) throws SQLException {
		return original.getRef(parameterName);
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
	public RowId getRowId(int parameterIndex) throws SQLException {
		return original.getRowId(parameterIndex);
	}

	@Override
	public RowId getRowId(String parameterName) throws SQLException {
		return original.getRowId(parameterName);
	}

	@Override
	public SQLXML getSQLXML(int parameterIndex) throws SQLException {
		return original.getSQLXML(parameterIndex);
	}

	@Override
	public SQLXML getSQLXML(String parameterName) throws SQLException {
		return original.getSQLXML(parameterName);
	}

	@Override
	public short getShort(int parameterIndex) throws SQLException {
		return original.getShort(parameterIndex);
	}

	@Override
	public short getShort(String parameterName) throws SQLException {
		return original.getShort(parameterName);
	}

	@Override
	public String getString(int parameterIndex) throws SQLException {
		return original.getString(parameterIndex);
	}

	@Override
	public String getString(String parameterName) throws SQLException {
		return original.getString(parameterName);
	}

	@Override
	public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
		return original.getTime(parameterIndex, cal);
	}

	@Override
	public Time getTime(int parameterIndex) throws SQLException {
		return original.getTime(parameterIndex);
	}

	@Override
	public Time getTime(String parameterName, Calendar cal) throws SQLException {
		return original.getTime(parameterName, cal);
	}

	@Override
	public Time getTime(String parameterName) throws SQLException {
		return original.getTime(parameterName);
	}

	@Override
	public Timestamp getTimestamp(int parameterIndex, Calendar cal)
			throws SQLException {
		return original.getTimestamp(parameterIndex, cal);
	}

	@Override
	public Timestamp getTimestamp(int parameterIndex) throws SQLException {
		return original.getTimestamp(parameterIndex);
	}

	@Override
	public Timestamp getTimestamp(String parameterName, Calendar cal)
			throws SQLException {
		return original.getTimestamp(parameterName, cal);
	}

	@Override
	public Timestamp getTimestamp(String parameterName) throws SQLException {
		return original.getTimestamp(parameterName);
	}

	@Override
	public URL getURL(int parameterIndex) throws SQLException {
		return original.getURL(parameterIndex);
	}

	@Override
	public URL getURL(String parameterName) throws SQLException {
		return original.getURL(parameterName);
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
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		return original.isWrapperFor(arg0);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType, int scale)
			throws SQLException {
		original.registerOutParameter(parameterIndex, sqlType, scale);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType,
			String typeName) throws SQLException {
		original.registerOutParameter(parameterIndex, sqlType, typeName);
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType)
			throws SQLException {
		original.registerOutParameter(parameterIndex, sqlType);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType,
			int scale) throws SQLException {
		original.registerOutParameter(parameterName, sqlType, scale);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType,
			String typeName) throws SQLException {
		original.registerOutParameter(parameterName, sqlType, typeName);
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType)
			throws SQLException {
		original.registerOutParameter(parameterName, sqlType);
	}

	@Override
	public void setArray(int parameterIndex, Array x) throws SQLException {
		original.setArray(parameterIndex, x);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		original.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
		original.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x)
			throws SQLException {
		original.setAsciiStream(parameterIndex, x);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, int length)
			throws SQLException {
		original.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length)
			throws SQLException {
		original.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x)
			throws SQLException {
		original.setAsciiStream(parameterName, x);
	}

	@Override
	public void setBigDecimal(int parameterIndex, BigDecimal x)
			throws SQLException {
		original.setBigDecimal(parameterIndex, x);
	}

	@Override
	public void setBigDecimal(String parameterName, BigDecimal x)
			throws SQLException {
		original.setBigDecimal(parameterName, x);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		original.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
		original.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x)
			throws SQLException {
		original.setBinaryStream(parameterIndex, x);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, int length)
			throws SQLException {
		original.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length)
			throws SQLException {
		original.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x)
			throws SQLException {
		original.setBinaryStream(parameterName, x);
	}

	@Override
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		original.setBlob(parameterIndex, x);
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length)
			throws SQLException {
		original.setBlob(parameterIndex, inputStream, length);
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream)
			throws SQLException {
		original.setBlob(parameterIndex, inputStream);
	}

	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {
		original.setBlob(parameterName, x);
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream,
			long length) throws SQLException {
		original.setBlob(parameterName, inputStream, length);
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream)
			throws SQLException {
		original.setBlob(parameterName, inputStream);
	}

	@Override
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		original.setBoolean(parameterIndex, x);
	}

	@Override
	public void setBoolean(String parameterName, boolean x) throws SQLException {
		original.setBoolean(parameterName, x);
	}

	@Override
	public void setByte(int parameterIndex, byte x) throws SQLException {
		original.setByte(parameterIndex, x);
	}

	@Override
	public void setByte(String parameterName, byte x) throws SQLException {
		original.setByte(parameterName, x);
	}

	@Override
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		original.setBytes(parameterIndex, x);
	}

	@Override
	public void setBytes(String parameterName, byte[] x) throws SQLException {
		original.setBytes(parameterName, x);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, int length)
			throws SQLException {
		original.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader,
			long length) throws SQLException {
		original.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader)
			throws SQLException {
		original.setCharacterStream(parameterIndex, reader);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader,
			int length) throws SQLException {
		original.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader,
			long length) throws SQLException {
		original.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader)
			throws SQLException {
		original.setCharacterStream(parameterName, reader);
	}

	@Override
	public void setClob(int parameterIndex, Clob x) throws SQLException {
		original.setClob(parameterIndex, x);
	}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
		original.setClob(parameterIndex, reader, length);
	}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		original.setClob(parameterIndex, reader);
	}

	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {
		original.setClob(parameterName, x);
	}

	@Override
	public void setClob(String parameterName, Reader reader, long length)
			throws SQLException {
		original.setClob(parameterName, reader, length);
	}

	@Override
	public void setClob(String parameterName, Reader reader)
			throws SQLException {
		original.setClob(parameterName, reader);
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		original.setCursorName(name);
	}

	@Override
	public void setDate(int parameterIndex, Date x, Calendar cal)
			throws SQLException {
		original.setDate(parameterIndex, x, cal);
	}

	@Override
	public void setDate(int parameterIndex, Date x) throws SQLException {
		original.setDate(parameterIndex, x);
	}

	@Override
	public void setDate(String parameterName, Date x, Calendar cal)
			throws SQLException {
		original.setDate(parameterName, x, cal);
	}

	@Override
	public void setDate(String parameterName, Date x) throws SQLException {
		original.setDate(parameterName, x);
	}

	@Override
	public void setDouble(int parameterIndex, double x) throws SQLException {
		original.setDouble(parameterIndex, x);
	}

	@Override
	public void setDouble(String parameterName, double x) throws SQLException {
		original.setDouble(parameterName, x);
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
	public void setFloat(int parameterIndex, float x) throws SQLException {
		original.setFloat(parameterIndex, x);
	}

	@Override
	public void setFloat(String parameterName, float x) throws SQLException {
		original.setFloat(parameterName, x);
	}

	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
		original.setInt(parameterIndex, x);
	}

	@Override
	public void setInt(String parameterName, int x) throws SQLException {
		original.setInt(parameterName, x);
	}

	@Override
	public void setLong(int parameterIndex, long x) throws SQLException {
		original.setLong(parameterIndex, x);
	}

	@Override
	public void setLong(String parameterName, long x) throws SQLException {
		original.setLong(parameterName, x);
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
	public void setNCharacterStream(int parameterIndex, Reader value,
			long length) throws SQLException {
		original.setNCharacterStream(parameterIndex, value, length);
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value)
			throws SQLException {
		original.setNCharacterStream(parameterIndex, value);
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value,
			long length) throws SQLException {
		original.setNCharacterStream(parameterName, value, length);
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value)
			throws SQLException {
		original.setNCharacterStream(parameterName, value);
	}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		original.setNClob(parameterIndex, value);
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
		original.setNClob(parameterIndex, reader, length);
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		original.setNClob(parameterIndex, reader);
	}

	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {
		original.setNClob(parameterName, value);
	}

	@Override
	public void setNClob(String parameterName, Reader reader, long length)
			throws SQLException {
		original.setNClob(parameterName, reader, length);
	}

	@Override
	public void setNClob(String parameterName, Reader reader)
			throws SQLException {
		original.setNClob(parameterName, reader);
	}

	@Override
	public void setNString(int parameterIndex, String value)
			throws SQLException {
		original.setNString(parameterIndex, value);
	}

	@Override
	public void setNString(String parameterName, String value)
			throws SQLException {
		original.setNString(parameterName, value);
	}

	@Override
	public void setNull(int parameterIndex, int sqlType, String typeName)
			throws SQLException {
		original.setNull(parameterIndex, sqlType, typeName);
	}

	@Override
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		original.setNull(parameterIndex, sqlType);
	}

	@Override
	public void setNull(String parameterName, int sqlType, String typeName)
			throws SQLException {
		original.setNull(parameterName, sqlType, typeName);
	}

	@Override
	public void setNull(String parameterName, int sqlType) throws SQLException {
		original.setNull(parameterName, sqlType);
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType,
			int scaleOrLength) throws SQLException {
		original.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType)
			throws SQLException {
		original.setObject(parameterIndex, x, targetSqlType);
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
		original.setObject(parameterIndex, x);
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType,
			int scale) throws SQLException {
		original.setObject(parameterName, x, targetSqlType, scale);
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType)
			throws SQLException {
		original.setObject(parameterName, x, targetSqlType);
	}

	@Override
	public void setObject(String parameterName, Object x) throws SQLException {
		original.setObject(parameterName, x);
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
	public void setRef(int parameterIndex, Ref x) throws SQLException {
		original.setRef(parameterIndex, x);
	}

	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		original.setRowId(parameterIndex, x);
	}

	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {
		original.setRowId(parameterName, x);
	}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject)
			throws SQLException {
		original.setSQLXML(parameterIndex, xmlObject);
	}

	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject)
			throws SQLException {
		original.setSQLXML(parameterName, xmlObject);
	}

	@Override
	public void setShort(int parameterIndex, short x) throws SQLException {
		original.setShort(parameterIndex, x);
	}

	@Override
	public void setShort(String parameterName, short x) throws SQLException {
		original.setShort(parameterName, x);
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
		original.setString(parameterIndex, x);
	}

	@Override
	public void setString(String parameterName, String x) throws SQLException {
		original.setString(parameterName, x);
	}

	@Override
	public void setTime(int parameterIndex, Time x, Calendar cal)
			throws SQLException {
		original.setTime(parameterIndex, x, cal);
	}

	@Override
	public void setTime(int parameterIndex, Time x) throws SQLException {
		original.setTime(parameterIndex, x);
	}

	@Override
	public void setTime(String parameterName, Time x, Calendar cal)
			throws SQLException {
		original.setTime(parameterName, x, cal);
	}

	@Override
	public void setTime(String parameterName, Time x) throws SQLException {
		original.setTime(parameterName, x);
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
			throws SQLException {
		original.setTimestamp(parameterIndex, x, cal);
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x)
			throws SQLException {
		original.setTimestamp(parameterIndex, x);
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x, Calendar cal)
			throws SQLException {
		original.setTimestamp(parameterName, x, cal);
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x)
			throws SQLException {
		original.setTimestamp(parameterName, x);
	}

	@Override
	public void setURL(int parameterIndex, URL x) throws SQLException {
		original.setURL(parameterIndex, x);
	}

	@Override
	public void setURL(String parameterName, URL val) throws SQLException {
		original.setURL(parameterName, val);
	}

	@Override
	public void setUnicodeStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		original.setUnicodeStream(parameterIndex, x, length);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return original.unwrap(iface);
	}

	@Override
	public boolean wasNull() throws SQLException {
		return original.wasNull();
	}

}
