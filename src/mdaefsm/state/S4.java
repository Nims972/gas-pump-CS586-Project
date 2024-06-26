package mdaefsm.state;

import mdaefsm.MDA_EFSM;
// s4 only supports starting the pump , which sets initial values 
public class S4 extends State{

	public S4(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
    public void startPump() {
        if (model.s == model.LS[4]) {
            model.s = model.LS[5];
            model.getOP().setInitialValue();
        }
    }
}
