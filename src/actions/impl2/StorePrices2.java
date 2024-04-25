package actions.impl2;

import actions.abs.StorePrices;
import datastore.DS_2;
import datastore.DataSource;

public class StorePrices2 extends StorePrices{

	public StorePrices2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storePrice() {
		// TODO Auto-generated method stub
		DS_2 d=(DS_2)data;
		d.setRprice(d.getTemp_a());
		d.setDprice(d.getTemp_b());
		d.setPprice(d.getTemp_c());
		
	}

}
