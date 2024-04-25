package gaspump;

import absfactory.AbstractFactory;
import datastore.DS_2;

public class GasPump_2 extends GasPump{
	public GasPump_2(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}
	public void activate(float a, float b, float c) {
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
	public void payCash(int c) {
		if(c>0) {
			DS_2 d=(DS_2)data;
			d.setTemp_cash(c);
			model.payType(0);
		}
	}
	public void cancel() {
		model.cancel();
	}
	public void premium() {
		model.selectGas(3);
		model.continue_();
	}
	public void regular() {
		model.selectGas(1);
		model.continue_();
	}
	public void diesel() {
		model.selectGas(2);
		model.continue_();
	}
	public void startPump() {
		model.startPump();
	}
	public void stop() {
		model.stopPump();
	}
	public void receipt() {
		model.receipt();
	}
	public void noReceipt() {
		model.noReceipt();
	}
	
	public void pumpGallon() {
		DS_2 d=(DS_2)data;
		if(d.getCash()< d.getPrice()*(d.getG()+1)) {
			model.stopPump();
		}else
			model.pump();
	}
	public void start() {
		model.start();
	}
	@Override
	public void printOperations() {
		// TODO Auto-generated method stub
		
	}
}
