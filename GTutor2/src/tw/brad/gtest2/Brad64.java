package tw.brad.gtest2;

import java.util.HashSet;
import java.util.Iterator;

public class Brad64 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("Brad");
		set.add(123);	// int => auto-boxing => Integer
		set.add(12.3);
		System.out.println(set.size());
		set.add("Brad");
		System.out.println(set.size());
		System.out.println(set.toString());
		
		Iterator it =  set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj.getClass().getName() + ":" + obj.toString());
		}
		System.out.println("----");
		
		for(Object obj : set) {
			System.out.println(obj.getClass().getName() + ":" + obj.toString());
		}
		
		
		
	}

}
