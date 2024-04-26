package actions.impl2;

import actions.abs.GasPumpedMsg;
import datastore.DS_2;
import datastore.DataSource;
// gaspumpedmsg impl for gp2
public class GasPumpedMsg2 extends GasPumpedMsg {
	public GasPumpedMsg2(DataSource data) {
		super(data);
	}

	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;
		System.out.println("Pumped 1 gallon of " + d.getGasType() + " gasoline");
		System.out.println("Total # of gallons pumped: " + d.getG());
	}

}
