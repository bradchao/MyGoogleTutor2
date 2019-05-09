package tw.brad.gtest2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad57 {

	public static void main(String[] args) {
		while (true) {
			// 192.168.43.96
			byte[] buf = new byte[4096];	// [n] = 0
			try {
				DatagramSocket socket = new DatagramSocket(7777);
				DatagramPacket packet = 
						new DatagramPacket(buf, buf.length);
				System.out.println("before");
				socket.receive(packet);
				System.out.println("after");
				socket.close();
				System.out.println("receive ok");
				
				String whoIP = packet.getAddress().getHostAddress();
				byte[] rdata = packet.getData();
				int len = packet.getLength();
				System.out.println(whoIP + ":" +
						new String(rdata, 0, len*3));
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		
	}

}
