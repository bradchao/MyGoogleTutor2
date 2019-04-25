package tw.brad.gtest2;

public class Brad38 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		int[] d = {1,2,3,4};
		
		try {
			System.out.println(d[2]);
			System.out.println("OK");
			c = a / b;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("xxxx" + ae.toString());
		}catch(ArithmeticException ee) {
			System.out.println("X1");
		}catch(RuntimeException ee) {
			System.out.println("X2");
		}finally {
			System.out.println("Brad");
		}
		
		System.out.println("Game over");
	}

}
