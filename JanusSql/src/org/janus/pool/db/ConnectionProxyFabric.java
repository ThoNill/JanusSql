package org.janus.pool.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;

import org.apache.log4j.Logger;
import org.janus.pool.ShivaFabric;

public class ConnectionProxyFabric implements ShivaFabric<ConnectionProxy> {
    private static final Logger LOG = Logger
            .getLogger(ConnectionProxyFabric.class);
    PropertyResourceBundle resource = null;
    static Logger log = Logger.getLogger("ShivaPool");

    private String name;
    private ConnectionProxyPool pool;
    private String connectOkTestSql;

    public ConnectionProxyFabric(String name) {
        super();
        this.name = name;
    }

    public ConnectionProxyPool getPool() {
        return pool;
    }

    public void setPool(ConnectionProxyPool pool) {
        this.pool = pool;
    }

    @Override
    public ConnectionProxy create() {
        try {
            return new ConnectionProxy(makeConnection(), getPool());
        } catch (SQLException e) {
            log.error("Fehler in create", e);
            return null;
        }
    }

    @Override
    public void destroy(ConnectionProxy obj) {
        if (obj instanceof ConnectionProxy) {
            ConnectionProxy proxy = obj;
            try {
                proxy.deepClose();
            } catch (SQLException e) {
                log.error("Fehler in deepClose", e);
            }
        }

    }

    private void executeSelect(String stmtString, Connection con)
            throws SQLException {
        log.debug("execute Select [" + stmtString + "]");
        Statement stmt = con.createStatement();
        stmt.execute(stmtString);
        stmt.close();
    }

    @Override
    public boolean isAlive(ConnectionProxy obj) {
        if (connectOkTestSql == null) {
            return true;
        }
        try {
            executeSelect(connectOkTestSql, obj);
        } catch (Exception ex) {
            LOG.error("Fehler bei Testsql ", ex);
            ;
            return false;
        }
        return true;
    }

    public synchronized Connection makeConnection() throws SQLException {
        log.debug("makeConnection [" + name + "] ");
        Connection con = null;

        try {
            getResourceBundle(name);

            String driverName = getString("driver");
            String connectString = getString("connect");
            connectOkTestSql = getString("testsql");

            Driver driver = (Driver) Class.forName(driverName).newInstance();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection(connectString);
        } catch (Exception ex) {
            log.error("no Connect ", ex);
        }

        return con;
    }

    private PropertyResourceBundle getResourceBundle(String resname) {
        if (resource == null) {
            log.info("Resource: " + resname);
            try {
                InputStream in = getClass().getClassLoader()
                        .getResourceAsStream("db/" + resname + ".properties");

                resource = new PropertyResourceBundle(in);

                in.close();
            } catch (Exception ex) {
                log.fatal(ex.getMessage() + " ResName " + resname, ex);
            }
        }
        return resource;
    }

    private String getString(String name) {

        String erg = null;
        try {
            erg = resource.getString(name);
        } catch (MissingResourceException ex) {
            log.fatal(" No Resource ResName " + name, ex);
        }
        return erg;
    }

}
