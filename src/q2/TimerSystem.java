package q2;

import java.util.ArrayList;
import java.util.List;

public class TimerSystem {
	List<Observer> obsLs=new ArrayList<>();
	TimerSystem(){
		obsLs.add(new DigitalClock(0,24));
		obsLs.add(new AnalogClock(1,24));
	}
	public void register(Observer obs) {
		obsLs.add(obs);
	} 
	public void deregister(Observer obs) {
		obsLs.remove(obsLs.indexOf(obs));
	}
	public void notifyTS(int hour, int minute, int second,int level) {
		for(Observer obs:obsLs) {
//			System.out.println("new");
			if(obs.getPrecision()<=level)
				obs.displayTime(hour, minute, second);

		}
	}
}
