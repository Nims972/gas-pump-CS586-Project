package mdaefsm.state;

import mdaefsm.MDA_EFSM;
// s3 state , selecting gastype , canceling transactions or continueing to next state is supported here
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
