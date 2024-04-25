package actions.abs;

import datastore.DataSource;

public abstract class PrintReceipt {
	protected DataSource data;

    public PrintReceipt(DataSource data) {
        this.data = data;
    }
	public abstract void printReceipt();
}
