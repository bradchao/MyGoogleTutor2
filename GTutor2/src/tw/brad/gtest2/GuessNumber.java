package tw.brad.gtest2;

import javax.swing.JOptionPane;

public class GuessNumber extends Object {
	public static void main(String[] args) {
		int n = 3;
		// 1. Create an answer
		String answer = createAnswer(n);
		//System.out.println(answer);

		boolean isWinner = false;
		for (int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog("Input a number:");
			if (guess != null) {
				String result = checkAB(answer, guess);
				//System.out.println(guess + " => " + result);
				
				JOptionPane.showMessageDialog(null, guess + " => " + result);
				
				if (result.equals(n + "A0B")) {
					isWinner = true;
					break;
				}
			}
		}
		
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "Winner!");
		}else {
			JOptionPane.showMessageDialog(null, "Loser, answer = " + answer);
		}
		
		
		
	}

	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) >= 0){
				B++;
			}
		}
		return A + "A"+ B + "B";
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
