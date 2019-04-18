package tw.brad.gtest2;

import tw.brad.gtest3.*;

public class Brad29 {

	public static void main(String[] args) {
		GTest1 obj1 = new GTest1();
		//GTest2 obj2 = new GTest2();
		obj1.m1();
		//obj1.m2();
		//obj1.m3();
		//obj1.m4();
		System.out.println(obj1.a1);
//		System.out.println(obj1.a2);
//		System.out.println(obj1.a3);
//		System.out.println(obj1.a4);
	}
}

//class Brad291 extends GTest2 {
//	
//}

class Brad292 extends GTest1 {
	void b1() {
		m1();
		m2();
//		m3();
//		m4();
	}
	
	@Override
	public void m1() {
		System.out.println("OK");
		super.m1();
		super.m2();
		this.m2();
	}

	
	public void m2() {
		super.m2();
		System.out.println("OK");
	}
	
	private void m3() {
		
	}
	private void m4() {
		
	}
	void n1() {
		
	}
	
	
}



