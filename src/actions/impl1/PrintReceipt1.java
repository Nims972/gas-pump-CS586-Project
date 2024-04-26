package actions.impl1;

import actions.abs.PrintReceipt;
import datastore.DS_1;
import datastore.DataSource;
//printreceipt impl for gp1
public class PrintReceipt1 extends PrintReceipt{

	public PrintReceipt1(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		 System.out.println("Printing receipt ...");
	        System.out.println("######################################################################");
	        DS_1 d = (DS_1) data;
	        System.out.println(d.getL() + " gallons of " + d.getGasType() + " gasoline @ $" + d.getPrice() + "/gallon");
	        System.out.println("Total: $" + d.getTotal());
	        System.out.println("#######################################################################");
	        System.out.println("Transaction complete");
		
	}

}
