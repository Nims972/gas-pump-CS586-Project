package com;

public class Account {
	AccountState accState;
	AccountState accStateLS[]=new AccountState[5];
	public Account(){
		accStateLS[0]=new Open();
		accStateLS[1]=new Idle();
		accStateLS[2]=new CheckPin();
		accStateLS[3]=new Ready();
		accStateLS[4]=new OverDrawn();
		changeState(0);
		
	}
	public void changeState(int stateid) {
		accState=accStateLS[stateid];
	}
	public static void main(String args[]) {
			
	}
}
