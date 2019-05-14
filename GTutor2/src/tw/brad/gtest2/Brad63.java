package tw.brad.gtest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.JSeparator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Brad63 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://data.ntpc.gov.tw/api/v1/rest/datastore/382000000A-G01090-002");
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

//			BufferedReader reader = new BufferedReader(new FileReader("mytest/json.txt"));
//			String line; StringBuffer sb = new StringBuffer();
//			while ( (line = reader.readLine()) != null) {
//				sb.append(line);
//			}
//			reader.close();
//			String json = sb.toString();
			
			parseJSONV3(json);
			
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
	
	static void parseJSONV2(String json) {
		try {
			JSONObject root = new JSONObject(json);
			String code = root.getString("responseCode");
			System.out.println(code);
			
			JSONArray responseData = root.getJSONArray("responseData");
			for (int i=0; i<responseData.length(); i++) {
				JSONObject row = responseData.getJSONObject(i);
				String id = row.getString("site_id");
				
				int total = 0;
				try {
					total = row.getInt("people_total");
					System.out.println(id + ":" + total);
				}catch (Exception e) {
					System.out.println(id + ":不詳");
				}
				
				
			}
		
		}catch(JSONException je) {
			System.out.println(je.toString());
		}
	}
	
	static void parseJSONV3(String json) {
		try {
//			JSONObject root = new JSONObject(json);
//			JSONObject result = root.getJSONObject("result");
//			JSONArray records = result.getJSONArray("records");
			
			JSONArray records = new JSONObject(json)
					.getJSONObject("result")
					.getJSONArray("records");
			
			
			for (int i=0; i<records.length(); i++) {
				JSONObject data = records.getJSONObject(i);
				String type = data.getString("Type");
				String district = data.getString("District");
				System.out.println(type +":" + district);
			}
			
			
		}catch(JSONException je) {
			System.out.println(je.toString());
		}
	}
	
	
	

}
