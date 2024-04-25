package actions.impl2;

import actions.abs.SetPayType;
import datastore.DS_2;
import datastore.DataSource;

public class SetPayType2 extends SetPayType{

	public SetPayType2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPayType(int t) {
		// TODO Auto-generated method stub
		DS_2 d=(DS_2)data;
		d.setPayType(t);
	}

}
