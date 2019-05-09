package tw.brad.gtest2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad61 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/6dJlko6FsQlgDsDauSnTVQ--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9ODAw/http://media.zenfs.com/zh-Hant-TW/homerun/nownews.com/ff4d1a0d329d67870a9a078e3cf05da8");
			HttpURLConnection conn = 
					(HttpURLConnection) url.openConnection();
			conn.connect();

			FileOutputStream fout = new FileOutputStream("mytest/brad.jpg");
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
