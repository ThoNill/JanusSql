package org.janus.database;

import org.janus.actions.DataValueList;
import org.janus.actions.HandleValue;
import org.janus.data.MessageImpl;

public class SqlText extends MessageImpl {

	public SqlText(String text) {
		super(text);
	}

	public SqlText(String text, String prefix, String postfix) {
		super(text, prefix, postfix);
	}

	public DataValueList getValueList() {
		DataValueList list = new DataValueList();
		for (int i = 1; i < texte.length; i += 2) {
			HandleValue value = new HandleValue(texte[i]);
			list.addValue(value);
		}
		return list;
	}

	public String getPrepString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < texte.length; i += 2) {
			if (i > 0) {
				builder.append('?');
			}
			builder.append(texte[i]);
		}
		return builder.toString();
	}

}
