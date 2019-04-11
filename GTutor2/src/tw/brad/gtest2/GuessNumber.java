package tw.brad.gtest2;

public class GuessNumber {
	public static void main(String[] args) {
		// 1. Create an answer
		String answer = createAnswer(4);
		System.out.println(answer);
		
		// 2. Interactive user
		// 		2-1. prompt guess number
		//		2-1. check ? A ?B
		//		2-3. error => re-prompt
		//		2-4. success
		
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		String ret = "";
		for (int i=0; i<d; i++) {
			ret += poker[i];
		}
		
		return ret;
	}
	
	
	
}
