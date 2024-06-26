package mdaefsm.state;

import mdaefsm.MDA_EFSM;
// abstract state class in execution of whole transactions,
public abstract class State {
	String OPERATION_NOT_ALLOWED_MSG = "Operation Not Allowed";
	MDA_EFSM model;

	public State(MDA_EFSM model) {
		this.model = model;
	}

	public void activate() {
		notAllowed();
	}

	public void start() {
		notAllowed();
	}

	public void payType(int t) {
		notAllowed();
	}

	public void reject() {
		notAllowed();
	}

	public void cancel() {
		notAllowed();
	}

	public void approved() {
		notAllowed();
	}

	public void startPump() {
		notAllowed();
	}

	public void pump() {
		notAllowed();
	}

	public void stopPump() {
		notAllowed();
	}

	public void selectGas(int g) {
		notAllowed();
	}

	public void receipt() {
		notAllowed();
	}

	public void noReceipt() {
		notAllowed();
	}

	public void continue_() {
		notAllowed();
	}

	public void notAllowed() {
		System.out.println(OPERATION_NOT_ALLOWED_MSG);
	}
}
