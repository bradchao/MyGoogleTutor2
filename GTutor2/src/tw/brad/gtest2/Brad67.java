package tw.brad.gtest2;

import java.util.HashMap;
import java.util.Set;

public class Brad67 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("age", 18);
		map.put("gender", true);
		
		System.out.println(map.size());
		System.out.println(map.get("name"));
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
	}

}
