package tw.brad.gtest2;

public class Brad23 {
	public static void main(String[] args) {
		String id = "A223456789mac7";
		// [a-zA-Z$_][a-zA-Z0-9$_]*
		// 192.168.3.4
		if (id.matches("[A-Za-z][12][0-9]{8}(mac|unix)\\d")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
		
		
	}
}
