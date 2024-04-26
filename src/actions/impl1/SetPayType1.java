package actions.impl1;

import actions.abs.SetPayType;
import datastore.DS_1;
import datastore.DataSource;
// SetPayType impl for gp1
public class SetPayType1 extends SetPayType{

	public SetPayType1(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPayType(int t) {
		// TODO Auto-generated method stub
		DS_1 d=(DS_1)data;
		d.setPayType(t);
		
	}

}
