package q2;

public class AnalogClock implements Observer{
	int precision=1;
	int format=24;
	public int getPrecision() {
		return precision;
	}
	public int getFormat() {
		return format;
	}
	public AnalogClock() {}
	public AnalogClock(int precision,int format) {
		this.precision=precision;
		this.format=format;
	}
	@Override
	public void displayTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub
	
		System.out.println("AC "+ hour + " " + minute + " " + second);
	}

}
