package tw.brad.gtest2;

import java.util.Timer;
import java.util.TimerTask;

public class Brad69 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask task1 = new MyTask();
		MyTask2 task2 = new MyTask2(timer);
		
		timer.schedule(task1, 3*1000, 1000);
		timer.schedule(task2, 10*1000);
		
		System.out.println("Main");
	}
	
}
class MyTask extends TimerTask {
	int i;
	@Override
	public void run() {
		System.out.println("OK: " + i++);
	}
}
class MyTask2 extends TimerTask {
	Timer myTask;
	MyTask2(Timer task){myTask = task;}
	@Override
	public void run() {
		myTask.cancel();
		myTask.purge();
		myTask = null;
	}
}
