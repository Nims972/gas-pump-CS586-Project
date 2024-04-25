package mdaefsm.state;

import mdaefsm.MDA_EFSM;

public class S1 extends State{

	public S1(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
	public void payType(int t) {
        if (model.s == model.LS[1]) {
            if(t==0) {
            	model.s=model.LS[3];
            	model.getOP().storeCash();
                model.getOP().displayMenu();
                model.getOP().setPayType(t); // check
                
            } else if(t==1) {
            	model.s=model.LS[2];
            	model.getOP().setPayType(t);
            }
        	
        }
	 
	}
}
