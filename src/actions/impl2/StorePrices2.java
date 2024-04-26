package actions.impl2;

import actions.abs.StorePrices;
import datastore.DS_2;
import datastore.DataSource;
//storprices impl for gp2
public class StorePrices2 extends StorePrices{

	public StorePrices2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storePrice() {
		// TODO Auto-generated method stub
		DS_2 d=(DS_2)data;
		d.setRprice(d.getTemp_a()); // regular
		d.setDprice(d.getTemp_b()); // diesel
		d.setPprice(d.getTemp_c()); // premium
		
	}

}
