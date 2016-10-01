package org.janus.pool.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementProxy extends SimpleStatementProxy {
    ConnectionProxy connection;

    public StatementProxy(Statement original, ConnectionProxy connection) {
        super(original);
        this.connection = connection;
        connection.add(this);
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

    public Statement getStmt() {
        return original;
    }

}
