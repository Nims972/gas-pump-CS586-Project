package actions.abs;
// abstract class for SetPayType, impl of it sets the paytype value, 0 for cash , 1 for card.
import datastore.DataSource;

public abstract class SetPayType {
	protected DataSource data;

	public SetPayType(DataSource data) {
		this.data = data;
	}

	public abstract void setPayType(int t);
}
