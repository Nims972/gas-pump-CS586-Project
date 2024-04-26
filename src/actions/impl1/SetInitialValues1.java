package actions.impl1;

import actions.abs.SetInitialValues;
import datastore.DS_1;
import datastore.DataSource;

// setinitialvalues impl for gp1
public class SetInitialValues1 extends SetInitialValues {
	public SetInitialValues1(DataSource data) {
		super(data);
	}

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
		d.setL(0); // set to 0
		d.setTotal(0); // set to 0

	}

}
