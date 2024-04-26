package gaspump;

import absfactory.AbstractFactory;
import datastore.DS_1;
//gaspump 1 implementations
public class GasPump_1 extends GasPump {
	public GasPump_1(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	public void activate(int temp_a) { //activates the gp1 taking price of regular gas
		if (temp_a > 0) {
			DS_1 d = (DS_1) this.data;
			d.setTemp_a(temp_a);
			model.activate();
		} else {
			System.out.println("Activation failed!");
		}
	}

	public void start() { // starts the gaspump and works for transition state
		model.start();
	}

	public void payCredit() { // selects to pay via credit card
		model.payType(1);
		System.out.println("PLEASE WAIT -- PROCESSING CREDIT CARD");
	}

	public void reject() { // rejects the credit card
		model.reject();
	}

	public void cancel() { // cancelsthe transactoin
		model.cancel();
	}

	public void approved() { // approves the card
		model.approved();
		model.selectGas(1); // selects regular gas
	}

	public void startPump() { // starts the pump and prepares it to pump
		model.continue_();
		model.startPump();
	}

	public void payCash(int temp_c) { // options to pay via cash and takes cash
		if(temp_c>0) {
			DS_1 d=(DS_1)data;
			d.setTemp_c(temp_c); 
			model.payType(0); // sets paytype(0)
		}
	}

	public void stopPump() { // stops the pump
		model.stopPump();
		model.receipt(); // prints receipts
	}

	public void pump() { // pumps the gas
		DS_1 d=(DS_1)data;
		if(d.getW()==1)
			model.pump();
		else if(d.getW()==0 && d.getCash()<d.getPrice()*(d.getL()+1)) {
			model.stopPump();
			model.receipt();
		}else {
			model.pump();
		}
	}
}
