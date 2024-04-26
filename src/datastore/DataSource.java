package datastore;
//datasource abstract class , added gastype and paytype here, 
// gastype is string stores regular,diesel,premium for display in menu and receipts

public abstract class DataSource {
	public abstract String getGasType();
	public abstract void setGasType(String gasType);
	public abstract int getPayType();
	public abstract void setPayType(int t);
}
