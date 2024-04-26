package actions.impl1;

import actions.abs.DisplayMenu;
import datastore.DS_1;
import datastore.DataSource;
//displaymenu impl for gp1
public class DisplayMenu1 extends DisplayMenu{
	public DisplayMenu1(DataSource data) {
        super(data);
    }
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		DS_1 d = (DS_1) data;
	    System.out.println("Regular [$" + d.getPrice()+ "/liter] " );
	}
	
}
