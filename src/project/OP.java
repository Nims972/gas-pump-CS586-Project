package project;

import absfactory.AbstractFactory;
import actions.abs.CancelMsg;
import actions.abs.DisplayMenu;
import actions.abs.EjectCard;
import actions.abs.GasPumpedMsg;
import actions.abs.PayMsg;
import actions.abs.PrintReceipt;
import actions.abs.PumpGasUnit;
import actions.abs.RejectMsg;
import actions.abs.ReturnCash;
import actions.abs.SetInitialValues;
import actions.abs.SetPayType;
import actions.abs.SetPrice;
import actions.abs.StoreCash;
import actions.abs.StorePrices;
import datastore.DataSource;

public class OP {
	DataSource d;
	private CancelMsg cancelMsg;
	private DisplayMenu displayMenu;
	private EjectCard ejectCard;
	private GasPumpedMsg gasPumpedMsg;
	private PayMsg payMsg;
	private PrintReceipt printReceipt;
	private PumpGasUnit pumpGasUnit;
	private RejectMsg rejectMsg;
	private ReturnCash returnCash;
	private SetInitialValues setInitialValues;
	private SetPayType setPayType;
	private SetPrice setPrice;
	private StoreCash storeCash;
	public StorePrices storePrice;

	public OP(AbstractFactory af) {
		this.cancelMsg = af.getCancelMsg();
		this.displayMenu = af.getDisplayMenu();
		this.ejectCard = af.getEjectCard();
		this.gasPumpedMsg = af.getGasPumpedMsg();
		this.payMsg = af.getPayMsg();
		this.printReceipt = af.getPrintReceipt();
		this.pumpGasUnit = af.getPumpGasUnit();
		this.rejectMsg = af.getRejectMsg();
		this.returnCash = af.getReturnCash();
		this.setInitialValues = af.getSetInitialValues();
		this.setPayType = af.getSetPayType();
		this.setPrice = af.getSetPrice();
		this.storeCash = af.getStoreCash();
		this.storePrice = af.getStorePrices();
	}

	public void storePrice() {
		this.storePrice.storePrice();
	}

	public void payMsg() {
		this.payMsg.payMsg();
	}

	public void storeCash() {
		this.storeCash.storeCash();
	}

	public void displayMenu() {
		this.displayMenu.displayMenu();
	}

	public void rejectMsg() {
		this.rejectMsg.rejectMsg();
	}

	public void setPrice(int g) {
		this.setPrice.setPrice(g);;
	}

	public void setInitialValue() {
		this.setInitialValues.setInitialValues();
	}

	public void pumpGasUnit() {
		this.pumpGasUnit.pumpGasUnit();
	}

	public void gasPumpedMsg() {
		this.gasPumpedMsg.gasPumpedMsg();
	}

	public void printReceipt() {
		this.printReceipt.printReceipt();
	}

	public void cancelMsg() {
		this.cancelMsg.cancelMsg();
	}

	public void returnCash() {
		this.returnCash.returnCash();
	}

	public void setPayType(int t) {
		this.setPayType.setPayType(t);
	}

	public void ejectCard() {
		this.ejectCard.ejectCard();
	}
}
