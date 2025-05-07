//登入
package tw.pony.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Properties;


public class JDBC14 {
	private static final String URL = "jdbc:mysql://localhost/brad";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static Connection conn;
	private static final String Query = "SELECT * FROM member WHERE id = ?";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		try {
			conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, 2);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String account = rs.getString("account");
				InputStream in = rs.getBinaryStream("icon");
				new Thread() {
					public void run() {
						try {
							String filename = String.format("dir2/%s.png", account);
							FileOutputStream fout = new FileOutputStream(filename);
							// 讀資料庫檔案
							byte[] buf = new byte[128*1024];
							int len = in.read(buf);
							// 輸出
							fout.write(buf, 0, len);
							fout.flush();
							fout.close();
						} catch (FileNotFoundException e) {
							System.out.println(e);
						}
					}
				}.start();
				System.out.println("Writing....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
