package tw.brad.gtest2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad52 {

	public static void main(String[] args) {

		try (ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("mytest/mydata.dat"))){
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			String line1 = (String)(oin.readObject());
			Student s2 = (Student)(oin.readObject());
			String line2 = (String)(oin.readObject());
			int i1 = (Integer)(oin.readObject());
			
			System.out.println(s1.calScore() + ":" + s1.calAvg());
			System.out.println(line1);
			System.out.println(s2.calScore() + ":" + s2.calAvg());
			System.out.println(line2);
			System.out.println(i1);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
