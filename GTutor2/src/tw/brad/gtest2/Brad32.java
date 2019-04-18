package tw.brad.gtest2;

public class Brad32 {
	public static void main(String[] args) {

	}
}
class Brad321 {
	void m1() {}
	int m2() {return 1;}
	String m3() {return "";}
	Brad323 m4() {return new Brad323();}
}
class Brad322 extends Brad321 {
	void m1() {}
	int m2() {
		return 1;
	}
	byte m2(int a) {
		return (byte)1;
	}
	
	String m3(){return "";}
	Brad324 m4() {return new Brad324();}
}

class Brad323{}
class Brad324 extends Brad323{}





