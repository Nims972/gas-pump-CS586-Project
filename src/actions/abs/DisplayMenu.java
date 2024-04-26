package actions.abs;

import datastore.DataSource;
//abstract class for DisplayMenu , the implementations of it is responsible for printing menu
public abstract class DisplayMenu {
	protected DataSource data;

    public DisplayMenu(DataSource data) {
        this.data = data;
    }
	public abstract void displayMenu();
}
