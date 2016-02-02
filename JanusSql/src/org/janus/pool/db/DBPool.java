package org.janus.pool.db;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBPool {
	String getResName();	

	ConnectionProxy create();

	void destroy(ConnectionProxy proxy);

	Connection createOriginal() throws SQLException;

}
