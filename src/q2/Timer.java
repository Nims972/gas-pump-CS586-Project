package q2;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timer extends TimerSystem{
	int hour,minute,second;
	
	private final ScheduledExecutorService scheduler;

    public Timer() {
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void startCallingMethodEveryMillisecond() {
        scheduler.scheduleAtFixedRate(this::tick, 0, 1, TimeUnit.MILLISECONDS);
    }
    public void setTime(int hour, int minute, int second) {
    	this.hour=hour;
    	this.minute=minute;
    	this.second=second;
    }
    public void tick() {
//        System.out.println("Method called at: " + System.currentTimeMillis());
        // Place your method implementation here
        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        if(this.hour!=zonedDateTime.getHour()) { 
        	setTime(hour,minute,second);
        	notifyTS(hour,minute,second,2);
        }
        else if(this.minute!=zonedDateTime.getMinute()) {
        	setTime(hour,minute,second);
        	notifyTS(hour,minute,second,1);
        }
        else if(this.second!=zonedDateTime.getSecond()) {
        	setTime(hour,minute,second);
        	notifyTS(hour,minute,second,0);
        }
       
    }

    public static void main(String[] args) {
    	Timer caller = new Timer();
        caller.startCallingMethodEveryMillisecond();
        
        try {
            Thread.sleep(100000); // Run for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        caller.stop();
    }

    public void stop() {
        scheduler.shutdown();
    }
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	public String ampm() {
		if(hour>=12)return "PM";
		else return "AM";
	}
	
	
}


