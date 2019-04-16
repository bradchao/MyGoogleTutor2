package tw.brad.gtest2;

public class Brad27 {

	public static void main(String[] args) {
		TWId id1 = new TWId(false, 1);
		System.out.println(id1.getId());
		if (TWId.isRightId(id1.getId())) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		TWId id2 = TWId.createTWId("A123456789");
		if (id2 != null) {
			System.out.println(id2.getId());
		}else {
			System.out.println("xxx");
		}
		
	}

}
