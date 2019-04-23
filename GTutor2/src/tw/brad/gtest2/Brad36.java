package tw.brad.gtest2;

public class Brad36 {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		Shape s2 = new Rectangle();
		doSomething(s2);
	}
	
	static void doSomething(Shape shape) {
		shape.calLength();
		shape.calArea();
		
//		((Triangle)shape).m1();
		
		if (shape instanceof Triangle ) {
			System.out.println("ttt");
			((Triangle)shape).m1();
		}else if (shape instanceof Rectangle) {
			System.out.println("rrr");
			((Rectangle)shape).m2();
		}
	}
	
}
interface Shape {
	void calLength();
	void calArea();
}
class Triangle implements Shape {
	public void calLength() {System.out.println("Triangle:length");}
	public void calArea() {System.out.println("Triangle:area");}
	void m1() {System.out.println("T:m1()");}
}
class Rectangle implements Shape {
	public void calLength() {System.out.println("Recangle:length");}
	public void calArea() {System.out.println("Recangle:length");}
	void m2() {System.out.println("R:m2()");}
}
