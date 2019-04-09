package tw.brad.gtest2;

public class Brad16 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		int i = 1;
		int sum = 0;
		int n = 100;
		while (i<=n) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d", n , sum);

		
	}

}
