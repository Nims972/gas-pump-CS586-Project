package mdaefsm.state;

import mdaefsm.MDA_EFSM;

public class S3 extends State{

	public S3(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
    public void selectGas(int g) {
        if (model.s == model.LS[3]) {
//            model.s = model.LS[4];
            model.getOP().setPrice(g);
        }
    }

    /*
        Transition to State S0 and call CancelMsg() and ReturnCash() meta-actions
     */
    @Override
    public void cancel() {
        if (model.s == model.LS[3]) {	
            model.s = model.LS[0];
            model.getOP().cancelMsg();
            model.getOP().returnCash();
        }
    }
    @Override
    public void continue_() {
    	if(model.s==model.LS[3]) {
    		model.s=model.LS[4];
    		
    	}
    }
}
