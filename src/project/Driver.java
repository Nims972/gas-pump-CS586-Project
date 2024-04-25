package project;

import java.util.Scanner;

import absfactory.CF_GP1;
import absfactory.CF_GP2;
import gaspump.GasPump_1;
import gaspump.GasPump_2;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void driveGP1() {
		CF_GP1 cf1 = new CF_GP1();
		GasPump_1 gp1 = new GasPump_1(cf1);

		System.out.print("                          GasPump-1");
		System.out.print("\n");
		System.out.print("                  MENU of Operations");
		System.out.print("\n");
		System.out.print("          0. Activate(int)");
		System.out.print("\n");
		System.out.print("          1. Start()");
		System.out.print("\n");
		System.out.print("          2. PayCredit");
		System.out.print("\n");
		System.out.print("          3. Reject()");
		System.out.print("\n");
		System.out.print("          4. Cancel()");
		System.out.print("\n");
		System.out.print("          5. Approved()");
		System.out.print("\n");
		System.out.print("          6. PayCash(int)");
		System.out.print("\n");
		System.out.print("          7. StartPump()");
		System.out.print("\n");
		System.out.print("          8. Pump()");
		System.out.print("\n");
		System.out.print("          9. StopPump()");
		System.out.print("\n");
		System.out.print("          q. Quit the program");
		System.out.print("\n");

		System.out.print("  Please make a note of these operations");
		System.out.print("\n");
		System.out.print("           GasPump-1 Execution");
		System.out.print("\n");
		char ch = '1';
		
		while (ch != 'q') {
			System.out.print("  Select Operation: ");
			System.out.print("\n");
			System.out.print(
					"0-Activate,1-Start,2-PayCredit,3-Reject, 4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
			System.out.print("\n");
			ch = sc.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.print("  Operation:  Activate(int a)");
				System.out.print("\n");
				System.out.print("  Enter value of the parameter a:");
				System.out.print("\n");
				int a = sc.nextInt();
				gp1.activate(a);
				break;
			}

			case '1': { // Start
				System.out.print("  Operation:  Start()");
				System.out.print("\n");
				gp1.start();
				break;
			}

			case '2': { // PayCredit
				System.out.print("  Operation:  PayCredit()");
				System.out.print("\n");
				gp1.payCredit();
				break;
			}

			case '3': { // Reject
				System.out.print("  Operation:  Reject()");
				System.out.print("\n");
				gp1.reject();
				break;
			}

			case '4': { // Cancel
				System.out.print("  Operation:  Cancel()");
				System.out.print("\n");
				gp1.cancel();
				break;
			}

			case '5': { // Approved
				System.out.print("  Operation:  Approved()");
				System.out.print("\n");
				gp1.approved();
				break;
			}

			case '6': { // PayCash
				System.out.print("  Operation:  PayCash(int c)");
				System.out.print("\n");
				System.out.print("  Enter value of the parameter c:");
				System.out.print("\n");
				int c = sc.nextInt();
				gp1.payCash(c);
				break;
			}

			case '7': { // StartPump
				System.out.print("  Operation:  StartPump()");
				System.out.print("\n");
				gp1.startPump();
				break;
			}

			case '8': { // Pump
				System.out.print("  Operation: Pump()");
				System.out.print("\n");
				gp1.pump();
				break;
			}

			case '9': { // StopPump
				System.out.print("  Operation:  StopPump()");
				System.out.print("\n");
				gp1.stopPump();
				break;
			}
			}
			; // endswitch

		}
		; // endwhile
	}

	public static void driveGP2() {
		CF_GP2 cf2 = new CF_GP2();
		GasPump_2 gp2 = new GasPump_2(cf2);

		System.out.print("                          GasPump-2");
		System.out.print("\n");
		System.out.print("                  MENU of Operations");
		System.out.print("\n");
		System.out.print("          0. Activate(float,float,float)");
		System.out.print("\n");
		System.out.print("          1. Start()");
		System.out.print("\n");
		System.out.print("          2. PayCash");
		System.out.print("\n");
		System.out.print("          3. Cancel()");
		System.out.print("\n");
		System.out.print("          4. Regular()");
		System.out.print("\n");
		System.out.print("          5. Diesel()");
		System.out.print("\n");
		System.out.print("          6. Premium");
		System.out.print("\n");
		System.out.print("          7. StartPump()");
		System.out.print("\n");
		System.out.print("          8. Stop()");
		System.out.print("\n");
		System.out.print("          9. PumpGallon()");
		System.out.print("\n");
		System.out.print("          10. Receipt()");
		System.out.print("\n");
		System.out.print("          11. NoReceipt()");
		System.out.print("\n");
		System.out.print("          -1. Quit the program");
		System.out.print("\n");

		System.out.print("  Please make a note of these operations");
		System.out.print("\n");
		System.out.print("           GasPump-2 Execution");
		System.out.print("\n");
		int ch = 1;
		
		while (ch != -1) {
			System.out.print("  Select Operation: ");
			System.out.print("\n");
			System.out.print(
					"0-Activate,1-Start,2-PayCash,3-Cancel, 4-Regular,5-Diesel,6-Premium,"
					+ "7-StartPump, 8-Stop, 9-PumpGallon, 10-Receipt, 11 NoReceipt, -1 -quit");
			System.out.print("\n");
			ch = sc.nextInt();
			switch (ch) {
			case 0: { // Activate()
				System.out.print("  Operation:  Activate(float a, float b, float c)");
				System.out.print("\n");
				System.out.print("  Enter value of the parameter a b c (Regular , Premium, Diesel):");
				System.out.print("\n");
				float a = sc.nextFloat();
				float c = sc.nextFloat();
				float b = sc.nextFloat();
				
				gp2.activate(a,b,c);
				break;
			}

			case 1: { // Start
				System.out.print("  Operation:  Start()");
				System.out.print("\n");
				gp2.start();
				break;
			}

			case 2: { // paycash
				System.out.print("  Operation:  PayCash(int c)");
				System.out.print("\n");
				System.out.print("  Enter value of the parameter c:");
				System.out.print("\n");
				int c = sc.nextInt();
				gp2.payCash(c);
				break;
			}

			case 3: { // cancel
				System.out.print("  Operation:  Cancel()");
				System.out.print("\n");
				gp2.cancel();
				break;
			}

			case 4: { // Regular
				System.out.print("  Operation:  Regular()");
				System.out.print("\n");
				gp2.regular();
				break;
			}

			case 5: { // Diesel
				System.out.print("  Operation:  Diesel()");
				System.out.print("\n");
				gp2.diesel();
				break;
			}

			case 6: { // Premium
				System.out.print("  Operation:  Premium(int c)");
				System.out.print("\n");
				gp2.premium();
				break;
			}

			case 7: { // StartPump
				System.out.print("  Operation:  StartPump()");
				System.out.print("\n");
				gp2.startPump();
				break;
			}

			case 8: { // stop
				System.out.print("  Operation: Stop()");
				System.out.print("\n");
				gp2.stop();
				break;
			}

			case 9: { // StopPump
				System.out.print("  Operation:  PumpGallon()");
				System.out.print("\n");
				gp2.pumpGallon();
				break;
			}
			case 10: { // receipt
				System.out.print("  Operation:  Receipt()");
				System.out.print("\n");
				gp2.receipt();;
				break;
			}
			case 11: { // noreceipt
				System.out.print("  Operation:  NoReceipt()");
				System.out.print("\n");
				gp2.noReceipt();
				break;
			}
			}
			; // endswitch

		}
		; // endwhile
	}

	public static void main(String[] args) { // partial driver
		System.out.println("Select GasPump to Operate\n(1) GasPump1 \n(2)GasPump2");
		int gpSelected=sc.nextInt();
		if(gpSelected==1)driveGP1();
		if(gpSelected==2)driveGP2();
	}
}