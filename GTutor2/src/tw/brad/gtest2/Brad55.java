package tw.brad.gtest2;

import java.net.InetAddress;

public class Brad55 {

	public static void main(String[] args) {

		try {
			InetAddress[] ips = InetAddress.getAllByName(
					"www.google.com");
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
