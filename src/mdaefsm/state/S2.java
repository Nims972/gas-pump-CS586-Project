package mdaefsm.state;

import mdaefsm.MDA_EFSM;
//s2 state approve or reject only 2 actions are supported this is for credit card
public class S2 extends State{

	public S2(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
	public void approved() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            model.getOP().displayMenu();
            model.getOP().setPayType(1);
            model.getOP().ejectCard();
        }	
    }

    @Override
    public void reject() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            model.getOP().rejectMsg(); 
            model.getOP().ejectCard();
        }
    }
}
