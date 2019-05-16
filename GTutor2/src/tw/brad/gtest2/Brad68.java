package tw.brad.gtest2;

public class Brad68 {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1("A");
		
		MyRunnable mr2 = new MyRunnable("B");
		Thread mt2 = new Thread(mr2);
		
		mt1.start();
		mt2.start();
		System.out.println("main");
	}
}

class MyThread1 extends Thread {
	private String name;
	MyThread1(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}

class MyRunnable implements Runnable {
	private String name;
	MyRunnable(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}







