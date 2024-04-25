package com;

public interface AccountState {
	public static final AccountData accData = new AccountData();
	public static final Account acc = new Account();
	public void open(int bal,int pin, int id);
	public void login(int id);
	public void pin(int pin);
	public void logout();
	public void withdraw(int w);
	public void deposit(int d);
	public int balance();
}
