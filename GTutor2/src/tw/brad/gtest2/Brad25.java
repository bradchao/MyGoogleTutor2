package tw.brad.gtest2;

public class Brad25 {
	public static void main(String[] args) {
		System.out.println(Brad251.b);
		Brad251.m2();
		Brad251 obj1 = new Brad251();
		Brad251 obj2 = new Brad251();
		Brad251 obj3 = new Brad251();
		Brad251 obj4 = new Brad251();
		obj1.m1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
}

class Brad251 {
	int a;
	static int b;
	
	Brad251(){
		a++;
		b++;
	}
	
	void m1() {
		System.out.println("Brad251:m1()");
	}
	static void m2() {
		System.out.println("Brad251:m2()"+b );
	}
}
