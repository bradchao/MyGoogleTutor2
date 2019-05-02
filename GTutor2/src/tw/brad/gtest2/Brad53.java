package tw.brad.gtest2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad53 {

	public static void main(String[] args) {

		try (ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("mytest/mydata.dat"))){
			
			while (true) {
				Object obj = null;
				try {
					obj = oin.readObject();
				}catch(EOFException ee) {
					System.out.println("got it");
					break;
				}
				
				System.out.println(obj.getClass().getName());
				
				if (obj instanceof Student) {
					Student stu = (Student)obj;
					System.out.println(stu.calScore() + ":" + stu.calAvg());
				}else if (obj instanceof String) {
					String str = (String)obj;
					System.out.println(str);
				}else if (obj instanceof Integer) {
					int ii = (Integer)obj;
					System.out.println(ii);
				}else {
					System.out.println("here2");
					System.out.println(obj);
				}
			}
		}catch(Exception e) {
			//System.out.println(e.toString());
		}finally {
			System.out.println("finish");
		}
		
	}

}
