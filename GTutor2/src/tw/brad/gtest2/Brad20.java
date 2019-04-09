package tw.brad.gtest2;

public class Brad20 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97, 98, 99, 100};
		String s2 = new String(b1);
		String s3 = new String(b1,1,2);
		String s4 = "Brad";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("Brad".charAt(2));
		
		Bike b2 = new Bike(1);
		System.out.println(b2);
		
		int[] a1 = new int[3];
		System.out.println(a1);
		
		int c = 10;
	}

}
