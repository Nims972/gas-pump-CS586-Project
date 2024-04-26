package actions.impl2;

import actions.abs.SetInitialValues;
import datastore.DS_2;
import datastore.DataSource;
// setinitialvalues impl for gp2
public class SetInitialValues2 extends SetInitialValues {

	public SetInitialValues2(DataSource data) {
		super(data);
	}

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;
		d.setG(0); // set to 0
		d.setTotal(0); // set to 0

	}

}
