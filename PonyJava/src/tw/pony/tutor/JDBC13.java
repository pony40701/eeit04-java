//上傳頭像
package tw.pony.tutor;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import tw.pony.apis.BCrypt;

public class JDBC13 {
	private static final String URL = "jdbc:mysql://localhost/brad";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static Connection conn;
	private static final String UPDATE_SQL = "UPDATE member SET icon = ? WHERE id = ?";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		try {
			conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL);

			FileInputStream fin = new FileInputStream("dir2/ball1.jpg");

			pstmt.setBinaryStream(1, fin);
			pstmt.setInt(2, 2);
			if (pstmt.executeUpdate() > 0) {
				System.out.println("Success");
			} else {
				System.out.println("Failure");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
