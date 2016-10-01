package org.janus.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ResultSet2HashMap implements
        ResultSet2ObjectConverter<HashMap<String, Object>> {

    private String names[];

    public ResultSet2HashMap(String[] names) {
        super();
        this.names = names;
    }

    @Override
    public HashMap<String, Object> newObject(ResultSet result)
            throws SQLException {
        HashMap<String, Object> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], result.getObject(i + 1));
        }
        return map;
    }

}
