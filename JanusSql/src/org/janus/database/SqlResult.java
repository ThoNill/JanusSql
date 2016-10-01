package org.janus.database;

import java.io.Serializable;
import java.util.ArrayList;

import org.janus.actions.ReadValue;
import org.janus.data.DataContext;

public class SqlResult<K extends Serializable> extends SqlStatement implements
        ReadValue {

    private static final long serialVersionUID = -5592869392990451639L;
    private ArrayList<K> list;
    private ResultSet2ObjectConverter<K> converter;

    public SqlResult(String name, String text,
            ResultSet2ObjectConverter<K> converter) {
        super(name, text);
    }

    @Override
    public Serializable getObject(DataContext ctx) {
        if (list == null) {
            list = new ArrayList<>();
            perform(ctx);
        }
        return list;
    }

    @Override
    protected boolean next(DataContext ctx, SqlRun data) throws Exception {
        boolean next = data.result.next();
        if (next) {
            list.add(converter.newObject(data.result));
        }
        return next;
    }

}
