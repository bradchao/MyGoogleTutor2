package tw.brad.gtest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Brad71 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			prop.setProperty("useSSL", "false");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/google", prop);

			Statement stmt = conn.createStatement();
//			stmt.execute("INSERT INTO cust (cname,tel,birthday)" + 
//					" VALUES ('Brad','123','1999-01-02')");
//			stmt.execute("DELETE FROM cust WHERE id = 8 OR cname = 'Peter'");
//			stmt.execute("UPDATE cust SET cname = 'Kevin' WHERE id = 10");

			ResultSet rs = stmt.executeQuery("SELECT id,tel,cname as custname,birthday" + 
					" FROM cust WHERE id >= 8" + 
					" ORDER BY id LIMIT 6, 3");
			while (rs.next()) {
				String tel = rs.getString("tel");
				String custname = rs.getString("custname");
				String id = rs.getString("id");
				String birthday = rs.getString("birthday");
				
				System.out.println(id + ":" + custname + ":" + tel + ":" + birthday);
			}
			
			
			conn.close();
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
