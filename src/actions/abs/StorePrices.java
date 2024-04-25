package actions.abs;


import datastore.DataSource;

public abstract class StorePrices {
	protected DataSource data;

	public StorePrices(DataSource data) {
		this.data = data;
	}

	public abstract void storePrice();
}
