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
import actions.impl1.CancelMsg1;
import actions.impl1.DisplayMenu1;
import actions.impl1.EjectCard1;
import actions.impl1.GasPumpedMsg1;
import actions.impl1.PayMsg1;
import actions.impl1.PrintReceipt1;
import actions.impl1.PumpGasUnit1;
import actions.impl1.RejectMsg1;
import actions.impl1.ReturnCash1;
import actions.impl1.SetInitialValues1;
import actions.impl1.SetPayType1;
import actions.impl1.SetPrice1;
import actions.impl1.StoreCash1;
import actions.impl1.StorePrices1;
import datastore.DS_1;
import datastore.DataSource;
/*
 * this is factory class for GP1 and provides necessary "actions" strategies. 
 * this is also having datasource and handling of which type of data needs to be initiated happens here.
*/

public class CF_GP1 extends AbstractFactory{
	private DataSource data;
	public CF_GP1(){
		data=new DS_1();//datasource reference which will be passed
	}
	@Override 
	public DataSource getDataObj() { //returns the data reference
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public StorePrices getStorePrices() { //returns the StorePrice actions reference
		// TODO Auto-generated method stub
		return new StorePrices1(this.data);
	}

	@Override
	public PayMsg getPayMsg() { //returns PayMsg action reference
		// TODO Auto-generated method stub
		return new PayMsg1();
	}

	@Override
	public StoreCash getStoreCash() { //returns storecashreference
		// TODO Auto-generated method stub
		return new StoreCash1(this.data);
	}

	@Override
	public DisplayMenu getDisplayMenu() { //returns displaymenu reference
		// TODO Auto-generated method stub
		return new DisplayMenu1(data);
	}

	@Override
	public RejectMsg getRejectMsg() { //returns RejectMsg reference
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	@Override
	public SetPrice getSetPrice() { // returns SetPrice reference
		// TODO Auto-generated method stub
		return new SetPrice1(this.data);
	}

	@Override
	public SetInitialValues getSetInitialValues() { //returns SetInitialValues reference
		// TODO Auto-generated method stub
		return new SetInitialValues1(this.data);
	}

	@Override
	public PumpGasUnit getPumpGasUnit() { //returns PumpGasUnit reference
		// TODO Auto-generated method stub
		return new PumpGasUnit1(this.data);
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() { //returns GasPumpedMsg reference
		// TODO Auto-generated method stub
		return new GasPumpedMsg1(this.data);
	}

	@Override
	public PrintReceipt getPrintReceipt() { // returns PrintReceipt reference
		// TODO Auto-generated method stub
		return new PrintReceipt1(this.data);
	}

	@Override
	public CancelMsg getCancelMsg() { // returns CanceMsg actions reference
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	@Override
	public ReturnCash getReturnCash() { // returns ReturnCash action reference
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	@Override
	public SetPayType getSetPayType() { //returns SetPayType actions reference
		// TODO Auto-generated method stub
		return new SetPayType1(this.data);
	}

	@Override
	public EjectCard getEjectCard() { // returns EjectCard action reference
		// TODO Auto-generated method stub
		return new EjectCard1();
	}

}
