package q2;

public interface Observer {
	
//	TimerSystem tsys=new TimerSystem();
	void displayTime(int hour, int minute, int second);
	int getPrecision();
}
