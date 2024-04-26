package datastore;
//datasource for gp2, it stores the data for prices, total , pumped and cash taken etc.

public class DS_2 extends DataSource{
	float temp_a, temp_b, temp_c;
	int temp_cash;
	float Dprice, Rprice, Pprice;
	int cash;
	float total;
	int G;
	float price;
	String gasType;
	int w;
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
	public float getTemp_a() {
		return temp_a;
	}
	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}
	public float getTemp_b() {
		return temp_b;
	}
	public void setTemp_b(float temp_b) {
		this.temp_b = temp_b;
	}
	public float getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(float temp_c) {
		this.temp_c = temp_c;
	}
	public int getTemp_cash() {
		return temp_cash;
	}
	public void setTemp_cash(int temp_cash) {
		this.temp_cash = temp_cash;
	}
	public float getDprice() {
		return Dprice;
	}
	public void setDprice(float dprice) {
		Dprice = dprice;
	}
	public float getRprice() {
		return Rprice;
	}
	public void setRprice(float rprice) {
		Rprice = rprice;
	}
	public float getPprice() {
		return Pprice;
	}
	public void setPprice(float pprice) {
		Pprice = pprice;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
//		System.out.println("cash called--------------------------");
		this.cash = cash;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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
