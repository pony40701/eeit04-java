package tw.pony.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/pony";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "");
		try {
			Connection conn = DriverManager.getConnection(url, prop);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust (cname,tel,birthday)" +
					 " VALUES ('pony','123','1999-01-02')";
			int n = stmt.executeUpdate(sql);
			System.out.println(n);
			
			String delsql = "DELETE FROM cust WHERE id = 3";
			n = stmt.executeUpdate(delsql);
			System.out.println(n);
			
			String upsql = "UPDATE cust SET tel = '321' , cname='Tony' WHERE id =4";
			 n = stmt.executeUpdate(upsql);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}