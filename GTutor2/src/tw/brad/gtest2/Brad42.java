package tw.brad.gtest2;

import java.io.FileInputStream;
import java.io.FileReader;

public class Brad42 {

	public static void main(String[] args) {

		try {
			FileReader fin = 
					new FileReader("mytest/test1.txt");
			
			int temp;
			while ( (temp = fin.read()) != -1) {
				System.out.println((char)temp);
			}
			
			fin.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
