package mdaefsm.state;

import mdaefsm.MDA_EFSM;

public class InitialState extends State{

	public InitialState(MDA_EFSM model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void activate() {
		if (model.s == model.LS[7]) {
            model.s = model.LS[0];
            model.getOP().storePrice();
        }
	}
}
