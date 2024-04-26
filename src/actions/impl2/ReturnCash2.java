package actions.impl2;

import actions.abs.ReturnCash;
import datastore.DS_2;
import datastore.DataSource;

//return cash impl for gp2
public class ReturnCash2 extends ReturnCash {
	public ReturnCash2(DataSource data) {
		super(data);
	}

	@Override
	public void returnCash() {

		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;
		float cash_return = d.getCash() - d.getTotal(); //calculate cash return
		if (cash_return > 0) {
			System.out.println("Cash to return: $" + cash_return);
			System.out.println("Returning $" + cash_return);
		} else {
			System.out.println("No cash to return");
		}
		d.setCash(0);
		System.out.println("Transaction finished");
	}

}
