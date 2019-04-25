package tw.brad.gtest2;

import java.awt.FontFormatException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Brad40 {

	public static void main(String[] args) throws Exception {
		Bird b1 = new Bird();
		try {
			b1.setLeg(-1);
			System.out.println("set leg ok");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		m1();
	}
	
	static void m1() throws Exception{
		m2();
	}
	
	static void m2() throws Exception {
		m3();
	}
	
	static void m3() throws Exception {
//		try {
			throw new Exception();
//		}catch(Exception ee){
//			
//		}
	}
	

}

class Bird {
	private int leg;
	
	void setLeg(int n) throws IOException, JAXBException{
		if (n>=0 && n<=2) {
			leg = n;
		}else if (n<0){
			throw new IOException();
		}else if (n>2){
			throw new JAXBException("xx");
		}
	}
}
class BirdV2 extends Bird {
	void setLeg(int n) throws IOException {
		//throw new FontFormatException("aaa");
	}
}




