package tw.brad.gtest2;

import java.io.OutputStream;
import java.net.Socket;

public class Brad59 {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("192.168.43.96", 80);
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello, Google".getBytes());
			out.flush();
			out.close();
			
			System.out.println("send OK");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
