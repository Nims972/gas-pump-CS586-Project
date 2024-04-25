package com;

public class Open implements AccountState{

	@Override
	public void open(int bal, int pin, int id) {
		// TODO Auto-generated method stub
		accData.setBal(bal);
		accData.setPin(pin);
		accData.setId(id);
		acc.changeState(1);
		
	}

	@Override
	public void login(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pin(int pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int balance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
