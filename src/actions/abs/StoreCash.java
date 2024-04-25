package actions.abs;

import datastore.DataSource;

public abstract class StoreCash {
	protected DataSource data;

	public StoreCash(DataSource data) {
		this.data = data;
	}

	public abstract void storeCash();
}
