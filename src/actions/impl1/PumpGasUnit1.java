package actions.impl1;

import actions.abs.PumpGasUnit;
import datastore.DS_1;
import datastore.DataSource;

public class PumpGasUnit1 extends PumpGasUnit{

	public PumpGasUnit1(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		  DS_1 d = (DS_1) data;
	        /*
	            Call the subroutine that ACTUALLY pumps gas here
	            Now increment the appropriate data values
	        */
		  d.setL(d.getL()+1);
//	        d.G++;
		  d.setTotal(d.getPrice()*d.getL());
//	        d.total = d.price * d.G;
		
	}

}
