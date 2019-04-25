package tw.brad.gtest2;

import java.io.File;
import java.io.IOException;

public class Brad41 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File f1 = new File("/Users/brad/file1.txt");
		if (f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("xx");
			try {
				f1.createNewFile();
			}catch(IOException ie) {
				
			}
		}
		
		
	}

}
