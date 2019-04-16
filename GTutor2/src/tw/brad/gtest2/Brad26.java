package tw.brad.gtest2;

public class Brad26 {
	public static void main(String[] args) {
		//System.out.println(Brad261.b);
		
//		Brad261 obj1 = new Brad261();
//		Brad261 obj2 = new Brad261();
//		Brad261 obj3 = new Brad261();
		//obj1.m1();
		
		Brad263 obj4 = new Brad263();
		
	}
}
class Brad261 {
	int a = 10;
	static int b;
	{
		System.out.println("{}" + a);
	}
	Brad261(){System.out.println("Brad261()");}
	void m1() {System.out.println("Brad261:m1()");}
	static {
		System.out.println("static{}");
	}
}
class Brad262 extends Brad261 {
	static{System.out.println("static Brad262");}
}
class Brad263 extends Brad262 {
	static{System.out.println("static Brad263");}

}






