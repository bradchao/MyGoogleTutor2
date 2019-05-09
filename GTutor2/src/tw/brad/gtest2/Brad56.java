package tw.brad.gtest2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad56 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] data = mesg.getBytes();
		try {
			DatagramSocket socket = 
					new DatagramSocket();
			// 100.82.35.189
			DatagramPacket packet = 
					new DatagramPacket(data, data.length, 
							InetAddress.getByName("100.82.35.189"), 
							8899);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
