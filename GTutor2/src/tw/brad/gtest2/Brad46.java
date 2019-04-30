package tw.brad.gtest2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad46 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File src = new File("mytest/coffee.jpg");
			FileInputStream fin = 
					new FileInputStream(src);
			byte[] buf = new byte[(int)src.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = 
					new FileOutputStream("dir1/coffee2.jpg");
			fout.write(buf);
			fout.flush();
			fout.close();
			
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
