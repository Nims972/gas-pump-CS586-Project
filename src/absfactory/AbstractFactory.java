package absfactory;

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
/*
This is abstract factory class which defines methods and what concreate class will return 

*/
public abstract class  AbstractFactory {
	 public abstract DataSource getDataObj();
	 public abstract StorePrices getStorePrices();
	 public abstract PayMsg getPayMsg();
	 public abstract StoreCash getStoreCash();
	 public abstract DisplayMenu getDisplayMenu();   
	 public abstract RejectMsg getRejectMsg();
	 public abstract SetPrice getSetPrice();
	 public abstract SetInitialValues getSetInitialValues();
	 public abstract PumpGasUnit getPumpGasUnit();
	 public abstract GasPumpedMsg getGasPumpedMsg();
	 public abstract PrintReceipt getPrintReceipt();
	 public abstract CancelMsg getCancelMsg();
	 public abstract ReturnCash getReturnCash();
	 public abstract SetPayType getSetPayType();
	 public abstract EjectCard getEjectCard();

}
