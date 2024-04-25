package actions.impl1;

import actions.abs.StoreCash;
import datastore.DS_1;
import datastore.DataSource;

public class StoreCash1 extends StoreCash{
	public StoreCash1(DataSource data) {
        super(data);
    }
	@Override
	public void storeCash() {
		// TODO Auto-generated method stub
		DS_1 d=(DS_1)data;
		d.setCash(d.getTemp_c());
	}

}
