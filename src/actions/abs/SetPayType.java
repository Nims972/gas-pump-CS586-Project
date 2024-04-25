package actions.abs;

import datastore.DataSource;

public abstract class SetPayType {
	protected DataSource data;

	public SetPayType(DataSource data) {
		this.data = data;
	}

	public abstract void setPayType(int t);
}
