package tw.brad.gtest2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad51 {

	public static void main(String[] args) {
		// 物件序列化
		Student s1 = new Student(90,30,40);
		Student s2 = new Student(70,80,45);
		try(ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("mytest/mydata.dat"))){
			oout.writeObject(s1);
			oout.writeObject("----------");
			oout.writeObject(s2);
			oout.writeObject("----------");
			oout.writeObject(123);	// 123(int) => auto-boxing => 123(Integer)
			
			oout.flush();
			System.out.println("ok");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}

class Student implements Serializable {
	private int math, ch, eng;
	Student(int math, int ch, int eng){
		this.math=math; this.ch=ch; this.eng = eng;
	}
	int calScore() {
		return math + ch + eng;
	}
	double calAvg() {
		return calScore() / 3.0;
	}
}
