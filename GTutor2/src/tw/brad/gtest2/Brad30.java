package tw.brad.gtest2;

public class Brad30 {
	public static void main(String[] args) {
		Brad301 obj1 = new Brad301();
		obj1.m1();
		obj1.m1(12);
		obj1.m1((byte)12);
//		obj1.m1((byte)1, (byte)2);
		obj1.m1((byte)1, 2);
		
		obj1.m2();
		obj1.m2(1);
		obj1.m2(1,2);
		obj1.m2(1,2,3);
		obj1.m2(1,2,3,4);
		obj1.m2(new int[]{1,2,3});
		obj1.sayYa("Hello", "Brad", "Mary", "Joe");
	}
}
class Brad301 {
	void m1() {System.out.println("()");}
	//void m1(byte a) {System.out.println("(byte)");}
	int m1(short b) {System.out.println("(short)");return 1;}
	int m1(int b) {System.out.println("(int)");return 1;}
	//void m1(byte a, byte b) {System.out.println("(byte,byte)");}
	void m1(byte c, int d) {System.out.println("(byte,int)");}
	void m1(int c, byte d) {System.out.println("(int,byte)");}
	
	//void m2() {System.out.println("m2()");}
	//void m2(int a) {System.out.println("m2(int)");}
	void m2(int a, int b) {System.out.println("m2(int,int)");}
	void m2(int... a) {System.out.println("m2(int...)");}
//	void m2(int[] a) {System.out.println("m2(int[])");}
	
	void sayYa(String prefix, String...names) {
		for (String name : names) {
			System.out.println(prefix + ", " + name);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}