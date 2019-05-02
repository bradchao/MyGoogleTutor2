package tw.brad.gtest2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad49 {

	public static void main(String[] args) {

		try {
			DataOutputStream dout = 
					new DataOutputStream(
							new FileOutputStream("mytest/test4.dat"));
			dout.writeInt(123);
			dout.writeBoolean(true);
			//dout.writeDouble(12.3);
			
			dout.flush();
			dout.close();
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
