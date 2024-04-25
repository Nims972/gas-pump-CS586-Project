package actions.abs;

import datastore.DataSource;

public abstract class DisplayMenu {
	protected DataSource data;

    public DisplayMenu(DataSource data) {
        this.data = data;
    }
	public abstract void displayMenu();
}
