package tw.brad.gtest2;

public class Brad31 {
	public static void main(String[] args) {
		Brad311 obj1 = new Brad311();
		Brad311 obj2 = new Brad312();

		m1(obj1); m1(obj2);
		
	}
	static void m1(Brad311 obj) {
		System.out.println("A");
		obj.upSpeed();
	}
	static void m1(Brad312 obj) {
		System.out.println("B");
	}
	static void m1(Brad313 obj) {
		System.out.println("C");
	}
}
class Brad311{
	void upSpeed() {System.out.println("Brad311:m1()");}
}
class Brad312 extends Brad311{
	void upSpeed(){System.out.println("Brad312:m1()");}
	void turbo(){System.out.println("Brad312:m2()");}
}
class Brad313 extends Brad312{}
