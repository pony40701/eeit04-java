package tw.pony.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/*
 * https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx
 */
public class JDBC18 {
	 
	 private static final String URL = "jdbc:mysql://localhost/brad";
	 private static final String USER = "root";
	 private static final String PASSWD = "root";
	 private static final String QUERY = "SELECT * FROM gift";

	 public static void main(String[] args) {
	  

	  
	  Properties prop = new Properties();
	  prop.put("user", USER);
	  prop.put("password", PASSWD);
	  try {
	   Connection conn = DriverManager.getConnection(URL, prop);
	   PreparedStatement pstmt = conn.prepareStatement(QUERY,ResultSet.TYPE_SCROLL_INSENSITIVE,
	               ResultSet.CONCUR_UPDATABLE);
	   ResultSet rs = pstmt.executeQuery();
	   rs.next();
	   String name = rs.getString("name");
	   System.out.println(name);
	   
	   if (rs.absolute(4)) {
	    name = rs.getString("name");
	    System.out.println(name);
	   }else {
	    System.out.println("XX");
	   }
	   
	   rs.first();
	   name = rs.getString("name");
	   System.out.println(name);
	   
	   rs.last();
	   name = rs.getString("name");
	   System.out.println(name);
	   
	   if (rs.next()) {
	    name = rs.getString("name");
	    System.out.println(name);
	   }else {
	    System.out.println("XX");
	   }
	   
	//   rs.absolute(147);
	//   name = rs.getString("name");
	//   System.out.println(name);
	//   
	//   rs.updateString("tel", "0912-123456");
	//   rs.updateString("name", "麻辣小魚分享包v2");
	//   rs.updateRow();
	//   name = rs.getString("name");
	//   System.out.println(name);
	   
	   rs.absolute(7);
	   name = rs.getString("name");
	   System.out.println(name);
	   
	//   rs.deleteRow();
	   
	   rs.moveToInsertRow();
	   rs.updateString("tel", "0912-123456");
	   rs.updateString("name", "麻魚3");
	   rs.updateString("feature", "好吃");
	   rs.insertRow();

	  
	  }catch(Exception e) {
	   System.out.println(e);
	  }

	 }

	}