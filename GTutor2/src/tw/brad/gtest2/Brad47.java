package tw.brad.gtest2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad47 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = 
					new FileInputStream("mytest/coffee.jpg");
			FileOutputStream fout = 
					new FileOutputStream("dir1/coffee3.jpg");
			byte[] buf = new byte[1024*1024];
			int len;
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
