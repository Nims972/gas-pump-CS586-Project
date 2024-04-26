package actions.abs;

import datastore.DataSource;
// abstract class for printreceipt, impl of it generates the receipt
public abstract class PrintReceipt {
	protected DataSource data;

    public PrintReceipt(DataSource data) {
        this.data = data;
    }
	public abstract void printReceipt();
}
