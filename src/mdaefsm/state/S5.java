package mdaefsm.state;

import mdaefsm.MDA_EFSM;
// s5 pumps the gas unit by unit and stops the pump
public class S5 extends State{

	public S5(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}
	@Override
    public void pump() {
        if (model.s == model.LS[5]) {
            // stay in the same state
            model.getOP().pumpGasUnit();
            model.getOP().gasPumpedMsg();
        }
    }

    /*
        Transition to State S6 and call StopMsg() meta-action
     */
    @Override
    public void stopPump() {
        if (model.s == model.LS[5]) {
            model.s = model.LS[6];
        }
    }
}
