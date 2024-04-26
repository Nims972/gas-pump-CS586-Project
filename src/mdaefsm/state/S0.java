package mdaefsm.state;

import mdaefsm.MDA_EFSM;
// S0 state , start is supported
public class S0 extends State {

	public S0(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}

	@Override
	public void start() {
		if (model.s == model.LS[0]) {
			model.s = model.LS[1];
			model.getOP().payMsg();
		}

	}
}
