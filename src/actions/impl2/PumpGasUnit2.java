package actions.impl2;

import actions.abs.PumpGasUnit;
import datastore.DS_2;
import datastore.DataSource;

// pumpgasunit impl for gp2
public class PumpGasUnit2 extends PumpGasUnit {

	public PumpGasUnit2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;

		d.setG(d.getG() + 1); // increase by 1 unit
		d.setTotal(d.getPrice() * d.getG()); // set total accordingly

	}

}
