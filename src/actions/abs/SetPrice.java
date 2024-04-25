package actions.abs;

import datastore.DataSource;

public abstract class SetPrice {
	protected DataSource data;

	public SetPrice(DataSource data) {
		this.data = data;
	}
	public abstract void setPrice(int g);
}
