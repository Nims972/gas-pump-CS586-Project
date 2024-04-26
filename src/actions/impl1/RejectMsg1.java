package actions.impl1;

import actions.abs.RejectMsg;
// rejectmsg impl for gp1
public class RejectMsg1 extends RejectMsg{

	@Override
	public void rejectMsg() {
		// TODO Auto-generated method stub
		System.out.println("CREDIT CARD REJECTED");
        System.out.println("Cancelling transaction ...");
	}

}
