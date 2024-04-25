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

public class CF_GP2 extends AbstractFactory{
	DataSource data;
	public CF_GP2(){
		data=new DS_2();
	}
	@Override
	public DataSource getDataObj() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public StorePrices getStorePrices() {
		// TODO Auto-generated method stub
		return new StorePrices2(this.data);
	}

	@Override
	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash2(this.data);
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2(data);
	}

	@Override
	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	@Override
	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2(this.data);
	}

	@Override
	public SetInitialValues getSetInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues2(this.data);
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2(this.data);
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg2(this.data);
	}

	@Override
	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2(this.data);
	}

	@Override
	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash2(this.data);
	}

	@Override
	public SetPayType getSetPayType() {
		// TODO Auto-generated method stub
		return new SetPayType2(this.data);
	}

	@Override
	public EjectCard getEjectCard() {
		// TODO Auto-generated method stub
		return new EjectCard2();
	}

}
