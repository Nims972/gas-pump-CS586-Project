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
import actions.impl2.CancelMsg2;
import actions.impl2.DisplayMenu2;
import actions.impl2.EjectCard2;
import actions.impl2.GasPumpedMsg2;
import actions.impl2.PayMsg2;
import actions.impl2.PrintReceipt2;
import actions.impl2.PumpGasUnit2;
import actions.impl2.RejectMsg2;
import actions.impl2.ReturnCash2;
import actions.impl2.SetInitialValues2;
import actions.impl2.SetPayType2;
import actions.impl2.SetPrice2;
import actions.impl2.StoreCash2;
import actions.impl2.StorePrices2;
import datastore.DS_2;
import datastore.DataSource;
/*
 * this is factory class for GP2 and provides necessary "actions" strategies. 
 * this is also having datasource and handling of which type of data needs to be initiated happens here.
*/
public class CF_GP2 extends AbstractFactory{
	DataSource data;
	public CF_GP2(){
		data=new DS_2(); //datasource reference which will be passed
	}
	@Override
	public DataSource getDataObj() {//returns the data reference
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public StorePrices getStorePrices() {//returns the StorePrice actions reference
		// TODO Auto-generated method stub
		return new StorePrices2(this.data);
	}

	@Override
	public PayMsg getPayMsg() {//returns PayMsg action reference
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	@Override
	public StoreCash getStoreCash() {//returns storecashreference
		// TODO Auto-generated method stub
		return new StoreCash2(this.data);
	}

	@Override
	public DisplayMenu getDisplayMenu() {//returns displaymenu reference
		// TODO Auto-generated method stub
		return new DisplayMenu2(data);
	}

	@Override
	public RejectMsg getRejectMsg() {//returns RejectMsg reference
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	@Override
	public SetPrice getSetPrice() {// returns SetPrice reference
		// TODO Auto-generated method stub
		return new SetPrice2(this.data);
	}

	@Override
	public SetInitialValues getSetInitialValues() {//returns SetInitialValues reference
		// TODO Auto-generated method stub
		return new SetInitialValues2(this.data);
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {//returns PumpGasUnit reference
		// TODO Auto-generated method stub
		return new PumpGasUnit2(this.data);
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {//returns GasPumpedMsg reference
		// TODO Auto-generated method stub
		return new GasPumpedMsg2(this.data);
	}

	@Override
	public PrintReceipt getPrintReceipt() {// returns PrintReceipt reference
		// TODO Auto-generated method stub
		return new PrintReceipt2(this.data);
	}

	@Override
	public CancelMsg getCancelMsg() {// returns CanceMsg actions reference
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	@Override
	public ReturnCash getReturnCash() {// returns ReturnCash action reference
		// TODO Auto-generated method stub
		return new ReturnCash2(this.data);
	}

	@Override
	public SetPayType getSetPayType() {//returns SetPayType actions reference
		// TODO Auto-generated method stub
		return new SetPayType2(this.data);
	}

	@Override
	public EjectCard getEjectCard() {// returns EjectCard action reference
		// TODO Auto-generated method stub
		return new EjectCard2();
	}

}
