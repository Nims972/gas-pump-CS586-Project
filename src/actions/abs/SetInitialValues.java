package actions.abs;
//abstract class for setinitialvalues, impl of it sets values to initial values(0)
import datastore.DataSource;

public abstract class SetInitialValues {
	protected DataSource data;

	public SetInitialValues(DataSource data) {
		this.data = data;
	}

	public abstract void setInitialValues();
}
