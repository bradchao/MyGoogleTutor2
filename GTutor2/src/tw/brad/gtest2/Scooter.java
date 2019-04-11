package tw.brad.gtest2;

public class Scooter extends Bike {
	// super class => Bike
	public Scooter() {
		// super();
		System.out.println("Scooter()");
	}
	
	void m1() {
		System.out.println("m1()");
	}
	
	void upSpeed() {
		//super.upSpeed();
		speed = speed<1? 1.5 : speed*2.4;
	}

}
