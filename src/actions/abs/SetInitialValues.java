package actions.abs;

import datastore.DataSource;

public abstract class SetInitialValues {
	protected DataSource data;

	public SetInitialValues(DataSource data) {
		this.data = data;
	}

	public abstract void setInitialValues();
}
