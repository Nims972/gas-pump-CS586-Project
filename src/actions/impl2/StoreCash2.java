package actions.impl2;

import actions.abs.StoreCash;
import datastore.DS_2;
import datastore.DataSource;

public class StoreCash2 extends StoreCash{
	public StoreCash2(DataSource data) {
        super(data);
    }
	@Override
	public void storeCash() {
		// TODO Auto-generated method stub
		DS_2 d=(DS_2)data;
		d.setCash(d.getTemp_cash());
	}

}
