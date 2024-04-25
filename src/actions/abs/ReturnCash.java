package actions.abs;

import datastore.DataSource;

public abstract class ReturnCash {
	protected DataSource data;

    /*
        GasPump1 constructor (doesn't need the shared data structure)
        Note, GasPump1 should never call this constructor under the current system design
     */
    public ReturnCash() {
    }

    /*
        GasPump2 constructor (needs the shared data structure)
     */
    public ReturnCash(DataSource data) {
        this.data = data;
    }
	public abstract void returnCash();
}
