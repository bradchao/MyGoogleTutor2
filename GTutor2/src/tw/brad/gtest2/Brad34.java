package tw.brad.gtest2;

public class Brad34 {

	public static void main(String[] args) {
		// Brad341 obj1 = new Brad341();
		// Brad345 obj2 = new Brad345();
		Brad341 obj3 = new Brad342();
		obj3.m1();
		obj3.m2();
	}

}

abstract class Brad341 {
	void m1() {}
	abstract void m2() ;
}
class Brad342 extends Brad341 {
	void m2() {
		System.out.println("Brad342:m2()");
	}
}
abstract class Brad343 extends Brad341 {
	
}
class Brad344 extends Brad343 {
	void m2() {}
}
abstract class Brad345 {
	
}



