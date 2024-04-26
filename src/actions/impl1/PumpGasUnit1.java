package actions.impl1;

import actions.abs.PumpGasUnit;
import datastore.DS_1;
import datastore.DataSource;

//pumpgasunit impl for gp1
public class PumpGasUnit1 extends PumpGasUnit {

	public PumpGasUnit1(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
		d.setL(d.getL() + 1); // increase the L by 1 unit
		d.setTotal(d.getPrice() * d.getL()); // set total accordingly

	}

}
