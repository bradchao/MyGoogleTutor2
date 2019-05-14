package tw.brad.gtest2;

import java.util.HashSet;

public class Brad65 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while (set.size()<6) {
			System.out.println("debug");
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		
	}

}
