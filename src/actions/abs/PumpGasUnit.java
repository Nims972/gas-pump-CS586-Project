package actions.abs;

import datastore.DataSource;

public abstract class PumpGasUnit {
	protected DataSource data;

    public PumpGasUnit(DataSource data) {
        this.data = data;
    }
	public abstract void pumpGasUnit();
}
