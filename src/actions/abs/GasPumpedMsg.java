package actions.abs;


import datastore.DataSource;

public abstract class GasPumpedMsg {
	public DataSource data;
    public GasPumpedMsg(DataSource data) {
        this.data = data;
    }
	public abstract void gasPumpedMsg();
}
