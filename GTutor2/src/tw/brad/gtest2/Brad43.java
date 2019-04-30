package tw.brad.gtest2;

import java.io.FileOutputStream;

public class Brad43 {

	public static void main(String[] args) {

		byte[] data1 = "Hello, Brad1\n".getBytes();
		byte[] data2 = "Hello, Brad2\n".getBytes();
		byte[] data3 = "Hello, Brad3\n".getBytes();
		try {
			FileOutputStream fout = 
					new FileOutputStream("mytest/test2.txt", true);
			fout.write(data1);
			fout.write(data2);
			fout.write(data3);
			fout.flush();
			fout.close();
			System.out.println("finish");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
