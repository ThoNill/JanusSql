package org.janus.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSet2ObjectConverter<K> {
    K newObject(ResultSet result) throws SQLException;
}
