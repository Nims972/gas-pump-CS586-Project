package actions.impl1;

import actions.abs.SetPrice;
import datastore.DS_1;
import datastore.DataSource;
// setprice impl for gp1
public class SetPrice1 extends SetPrice {
	public SetPrice1(DataSource data) {
		super(data);
	}

	@Override
	public void setPrice(int g) {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
		if (g == 1) { // Regular selected 
			d.setPrice(d.getPrice());
			d.setGasType("Regular");
		} 
		System.out.println(d.getGasType() + " gasoline selected @ price of $" + d.getPrice() + "/liter");
		System.out.println("Select (8) to start the pump"); // this is from driver , added here to make it more clear in prompts
	}

}
