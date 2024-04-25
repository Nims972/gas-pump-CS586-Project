package mdaefsm.state;

import mdaefsm.MDA_EFSM;

public class S2 extends State{

	public S2(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
	public void approved() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            model.getOP().displayMenu();
            
        }	
    }

    /*
        Transition to State S0 and call RejectMsg() meta-action
     */
    @Override
    public void reject() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            model.getOP().rejectMsg();
        }
    }
}
