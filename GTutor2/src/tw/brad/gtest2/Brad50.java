package tw.brad.gtest2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad50 {

	public static void main(String[] args) {

		try (DataInputStream din = 
				new DataInputStream(
						new FileInputStream("mytest/test4.dat"))) {

			int data1 = din.readInt();
			boolean data2 = din.readBoolean();
			//double data3 = din.readDouble();
			
//			System.out.println(data1 + ":" + 
//					data2 + ":" + data3 );
			System.out.println(data1 + ":" + data2);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
