package org.janus.pool.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.janus.lists.ActionOnObject;
import org.janus.lists.DoubleLinkedList;

public class ConnectionProxy extends SimpleConnectionProxy {

    static private final Logger LOG = Logger.getLogger("Database");

    HashMap<String, PreparedStatementProxy> preparedHash = new HashMap<>();

    DoubleLinkedList<PreparedStatementProxy> preparedStatements = new DoubleLinkedList<PreparedStatementProxy>();
    DoubleLinkedList<CallableStatementProxy> callableStatements = new DoubleLinkedList<CallableStatementProxy>();
    DoubleLinkedList<StatementProxy> statements = new DoubleLinkedList<StatementProxy>();

    DoubleLinkedList<ResultSetProxy> resultSets = new DoubleLinkedList<ResultSetProxy>();

    DBPool pool;

    public ConnectionProxy(Connection connection, DBPool pool) {
        super(connection);
        this.pool = pool;
    }

    public void add(PreparedStatementProxy e) {
        preparedStatements.add(e);
    }

    public void remove(PreparedStatementProxy o) {
        preparedStatements.remove(o);
    }

    public void add(CallableStatementProxy e) {
        callableStatements.add(e);
    }

    public void remove(CallableStatementProxy o) {
        callableStatements.remove(o);
    }

    public void add(StatementProxy e) {
        statements.add(e);
    }

    public void remove(StatementProxy o) {
        statements.remove(o);
    }

    public void add(ResultSetProxy e) {
        resultSets.add(e);
    }

    public void remove(ResultSetProxy o) {
        resultSets.remove(o);
    }

    public List<PreparedStatementProxy> getPereparedStatements() {
        CollectElements<PreparedStatementProxy> collect = new CollectElements<PreparedStatementProxy>();
        preparedStatements.perform(collect);
        return collect.getElements();
    }

    public List<CallableStatementProxy> getCallableStatements() {
        CollectElements<CallableStatementProxy> collect = new CollectElements<CallableStatementProxy>();
        callableStatements.perform(collect);
        return collect.getElements();
    }

    public List<StatementProxy> getStatements() {
        CollectElements<StatementProxy> collect = new CollectElements<StatementProxy>();
        statements.perform(collect);
        return collect.getElements();
    }

    public List<ResultSetProxy> getResultSets() {
        CollectElements<ResultSetProxy> collect = new CollectElements<ResultSetProxy>();
        resultSets.perform(collect);
        return collect.getElements();
    }

    @Override
    public void close() {
        pool.destroy(this);
    }

    @Override
    public Statement createStatement() throws SQLException {
        return new StatementProxy(super.createStatement(), this);
    }

    @Override
    public Statement createStatement(int resultSetType,
            int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        return new StatementProxy(super.createStatement(resultSetType,
                resultSetConcurrency, resultSetHoldability), this);
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency)
            throws SQLException {
        return new StatementProxy(super.createStatement(resultSetType,
                resultSetConcurrency), this);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType,
            int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        return new CallableStatementProxy(super.prepareCall(sql, resultSetType,
                resultSetConcurrency, resultSetHoldability), this, sql);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType,
            int resultSetConcurrency) throws SQLException {
        return new CallableStatementProxy(super.prepareCall(sql, resultSetType,
                resultSetConcurrency), this, sql);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        return new CallableStatementProxy(super.prepareCall(sql), this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType,
            int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        return new PreparedStatementProxy(super.prepareStatement(sql,
                resultSetType, resultSetConcurrency, resultSetHoldability),
                this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType,
            int resultSetConcurrency) throws SQLException {
        return new PreparedStatementProxy(super.prepareStatement(sql,
                resultSetType, resultSetConcurrency), this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
            throws SQLException {
        return new PreparedStatementProxy(super.prepareStatement(sql,
                autoGeneratedKeys), this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
            throws SQLException {
        return new PreparedStatementProxy(super.prepareStatement(sql,
                columnIndexes), this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames)
            throws SQLException {
        return new PreparedStatementProxy(super.prepareStatement(sql,
                columnNames), this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        synchronized (this) {
            PreparedStatementProxy stmt = preparedHash.get(sql);
            if (stmt == null) {
                stmt = new PreparedStatementProxy(super.prepareStatement(sql),
                        this, sql);
                preparedHash.put(sql, stmt);
            }
            return stmt;

        }
    }

    public void deepClose() throws SQLException {
        closeAllKindsOfProxys();
        original.close();
    }

    public void closeAllOpenPreparedStatementProxys() {
        @SuppressWarnings("unchecked")
        List<PreparedStatementProxy> clone = getPereparedStatements();
        for (PreparedStatementProxy proxy : clone) {
            try {
                proxy.close();
            } catch (SQLException ex) {
                LOG.error("Fehler bei prepared Statement close", ex);
            }
        }
        preparedHash.clear();
    }

    public void closeAllOpenCallableStatementProxys() {
        List<CallableStatementProxy> clone = getCallableStatements();
        for (CallableStatementProxy proxy : clone) {
            try {
                proxy.close();
            } catch (SQLException ex) {
                LOG.error("Fehler bei CallableStatement close", ex);
            }
        }
    }

    public void closeAllOpenStatementProxys() {
        List<StatementProxy> clone = getStatements();
        for (StatementProxy proxy : clone) {
            try {
                proxy.close();
            } catch (SQLException ex) {
                LOG.error("Fehler bei Statement close", ex);
            }
        }
    }

    public void closeAllOpenResultSetProxys() {
        @SuppressWarnings("unchecked")
        List<ResultSetProxy> clone = getResultSets();
        for (ResultSetProxy proxy : clone) {
            try {
                proxy.close();
            } catch (SQLException ex) {
                LOG.error("Fehler bei ResultSet close", ex);
            }
        }
    }

    public void closeAllKindsOfProxys() {
        closeAllOpenResultSetProxys();
        closeAllOpenStatementProxys();
        closeAllOpenCallableStatementProxys();
        closeAllOpenPreparedStatementProxys();
    }

    public boolean isWithoutOpenResultSets() {
        return resultSets.size() == 0;
    }

    public Connection getOriginalConnection() {
        return original;
    }

    public Connection getConnection() {
        return this;
    }

    class CollectElements<K> implements ActionOnObject<K> {
        private List<K> elements = new ArrayList<K>();

        @Override
        public void perform(K obj) {
            elements.add(obj);
        }

        public List<K> getElements() {
            return elements;
        }

    }

    class LogAction<H> implements ActionOnObject<H> {

        @Override
        public void perform(Object obj) {
            LOG.debug(obj.toString());

        }

    }

    public void showPreparedStatementProxys() {
        if (LOG.isDebugEnabled()) {
            @SuppressWarnings("unchecked")
            List<PreparedStatementProxy> clone = getPereparedStatements();
            for (PreparedStatementProxy proxy : clone) {
                LOG.debug(proxy.getStmtString());
            }
        }
    }

    public void log() {
        LOG.debug("open prepared statements: " + preparedStatements.size());
        LOG.debug("open callable statements: " + callableStatements.size());
        LOG.debug("open statements: " + statements.size());

        LogAction<ResultSetProxy> logger = new LogAction<ResultSetProxy>();
        resultSets.perform(logger);

    }

    public void connect() throws SQLException {
        original = pool.createOriginal();
    }

}
