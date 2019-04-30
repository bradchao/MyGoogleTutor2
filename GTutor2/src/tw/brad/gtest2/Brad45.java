package tw.brad.gtest2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad45 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = 
					new FileInputStream("mytest/coffee.jpg");
			FileOutputStream fout = 
					new FileOutputStream("dir1/coffee.jpg");
			int b;
			while ( (b = fin.read()) != -1) {
				fout.write(b);
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
