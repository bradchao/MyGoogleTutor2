package tw.brad.gtest2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad48 {

	public static void main(String[] args) {
		try {
//			FileInputStream fin = new FileInputStream("mytest/test.csv");
//			InputStreamReader isr = new InputStreamReader(fin);
//			BufferedReader br = new BufferedReader(isr);


			BufferedReader br = new BufferedReader(
					new FileReader("mytest/test.csv"));
			
			String line = null;
			while ( (line = br.readLine()) != null) {
				String[] row = line.split(",");
				System.out.println("name:" + row[0]);
				System.out.println("mobile:" + row[1]);
				System.out.println("age:" + row[2]);
				System.out.println("---------------------");
			}
			
			br.close();
			
			System.out.println("finish");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
