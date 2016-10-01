package org.janus.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.janus.actions.Action;
import org.janus.actions.DataValue;
import org.janus.actions.DataValueList;
import org.janus.actions.StartRunEnd;
import org.janus.data.DataContext;
import org.janus.data.DataDescription;
import org.janus.helper.DebugAssistent;

public class SqlStatement extends StartRunEnd<SqlRun> implements Action {

    boolean prepare = true;
    DataValueList parameter;
    SqlText sqlStmtText = null;
    private DataValueList values;

    public SqlStatement(String name, String text) {
        DebugAssistent.doNullCheck(name, text);

        this.name = name;
        this.sqlStmtText = new SqlText(text);
        values = new DataValueList();
        parameter = new DataValueList();
    }

    @Override
    public void configure(DataDescription description) {
        super.configure(description);
        values.configure(description);
    }

    public boolean isPrepare() {
        return prepare;
    }

    public void addValue(DataValue value) {
        values.add(value);
    }

    public void addParameter(DataValue value) {
        parameter.add(value);
    }

    public SqlStatement prepare(boolean prepare) {
        this.prepare = prepare;
        return this;
    }

    @Override
    protected SqlRun start(DataContext context) throws Exception {
        SqlRun data = new SqlRun();
        data.con = getConnection(context);
        if (prepare) {
            preparedExecution(context, data);
        } else {
            execution(context, data);
        }
        return data;
    }

    private Connection getConnection(DataContext context) throws SQLException {
        DataContextWithConnection withConnection = (DataContextWithConnection) context;
        Connection con = withConnection.getConnection();
        return con;
    }

    private void execution(DataContext context, SqlRun data)
            throws SQLException, IOException {
        String stmtString = sqlStmtText.getMessage(context);
        Statement statement = data.con.createStatement();

        data.statement = statement;
        data.result = statement.executeQuery(stmtString);

    }

    private void preparedExecution(DataContext context, SqlRun data)
            throws SQLException, IOException {
        String prepStmtString = sqlStmtText.getPrepString();
        PreparedStatement prepStmt = data.con.prepareStatement(prepStmtString);
        parameter.fillPreparedStatement(context, prepStmt);

        data.statement = prepStmt;
        data.result = prepStmt.executeQuery();
    }

    @Override
    protected boolean next(DataContext ctx, SqlRun data) throws Exception {
        boolean next = data.result.next();
        if (next) {
            values.loadFromResultSet(ctx, data.result);
        }
        return next;
    }

    @Override
    protected void stop(SqlRun data) throws SQLException {
        data.result.close();
        data.statement.close();
        data.con.close();
    }
}
