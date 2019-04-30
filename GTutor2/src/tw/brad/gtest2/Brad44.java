package tw.brad.gtest2;

import java.io.File;
import java.io.FileInputStream;

public class Brad44 {

	public static void main(String[] args) {

		try {
			File file = new File("mytest/test1.txt");
			if (file.exists() && file.isFile() && file.canRead()) {
				FileInputStream fin = 
						new FileInputStream(file);
				
				int temp; 
				byte[] buf = new byte[(int)file.length()];
				fin.read(buf);
				System.out.println(new String(buf));
				
				fin.close();
				System.out.println("OK");
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
