package tw.brad.gtest2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad54 {

	public static void main(String[] args) {
		Brad543 obj1 = new Brad543();
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(
							new FileOutputStream("mytest/brad.dat"));
			oout.writeObject(obj1);
			oout.flush();
			oout.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("----");
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream("mytest/brad.dat"));
			Brad543 obj2 = (Brad543)oin.readObject();
			obj2.m1();
			oin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}

class Brad541 {
	Brad541(){System.out.println("Brad541()");}
}
class Brad542 extends Brad541  {
	Brad542(){System.out.println("Brad542()");}
}
class Brad543 extends Brad542 implements Serializable {
	Brad544 brad544;
	Brad543(){
		System.out.println("Brad543():"); 
		brad544 = new Brad544();
		brad544.a = 20;
	}
	void m1() {System.out.println(brad544.a);}
}
class Brad544 implements Serializable {
	transient int a = 10;
}


