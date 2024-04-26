package datastore;
// datasource for gp1, it stores the data for prices, total , pumped and cash taken etc. alongwith paytype
public class DS_1 extends DataSource{
	int temp_a;
	int price;
	int L;
	int total;
	int temp_c;
	int w;
	int cash;
	String gasType;
	@Override
	public String getGasType() {
		// TODO Auto-generated method stub
		return gasType;
	}
	@Override
	public void setGasType(String gasType) {
		// TODO Auto-generated method stub
		this.gasType=gasType;
	}
	public int getTemp_a() {
		return temp_a;
	}
	public void setTemp_a(int temp_a) {
		this.temp_a = temp_a;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(int temp_c) {
		this.temp_c = temp_c;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	@Override
	public int getPayType() {
		// TODO Auto-generated method stub
		return w;
	}
	@Override
	public void setPayType(int t) {
		// TODO Auto-generated method stub
		this.w=t;
	}
}
