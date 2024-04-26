package actions.abs;

// abstract class for StorePrices, this is used to set the gas prices while activating the machine.
import datastore.DataSource;

public abstract class StorePrices {
	protected DataSource data;

	public StorePrices(DataSource data) {
		this.data = data;
	}

	public abstract void storePrice();
}
