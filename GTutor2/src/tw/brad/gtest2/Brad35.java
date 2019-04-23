package tw.brad.gtest2;

public class Brad35 {

	public static void main(String[] args) {
		//Brad351 obj1 = new Brad351();
		Brad351 obj2 = new Brad352();
		Brad353 obj3 = new Brad352();
		
		obj2.m1(); obj2.m2();
		obj3.m3(); obj3.m4();
		
		Brad351 obj4 = new Brad352();
		Brad353 obj5 = (Brad353)obj4;
		obj5.m3(); obj5.m4();
		
		if (obj5 instanceof Brad354 ) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
	}

}
// public
interface Brad351 {
	// abstract
	void m1();
	void m2();
}
class Brad352 implements Brad351, Brad353 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
interface Brad353 {
	// abstract
	void m3();
	void m4();
}
class Brad354{}
