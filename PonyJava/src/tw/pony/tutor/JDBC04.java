package tw.pony.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBC04 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/pony";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "");
		try {
			Connection conn = DriverManager.getConnection(url, prop);
			
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM cust";
			
			ResultSet rs = stmt.executeQuery(sql);
			rs.next()	;
			String id = rs.getString("id");
			System.out.println(id);
			rs.next()	;
			rs.next()	;
			id = rs.getString("id");
			String name = rs.getString("cname");
			System.out.println(id + ":" + name);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}