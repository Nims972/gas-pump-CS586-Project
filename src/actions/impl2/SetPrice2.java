package actions.impl2;

import actions.abs.SetPrice;
import datastore.DS_2;
import datastore.DataSource;
// setPrice impl for gp2
public class SetPrice2 extends SetPrice {
	 public SetPrice2(DataSource data) {
	        super(data);
	    }
	@Override
	public void setPrice(int g) {
		// TODO Auto-generated method stub
		 DS_2 d = (DS_2) data;
	        if (g == 1) { // Regular selected
	            d.setPrice(d.getRprice());
	            d.setGasType("Regular");
	        } else if (g == 2) { // Super selected
	            d.setPrice(d.getDprice());
	            d.setGasType("Diesel");
	        } else if (g == 3) { // Premium selected
	            d.setPrice(d.getPprice());
	            d.setGasType("Premium");
	        }
	        System.out.println(d.getGasType() + " gasoline selected @ price of $" + d.getPrice()+ "/gallon");
	        System.out.println("Select (7) to start the pump");
	}

}
