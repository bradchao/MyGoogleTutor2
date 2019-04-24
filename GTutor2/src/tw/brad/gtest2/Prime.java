package tw.brad.gtest2;

public class Prime {
	public static void main(String[] args) {
		boolean isPrime;	// 是否為質數旗標
		
		for (int i=1; i<=100; i++) {
			isPrime = true;
			for (int j=2; j<=(int)(Math.sqrt(i)); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			//處理顯示內容
			if (isPrime) {
				System.out.printf("%4d*", i);
			}else {
				System.out.printf("%4d ", i);
			}
			//逢十換列
			if (i % 10 == 0) System.out.println();
		}
	}
}
