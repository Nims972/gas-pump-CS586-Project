package mdaefsm;

import mdaefsm.state.InitialState;
import mdaefsm.state.S0;
import mdaefsm.state.S1;
import mdaefsm.state.S2;
import mdaefsm.state.S3;
import mdaefsm.state.S4;
import mdaefsm.state.S5;
import mdaefsm.state.S6;
import mdaefsm.state.State;
import project.OP;
// mda_efsm class that manages diff implemantations of opeations and provides state wise control here.
public class MDA_EFSM {
	public State s; // current state 
	public State[] LS; // list of all state
	OP op;
	 public MDA_EFSM() {
	        // list of states in the EFSM
	        LS = new State[8];

	        // instantiate each state, passing in a reference to this VM class
	        LS[7] = new InitialState(this);
	        LS[0] = new S0(this);
	        LS[1] = new S1(this);
	        LS[2] = new S2(this);
	        LS[3] = new S3(this);
	        LS[4] = new S4(this);
	        LS[5] = new S5(this);
	        LS[6] = new S6(this);

	        s = LS[7]; // Initially in the Initial State
	    }
	public void activate() {
		s.activate();
	}
	public void start() {
		s.start();
	}
	public void payType(int t) {
		s.payType(t);
	}
	public void reject() {
		s.reject();
	}
	public void cancel() {
		s.cancel();
	}
	public void approved() {
		s.approved();
	}
	public void startPump() {
		s.startPump();
	}
	public void pump() {
		s.pump();
	}
	public void stopPump() {
		s.stopPump();
	}
	public void selectGas(int g) {
		s.selectGas(g);
	}
	public void receipt() {
		s.receipt();
	}
	public void noReceipt() {
		s.noReceipt();
	}
	public void continue_() {
		s.continue_();
	}
	public OP getOP() {
        return op;
    }
    public void setOP(OP op) {
        this.op = op;
    }
}
