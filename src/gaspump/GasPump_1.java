package gaspump;

import absfactory.AbstractFactory;
import datastore.DS_1;
import datastore.DataSource;
import mdaefsm.MDA_EFSM;

public class GasPump_1 extends GasPump {
	public GasPump_1(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	public void activate(int temp_a) {
		if (temp_a > 0) {
			DS_1 d = (DS_1) this.data;
			d.setTemp_a(temp_a);
			model.activate();
		} else {
			System.out.println("Activation failed!");
			System.out.println("Price must be greater than $0");
		}
	}

	public void start() {
		model.start();
	}

	public void payCredit() {
		model.payType(1);
		System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
	}

	public void reject() {
		model.reject();
	}

	public void cancel() {
		model.cancel();
	}

	public void approved() {
		model.approved();
		model.selectGas(1);
	}

	public void startPump() {
		model.continue_();
		model.startPump();
	}

	public void payCash(int temp_c) {
		if(temp_c>0) {
			DS_1 d=(DS_1)data;
			d.setTemp_c(temp_c);
			model.payType(0);
		}
	}

	public void stopPump() {
		model.stopPump();
		model.receipt();
	}

	public void pump() {
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

	@Override
	public void printOperations() {
		// TODO Auto-generated method stub
		
	}
}
