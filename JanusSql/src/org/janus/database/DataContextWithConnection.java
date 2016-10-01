package org.janus.database;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.janus.data.DataContextImpl;
import org.janus.data.DataDescription;
import org.janus.data.DataDescriptionImpl;
import org.janus.helper.DebugAssistent;

/**
 * 
 * Hält zusätzlich eine Datenbankverbindung
 * 
 * @author THOMAS NILL Lizenz GPLv3
 * 
 * @see DataDescriptionImpl
 * 
 */

public class DataContextWithConnection extends DataContextImpl implements
        DataSource {
    static Logger logger = Logger.getLogger(DataContextWithConnection.class
            .getSimpleName());

    private DataSource conSource;

    public DataContextWithConnection(DataDescription description) {
        super(description);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return conSource.getConnection();
    }

    public void setConnectionSource(DataSource conSource) {
        DebugAssistent.doNullCheck(conSource);

        this.conSource = conSource;
    }

    @Override
    public Connection getConnection(String username, String password)
            throws SQLException {
        return conSource.getConnection(username, password);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return conSource.getLogWriter();
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return conSource.getLoginTimeout();
    }

    @Override
    public java.util.logging.Logger getParentLogger()
            throws SQLFeatureNotSupportedException {
        return conSource.getParentLogger();
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return conSource.isWrapperFor(iface);
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        conSource.setLogWriter(out);
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        conSource.setLoginTimeout(seconds);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return conSource.unwrap(iface);
    }

}
