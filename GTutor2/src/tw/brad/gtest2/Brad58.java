package tw.brad.gtest2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad58 {

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(80)){
			System.out.println("before");
			Socket socket = server.accept();
			System.out.println("after");
			
			InputStream in = socket.getInputStream();
			byte[] buf = new byte[1024];
			int len; StringBuffer sb = new StringBuffer();
			while ( (len = in.read(buf)) != -1) {
				sb.append(new String(buf,0,len));
			}
			
			String who = socket.getInetAddress().getHostAddress();
			
			System.out.println(who + ":" + sb.toString());
			in.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
