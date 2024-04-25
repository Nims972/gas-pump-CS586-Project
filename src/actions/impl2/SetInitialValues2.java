package actions.impl2;

import actions.abs.SetInitialValues;
import datastore.DS_2;
import datastore.DataSource;

public class SetInitialValues2 extends SetInitialValues {

	public SetInitialValues2(DataSource data) {
		super(data);
	}

	/*
	 * Set the number of liters pumped and payment balance initially to zero for
	 * this transaction
	 */
	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;
		d.setG(0);
		d.setTotal(0);

	}

}
