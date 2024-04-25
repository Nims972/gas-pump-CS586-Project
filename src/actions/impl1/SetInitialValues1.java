package actions.impl1;

import actions.abs.SetInitialValues;
import datastore.DS_1;
import datastore.DataSource;

public class SetInitialValues1 extends SetInitialValues {
	public SetInitialValues1(DataSource data) {
		super(data);
	}

	/*
	 * Set the number of gallons pumped and payment balance initially to zero for
	 * this transaction
	 */

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
		d.setL(0);
		d.setTotal(0);

	}

}
