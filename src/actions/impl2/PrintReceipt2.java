package actions.impl2;

import actions.abs.PrintReceipt;
import datastore.DS_2;
import datastore.DataSource;
// printreceipt impl for gp2
public class PrintReceipt2 extends PrintReceipt{

	public PrintReceipt2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Printing receipt ...");
        System.out.println("#################################################");
        DS_2 d = (DS_2) data;
        System.out.println(d.getG() + " gallon of " + d.getGasType() + " gasoline @ $" + d.getPrice() + "/gallon");
        System.out.println("Total: $" + (float) d.getTotal());
        System.out.println("Cash inserted: $" + d.getCash());
        System.out.println("#################################################");
        System.out.println("Transaction complete");
		
	}

}
