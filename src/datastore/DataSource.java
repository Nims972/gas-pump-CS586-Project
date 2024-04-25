package datastore;

public abstract class DataSource {
	public abstract String getGasType();
	public abstract void setGasType(String gasType);
	public abstract int getPayType();
	public abstract void setPayType(int t);
}
