package tw.brad.gtest2;

public class Brad40 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(-1);
			System.out.println("set leg ok");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

class Bird {
	private int leg;
	
	void setLeg(int n) throws Exception {
		if (n>=0 && n<=2) {
			leg = n;
		}else {
			throw new Exception("ee");
		}
	}
}
