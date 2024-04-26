package actions.abs;


import datastore.DataSource;
//gaspumpedmsg abstract class , implemantations of it prints when gas is pumped.
public abstract class GasPumpedMsg {
	public DataSource data;
    public GasPumpedMsg(DataSource data) {
        this.data = data;
    }
	public abstract void gasPumpedMsg();
}
