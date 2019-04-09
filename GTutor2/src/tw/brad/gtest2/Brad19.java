package tw.brad.gtest2;

public class Brad19 {
	public static void main(String[] args) {
		Bike b1 = new Bike(1);
		Bike b2 = new Bike(2);
		
		//b1.speed = 10;
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		b2.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		System.out.println(b2.getSpeed());
		
		
	}
}
