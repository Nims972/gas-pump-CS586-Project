package actions.abs;
// abstract class for SetPrice , impl of it sets the price of gas.
import datastore.DataSource;

public abstract class SetPrice {
	protected DataSource data;

	public SetPrice(DataSource data) {
		this.data = data;
	}
	public abstract void setPrice(int g);
}
