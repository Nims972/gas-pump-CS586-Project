package actions.impl2;

import actions.abs.PumpGasUnit;
import datastore.DS_2;
import datastore.DataSource;

public class PumpGasUnit2 extends PumpGasUnit{

	public PumpGasUnit2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;

	        /*
	            Call the subroutine that ACTUALLY pumps gas here
	            Now increment the appropriate data values
	        */
	        d.setG(d.getG()+1);
	        d.setTotal(d.getPrice()*d.getG());
//	        d.total = d.price * d.L;
		
	}

}
