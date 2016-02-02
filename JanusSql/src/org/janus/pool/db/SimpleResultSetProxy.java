package org.janus.pool.db;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

import org.janus.lists.DoubleLinkedListElement;

public class SimpleResultSetProxy extends DoubleLinkedListElement implements
		ResultSet {
	protected ResultSet original;

	public SimpleResultSetProxy(ResultSet original) {
		super();
		if (original == null) {
			throw new IllegalArgumentException("Original darf nicht Nulls sein");
		}
		this.original = original;
	}

	@Override
	public boolean absolute(int arg0) throws SQLException {
		return original.absolute(arg0);
	}

	@Override
	public void afterLast() throws SQLException {
		original.afterLast();
	}

	@Override
	public void beforeFirst() throws SQLException {
		original.beforeFirst();
	}

	@Override
	public void cancelRowUpdates() throws SQLException {
		original.cancelRowUpdates();
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
	public void deleteRow() throws SQLException {
		original.deleteRow();
	}

	@Override
	public int findColumn(String arg0) throws SQLException {
		return original.findColumn(arg0);
	}

	@Override
	public boolean first() throws SQLException {
		return original.first();
	}

	@Override
	public Array getArray(int arg0) throws SQLException {
		return original.getArray(arg0);
	}

	@Override
	public Array getArray(String arg0) throws SQLException {
		return original.getArray(arg0);
	}

	@Override
	public InputStream getAsciiStream(int arg0) throws SQLException {
		return original.getAsciiStream(arg0);
	}

	@Override
	public InputStream getAsciiStream(String arg0) throws SQLException {
		return original.getAsciiStream(arg0);
	}

	@Override
	public BigDecimal getBigDecimal(int arg0, int arg1) throws SQLException {
		return original.getBigDecimal(arg0, arg1);
	}

	@Override
	public BigDecimal getBigDecimal(int arg0) throws SQLException {
		return original.getBigDecimal(arg0);
	}

	@Override
	public BigDecimal getBigDecimal(String arg0, int arg1) throws SQLException {
		return original.getBigDecimal(arg0, arg1);
	}

	@Override
	public BigDecimal getBigDecimal(String arg0) throws SQLException {
		return original.getBigDecimal(arg0);
	}

	@Override
	public InputStream getBinaryStream(int arg0) throws SQLException {
		return original.getBinaryStream(arg0);
	}

	@Override
	public InputStream getBinaryStream(String arg0) throws SQLException {
		return original.getBinaryStream(arg0);
	}

	@Override
	public Blob getBlob(int arg0) throws SQLException {
		return original.getBlob(arg0);
	}

	@Override
	public Blob getBlob(String arg0) throws SQLException {
		return original.getBlob(arg0);
	}

	@Override
	public boolean getBoolean(int arg0) throws SQLException {
		return original.getBoolean(arg0);
	}

	@Override
	public boolean getBoolean(String arg0) throws SQLException {
		return original.getBoolean(arg0);
	}

	@Override
	public byte getByte(int arg0) throws SQLException {
		return original.getByte(arg0);
	}

	@Override
	public byte getByte(String arg0) throws SQLException {
		return original.getByte(arg0);
	}

	@Override
	public byte[] getBytes(int arg0) throws SQLException {
		return original.getBytes(arg0);
	}

	@Override
	public byte[] getBytes(String arg0) throws SQLException {
		return original.getBytes(arg0);
	}

	@Override
	public Reader getCharacterStream(int arg0) throws SQLException {
		return original.getCharacterStream(arg0);
	}

	@Override
	public Reader getCharacterStream(String arg0) throws SQLException {
		return original.getCharacterStream(arg0);
	}

	@Override
	public Clob getClob(int arg0) throws SQLException {
		return original.getClob(arg0);
	}

	@Override
	public Clob getClob(String arg0) throws SQLException {
		return original.getClob(arg0);
	}

	@Override
	public int getConcurrency() throws SQLException {
		return original.getConcurrency();
	}

	@Override
	public String getCursorName() throws SQLException {
		return original.getCursorName();
	}

	@Override
	public Date getDate(int arg0, Calendar arg1) throws SQLException {
		return original.getDate(arg0, arg1);
	}

	@Override
	public Date getDate(int arg0) throws SQLException {
		return original.getDate(arg0);
	}

	@Override
	public Date getDate(String arg0, Calendar arg1) throws SQLException {
		return original.getDate(arg0, arg1);
	}

	@Override
	public Date getDate(String arg0) throws SQLException {
		return original.getDate(arg0);
	}

	@Override
	public double getDouble(int arg0) throws SQLException {
		return original.getDouble(arg0);
	}

	@Override
	public double getDouble(String arg0) throws SQLException {
		return original.getDouble(arg0);
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
	public float getFloat(int arg0) throws SQLException {
		return original.getFloat(arg0);
	}

	@Override
	public float getFloat(String arg0) throws SQLException {
		return original.getFloat(arg0);
	}

	@Override
	public int getHoldability() throws SQLException {
		return original.getHoldability();
	}

	@Override
	public int getInt(int arg0) throws SQLException {
		return original.getInt(arg0);
	}

	@Override
	public int getInt(String arg0) throws SQLException {
		return original.getInt(arg0);
	}

	@Override
	public long getLong(int arg0) throws SQLException {
		return original.getLong(arg0);
	}

	@Override
	public long getLong(String arg0) throws SQLException {
		return original.getLong(arg0);
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return original.getMetaData();
	}

	@Override
	public Reader getNCharacterStream(int arg0) throws SQLException {
		return original.getNCharacterStream(arg0);
	}

	@Override
	public Reader getNCharacterStream(String arg0) throws SQLException {
		return original.getNCharacterStream(arg0);
	}

	@Override
	public NClob getNClob(int arg0) throws SQLException {
		return original.getNClob(arg0);
	}

	@Override
	public NClob getNClob(String arg0) throws SQLException {
		return original.getNClob(arg0);
	}

	@Override
	public String getNString(int arg0) throws SQLException {
		return original.getNString(arg0);
	}

	@Override
	public String getNString(String arg0) throws SQLException {
		return original.getNString(arg0);
	}

	@Override
	public <T> T getObject(int arg0, Class<T> arg1) throws SQLException {
		return original.getObject(arg0, arg1);
	}

	@Override
	public Object getObject(int arg0, Map<String, Class<?>> arg1)
			throws SQLException {
		return original.getObject(arg0, arg1);
	}

	@Override
	public Object getObject(int arg0) throws SQLException {
		return original.getObject(arg0);
	}

	@Override
	public <T> T getObject(String arg0, Class<T> arg1) throws SQLException {
		return original.getObject(arg0, arg1);
	}

	@Override
	public Object getObject(String arg0, Map<String, Class<?>> arg1)
			throws SQLException {
		return original.getObject(arg0, arg1);
	}

	@Override
	public Object getObject(String arg0) throws SQLException {
		return original.getObject(arg0);
	}

	@Override
	public Ref getRef(int arg0) throws SQLException {
		return original.getRef(arg0);
	}

	@Override
	public Ref getRef(String arg0) throws SQLException {
		return original.getRef(arg0);
	}

	@Override
	public int getRow() throws SQLException {
		return original.getRow();
	}

	@Override
	public RowId getRowId(int arg0) throws SQLException {
		return original.getRowId(arg0);
	}

	@Override
	public RowId getRowId(String arg0) throws SQLException {
		return original.getRowId(arg0);
	}

	@Override
	public SQLXML getSQLXML(int arg0) throws SQLException {
		return original.getSQLXML(arg0);
	}

	@Override
	public SQLXML getSQLXML(String arg0) throws SQLException {
		return original.getSQLXML(arg0);
	}

	@Override
	public short getShort(int arg0) throws SQLException {
		return original.getShort(arg0);
	}

	@Override
	public short getShort(String arg0) throws SQLException {
		return original.getShort(arg0);
	}

	@Override
	public Statement getStatement() throws SQLException {
		return original.getStatement();
	}

	@Override
	public String getString(int arg0) throws SQLException {
		return original.getString(arg0);
	}

	@Override
	public String getString(String arg0) throws SQLException {
		return original.getString(arg0);
	}

	@Override
	public Time getTime(int arg0, Calendar arg1) throws SQLException {
		return original.getTime(arg0, arg1);
	}

	@Override
	public Time getTime(int arg0) throws SQLException {
		return original.getTime(arg0);
	}

	@Override
	public Time getTime(String arg0, Calendar arg1) throws SQLException {
		return original.getTime(arg0, arg1);
	}

	@Override
	public Time getTime(String arg0) throws SQLException {
		return original.getTime(arg0);
	}

	@Override
	public Timestamp getTimestamp(int arg0, Calendar arg1) throws SQLException {
		return original.getTimestamp(arg0, arg1);
	}

	@Override
	public Timestamp getTimestamp(int arg0) throws SQLException {
		return original.getTimestamp(arg0);
	}

	@Override
	public Timestamp getTimestamp(String arg0, Calendar arg1)
			throws SQLException {
		return original.getTimestamp(arg0, arg1);
	}

	@Override
	public Timestamp getTimestamp(String arg0) throws SQLException {
		return original.getTimestamp(arg0);
	}

	@Override
	public int getType() throws SQLException {
		return original.getType();
	}

	@Override
	public URL getURL(int arg0) throws SQLException {
		return original.getURL(arg0);
	}

	@Override
	public URL getURL(String arg0) throws SQLException {
		return original.getURL(arg0);
	}

	@Override
	public InputStream getUnicodeStream(int arg0) throws SQLException {
		return original.getUnicodeStream(arg0);
	}

	@Override
	public InputStream getUnicodeStream(String arg0) throws SQLException {
		return original.getUnicodeStream(arg0);
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return original.getWarnings();
	}

	@Override
	public void insertRow() throws SQLException {
		original.insertRow();
	}

	@Override
	public boolean isAfterLast() throws SQLException {
		return original.isAfterLast();
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		return original.isBeforeFirst();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return original.isClosed();
	}

	@Override
	public boolean isFirst() throws SQLException {
		return original.isFirst();
	}

	@Override
	public boolean isLast() throws SQLException {
		return original.isLast();
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return original.isWrapperFor(iface);
	}

	@Override
	public boolean last() throws SQLException {
		return original.last();
	}

	@Override
	public void moveToCurrentRow() throws SQLException {
		original.moveToCurrentRow();
	}

	@Override
	public void moveToInsertRow() throws SQLException {
		original.moveToInsertRow();
	}

	@Override
	public boolean next() throws SQLException {
		return original.next();
	}

	@Override
	public boolean previous() throws SQLException {
		return original.previous();
	}

	@Override
	public void refreshRow() throws SQLException {
		original.refreshRow();
	}

	@Override
	public boolean relative(int arg0) throws SQLException {
		return original.relative(arg0);
	}

	@Override
	public boolean rowDeleted() throws SQLException {
		return original.rowDeleted();
	}

	@Override
	public boolean rowInserted() throws SQLException {
		return original.rowInserted();
	}

	@Override
	public boolean rowUpdated() throws SQLException {
		return original.rowUpdated();
	}

	@Override
	public void setFetchDirection(int arg0) throws SQLException {
		original.setFetchDirection(arg0);
	}

	@Override
	public void setFetchSize(int arg0) throws SQLException {
		original.setFetchSize(arg0);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return iface.cast(original);
	}

	@Override
	public void updateArray(int arg0, Array arg1) throws SQLException {
		original.updateArray(arg0, arg1);
	}

	@Override
	public void updateArray(String arg0, Array arg1) throws SQLException {
		original.updateArray(arg0, arg1);
	}

	@Override
	public void updateAsciiStream(int arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void updateAsciiStream(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void updateAsciiStream(int arg0, InputStream arg1)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1);
	}

	@Override
	public void updateAsciiStream(String arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void updateAsciiStream(String arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1, arg2);
	}

	@Override
	public void updateAsciiStream(String arg0, InputStream arg1)
			throws SQLException {
		original.updateAsciiStream(arg0, arg1);
	}

	@Override
	public void updateBigDecimal(int arg0, BigDecimal arg1) throws SQLException {
		original.updateBigDecimal(arg0, arg1);
	}

	@Override
	public void updateBigDecimal(String arg0, BigDecimal arg1)
			throws SQLException {
		original.updateBigDecimal(arg0, arg1);
	}

	@Override
	public void updateBinaryStream(int arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void updateBinaryStream(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void updateBinaryStream(int arg0, InputStream arg1)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1);
	}

	@Override
	public void updateBinaryStream(String arg0, InputStream arg1, int arg2)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void updateBinaryStream(String arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1, arg2);
	}

	@Override
	public void updateBinaryStream(String arg0, InputStream arg1)
			throws SQLException {
		original.updateBinaryStream(arg0, arg1);
	}

	@Override
	public void updateBlob(int arg0, Blob arg1) throws SQLException {
		original.updateBlob(arg0, arg1);
	}

	@Override
	public void updateBlob(int arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateBlob(arg0, arg1, arg2);
	}

	@Override
	public void updateBlob(int arg0, InputStream arg1) throws SQLException {
		original.updateBlob(arg0, arg1);
	}

	@Override
	public void updateBlob(String arg0, Blob arg1) throws SQLException {
		original.updateBlob(arg0, arg1);
	}

	@Override
	public void updateBlob(String arg0, InputStream arg1, long arg2)
			throws SQLException {
		original.updateBlob(arg0, arg1, arg2);
	}

	@Override
	public void updateBlob(String arg0, InputStream arg1) throws SQLException {
		original.updateBlob(arg0, arg1);
	}

	@Override
	public void updateBoolean(int arg0, boolean arg1) throws SQLException {
		original.updateBoolean(arg0, arg1);
	}

	@Override
	public void updateBoolean(String arg0, boolean arg1) throws SQLException {
		original.updateBoolean(arg0, arg1);
	}

	@Override
	public void updateByte(int arg0, byte arg1) throws SQLException {
		original.updateByte(arg0, arg1);
	}

	@Override
	public void updateByte(String arg0, byte arg1) throws SQLException {
		original.updateByte(arg0, arg1);
	}

	@Override
	public void updateBytes(int arg0, byte[] arg1) throws SQLException {
		original.updateBytes(arg0, arg1);
	}

	@Override
	public void updateBytes(String arg0, byte[] arg1) throws SQLException {
		original.updateBytes(arg0, arg1);
	}

	@Override
	public void updateCharacterStream(int arg0, Reader arg1, int arg2)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateCharacterStream(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateCharacterStream(int arg0, Reader arg1)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1);
	}

	@Override
	public void updateCharacterStream(String arg0, Reader arg1, int arg2)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateCharacterStream(String arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateCharacterStream(String arg0, Reader arg1)
			throws SQLException {
		original.updateCharacterStream(arg0, arg1);
	}

	@Override
	public void updateClob(int arg0, Clob arg1) throws SQLException {
		original.updateClob(arg0, arg1);
	}

	@Override
	public void updateClob(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateClob(arg0, arg1, arg2);
	}

	@Override
	public void updateClob(int arg0, Reader arg1) throws SQLException {
		original.updateClob(arg0, arg1);
	}

	@Override
	public void updateClob(String arg0, Clob arg1) throws SQLException {
		original.updateClob(arg0, arg1);
	}

	@Override
	public void updateClob(String arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateClob(arg0, arg1, arg2);
	}

	@Override
	public void updateClob(String arg0, Reader arg1) throws SQLException {
		original.updateClob(arg0, arg1);
	}

	@Override
	public void updateDate(int arg0, Date arg1) throws SQLException {
		original.updateDate(arg0, arg1);
	}

	@Override
	public void updateDate(String arg0, Date arg1) throws SQLException {
		original.updateDate(arg0, arg1);
	}

	@Override
	public void updateDouble(int arg0, double arg1) throws SQLException {
		original.updateDouble(arg0, arg1);
	}

	@Override
	public void updateDouble(String arg0, double arg1) throws SQLException {
		original.updateDouble(arg0, arg1);
	}

	@Override
	public void updateFloat(int arg0, float arg1) throws SQLException {
		original.updateFloat(arg0, arg1);
	}

	@Override
	public void updateFloat(String arg0, float arg1) throws SQLException {
		original.updateFloat(arg0, arg1);
	}

	@Override
	public void updateInt(int arg0, int arg1) throws SQLException {
		original.updateInt(arg0, arg1);
	}

	@Override
	public void updateInt(String arg0, int arg1) throws SQLException {
		original.updateInt(arg0, arg1);
	}

	@Override
	public void updateLong(int arg0, long arg1) throws SQLException {
		original.updateLong(arg0, arg1);
	}

	@Override
	public void updateLong(String arg0, long arg1) throws SQLException {
		original.updateLong(arg0, arg1);
	}

	@Override
	public void updateNCharacterStream(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateNCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateNCharacterStream(int arg0, Reader arg1)
			throws SQLException {
		original.updateNCharacterStream(arg0, arg1);
	}

	@Override
	public void updateNCharacterStream(String arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateNCharacterStream(arg0, arg1, arg2);
	}

	@Override
	public void updateNCharacterStream(String arg0, Reader arg1)
			throws SQLException {
		original.updateNCharacterStream(arg0, arg1);
	}

	@Override
	public void updateNClob(int arg0, NClob arg1) throws SQLException {
		original.updateNClob(arg0, arg1);
	}

	@Override
	public void updateNClob(int arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateNClob(arg0, arg1, arg2);
	}

	@Override
	public void updateNClob(int arg0, Reader arg1) throws SQLException {
		original.updateNClob(arg0, arg1);
	}

	@Override
	public void updateNClob(String arg0, NClob arg1) throws SQLException {
		original.updateNClob(arg0, arg1);
	}

	@Override
	public void updateNClob(String arg0, Reader arg1, long arg2)
			throws SQLException {
		original.updateNClob(arg0, arg1, arg2);
	}

	@Override
	public void updateNClob(String arg0, Reader arg1) throws SQLException {
		original.updateNClob(arg0, arg1);
	}

	@Override
	public void updateNString(int arg0, String arg1) throws SQLException {
		original.updateNString(arg0, arg1);
	}

	@Override
	public void updateNString(String arg0, String arg1) throws SQLException {
		original.updateNString(arg0, arg1);
	}

	@Override
	public void updateNull(int arg0) throws SQLException {
		original.updateNull(arg0);
	}

	@Override
	public void updateNull(String arg0) throws SQLException {
		original.updateNull(arg0);
	}

	@Override
	public void updateObject(int arg0, Object arg1, int arg2)
			throws SQLException {
		original.updateObject(arg0, arg1, arg2);
	}

	@Override
	public void updateObject(int arg0, Object arg1) throws SQLException {
		original.updateObject(arg0, arg1);
	}

	@Override
	public void updateObject(String arg0, Object arg1, int arg2)
			throws SQLException {
		original.updateObject(arg0, arg1, arg2);
	}

	@Override
	public void updateObject(String arg0, Object arg1) throws SQLException {
		original.updateObject(arg0, arg1);
	}

	@Override
	public void updateRef(int arg0, Ref arg1) throws SQLException {
		original.updateRef(arg0, arg1);
	}

	@Override
	public void updateRef(String arg0, Ref arg1) throws SQLException {
		original.updateRef(arg0, arg1);
	}

	@Override
	public void updateRow() throws SQLException {
		original.updateRow();
	}

	@Override
	public void updateRowId(int arg0, RowId arg1) throws SQLException {
		original.updateRowId(arg0, arg1);
	}

	@Override
	public void updateRowId(String arg0, RowId arg1) throws SQLException {
		original.updateRowId(arg0, arg1);
	}

	@Override
	public void updateSQLXML(int arg0, SQLXML arg1) throws SQLException {
		original.updateSQLXML(arg0, arg1);
	}

	@Override
	public void updateSQLXML(String arg0, SQLXML arg1) throws SQLException {
		original.updateSQLXML(arg0, arg1);
	}

	@Override
	public void updateShort(int arg0, short arg1) throws SQLException {
		original.updateShort(arg0, arg1);
	}

	@Override
	public void updateShort(String arg0, short arg1) throws SQLException {
		original.updateShort(arg0, arg1);
	}

	@Override
	public void updateString(int arg0, String arg1) throws SQLException {
		original.updateString(arg0, arg1);
	}

	@Override
	public void updateString(String arg0, String arg1) throws SQLException {
		original.updateString(arg0, arg1);
	}

	@Override
	public void updateTime(int arg0, Time arg1) throws SQLException {
		original.updateTime(arg0, arg1);
	}

	@Override
	public void updateTime(String arg0, Time arg1) throws SQLException {
		original.updateTime(arg0, arg1);
	}

	@Override
	public void updateTimestamp(int arg0, Timestamp arg1) throws SQLException {
		original.updateTimestamp(arg0, arg1);
	}

	@Override
	public void updateTimestamp(String arg0, Timestamp arg1)
			throws SQLException {
		original.updateTimestamp(arg0, arg1);
	}

	@Override
	public boolean wasNull() throws SQLException {
		return original.wasNull();
	}

}
