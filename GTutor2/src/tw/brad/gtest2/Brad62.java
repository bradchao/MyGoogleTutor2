package tw.brad.gtest2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad62 {
	public static void main(String[] args) {
		String urlString = "http://www.gamer.com.tw";
		try {
			URL url = new URL("https://pdfmyurl.com/index.php?url=" + urlString);
			HttpURLConnection conn = 
					(HttpURLConnection) url.openConnection();
			conn.connect();

			String filename = urlString.replace("/", "_");
			
			FileOutputStream fout = new FileOutputStream("mytest/" + filename + ".pdf");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			
			byte[] buf = new byte[1024*4096];
			int len;
			while ( (len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			bin.close();
			fout.flush();
			fout.close();
			
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}
