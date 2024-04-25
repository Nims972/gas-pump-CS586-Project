package q2;

public class DigitalClock implements Observer{
	
	int precision=0;
	int format=24;
	public int getPrecision() {
		return precision;
	}
	public int getFormat() {
		return format;
	}
	public DigitalClock() {}
	public DigitalClock(int precision,int format) {
		this.precision=precision;
		this.format=format;
	}
	@Override
	public void displayTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub
		
		System.out.println("DC " + hour + " " + minute + " " + second);
	}

	

}
