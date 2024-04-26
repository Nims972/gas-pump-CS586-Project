package actions.impl1;

import actions.abs.GasPumpedMsg;
import datastore.DS_1;
import datastore.DataSource;
//gaspumpedmsg impl for gp1
public class GasPumpedMsg1 extends GasPumpedMsg {

	public GasPumpedMsg1(DataSource data) {
		super(data);
	}

	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
		System.out.println("Pumped 1 Liter of " + d.getGasType() + " gasoline");
		System.out.println("Total # of Liter pumped: " + d.getL());
	}

}
