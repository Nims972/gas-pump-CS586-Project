package mdaefsm.state;

import mdaefsm.MDA_EFSM;
//s6 handles printing / no printing receipts
public class S6 extends State{

	public S6(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
    public void receipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().printReceipt();
            model.getOP().returnCash();
        }
    }

    /*
        Transition to State S0 and call ReturnCash() meta-actions
     */
    @Override
    public void noReceipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().returnCash();
        }
    }
}
