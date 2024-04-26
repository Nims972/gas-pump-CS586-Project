package actions.abs;
// abstract class for StoreCash action, impl of it stores the cash in according datastore 
import datastore.DataSource;

public abstract class StoreCash {
	protected DataSource data;

	public StoreCash(DataSource data) {
		this.data = data;
	}

	public abstract void storeCash();
}
