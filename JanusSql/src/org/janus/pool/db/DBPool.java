package org.janus.pool.db;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBPool {

	public ConnectionProxy create();

	public void destroy(ConnectionProxy proxy);

	public Connection createOriginal() throws SQLException;

}
