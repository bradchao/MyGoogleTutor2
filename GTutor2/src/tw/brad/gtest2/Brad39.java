package tw.brad.gtest2;

public class Brad39 {

	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		int a = 10, b = 0;
		try {
			System.out.println("OK1");
			System.out.println(a / b);
		}catch (Exception  e) {
			System.out.println(e.toString());
			return;
		}finally {
			System.out.println("Brad");
		}
		
		System.out.println("normal finish");
		
	}
	

}
