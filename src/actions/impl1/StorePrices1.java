package actions.impl1;

import actions.abs.StorePrices;
import datastore.DS_1;
import datastore.DataSource;
// StorePrices impl for gp1
public class StorePrices1 extends StorePrices{

	public StorePrices1(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storePrice() {
		// TODO Auto-generated method stub
		DS_1 d=(DS_1)data;
		d.setPrice(d.getTemp_a());
		
	}

}
