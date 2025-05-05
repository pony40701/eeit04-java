package tw.pony.tutor;

import java.util.Timer;
import java.util.TimerTask;

public class Pony64 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new Pony641(), 0, 1*100);
		timer.schedule(new StopTask(timer), 10*1000);
		System.out.println("main finish");
	}
}
class Pony641 extends TimerTask{
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}
class StopTask extends TimerTask{
	private Timer timer;
	public StopTask(Timer timer) {
		this.timer = timer;
	}
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}