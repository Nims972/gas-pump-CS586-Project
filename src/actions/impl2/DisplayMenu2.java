package actions.impl2;

import actions.abs.DisplayMenu;
import datastore.DS_2;
import datastore.DataSource;
//displaymenu impl for gp2
public class DisplayMenu2 extends DisplayMenu{

	public DisplayMenu2(DataSource data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		DS_2 d = (DS_2) data;
        System.out.println("Please select gas type: ");
        System.out.println("(4) Regular [$" + d.getRprice() + "/gallon] " 
        		+ "\n(5) Diesel [$" + d.getDprice()+ "/gallon] " 
        		+ "\n(6) Premium [$" + d.getPprice() + "/gallon]");
	}

}
