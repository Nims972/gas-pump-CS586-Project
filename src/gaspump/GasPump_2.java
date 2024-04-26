package gaspump;

import absfactory.AbstractFactory;
import datastore.DS_2;
// gp2 implementations
public class GasPump_2 extends GasPump{
	public GasPump_2(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}
	public void activate(float a, float b, float c) { // activates the pump taking prices of 3 gas types
		if (a > 0 && b>0 && c>0) {
			DS_2 d = (DS_2) this.data;
			d.setTemp_a(a);
			d.setTemp_b(b);
			d.setTemp_c(c);
			model.activate();
		} else {
			System.out.println("Activation failed!");
			System.out.println("Price must be greater than $0");
		}
	}
	public void start() { // starts the pump
		model.start();
	}
	public void payCash(int c) { // takes amount of cash and selects pay via cash
		if(c>0) {
			DS_2 d=(DS_2)data;
			d.setTemp_cash(c);
			model.payType(0);
		}
	}
	public void cancel() { // cancels the transactions
		model.cancel();
	}
	public void premium() { // selects premium gas
		model.selectGas(3);
		model.continue_();
	}
	public void regular() { // selects regular gas
		model.selectGas(1);
		model.continue_();
	}
	public void diesel() {// selects diesel gas
		model.selectGas(2);
		model.continue_();
	}
	public void startPump() { // starts the pump
		model.startPump();
	}
	public void stop() { // stops the pump
		model.stopPump();
	}
	public void receipt() { // prints receipt
		model.receipt();
	}
	public void noReceipt() { // noreceipt selected and proceeds to end.
		model.noReceipt();
	}
	
	public void pumpGallon() { // pumps single unit of gallon
		DS_2 d=(DS_2)data;
		if(d.getCash()< d.getPrice()*(d.getG()+1)) {
			model.stopPump();
		}else
			model.pump();
	}
	
}
