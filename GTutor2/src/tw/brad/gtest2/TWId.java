package tw.brad.gtest2;

public class TWId {
	private String id;
	public TWId() {
		
	}
	public TWId(boolean gender) {
		
	}
	public TWId(int area) {
		
	}
	public TWId(boolean gender, int area) {
		
	}
	private TWId(String id){
		
	}
	public String getId() {return id;}

	public static boolean isRightId(String id) {
		return true;
	}
	
	
}
