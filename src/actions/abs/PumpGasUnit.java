package actions.abs;

import datastore.DataSource;
// abstract class for pumpgasunit , impl of it pumps single unit of gas
public abstract class PumpGasUnit {
	protected DataSource data;

    public PumpGasUnit(DataSource data) {
        this.data = data;
    }
	public abstract void pumpGasUnit();
}
