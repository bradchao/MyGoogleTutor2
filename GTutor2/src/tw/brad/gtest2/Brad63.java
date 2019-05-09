package tw.brad.gtest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JSeparator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Brad63 {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx");
			HttpURLConnection conn = 
					(HttpURLConnection) url.openConnection();
			conn.connect();
			BufferedReader reader = 
				new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			
			String json = sb.toString();
			System.out.println(json);
			
			
			//parseJSON(json);
			
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static void parseJSON(String json) {
		try {
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String name = row.getString("Name");
				String addr = row.getString("SalePlace");
				String tel = row.getString("SpecAndPrice");
				System.out.println(name +":" + addr + ":" + tel);
			}
			
			
		}catch(JSONException je) {
			
		}
	}
	
	
	
	
	

}
