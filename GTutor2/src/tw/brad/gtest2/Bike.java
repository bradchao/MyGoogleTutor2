package tw.brad.gtest2;

public class Bike extends Object{
	private double speed;
	
	
	Bike(){
		System.out.println("Bike()");
	}
	
	Bike(int speed){
		// super();
		this.speed = speed;
		System.out.println("Bike(int)");
	}
	
	void upSpeed() {
		speed = speed<1? 1 : speed*1.2;
	}
	void upSpeed(int gear) {
		speed = speed<1? 1 : speed*(1.2+gear);
	}
	void downSpeed() {
		speed = speed<1? 0 : speed*0.7;
	}
	double getSpeed() {
		return speed;
	}
	
	public String toString() {
		return "OK";
	}
	
	
	
}
