//用外部網站轉pdf

package tw.pony.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Pony58 {
	public static void main(String[] args) {
		String url1 = "https://www.pchome.com.tw";
		try {
			URL url = new URL(String.format("https://pdfmyurl.com/?url=%s",url1));
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			BufferedInputStream br = new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir2/test.pdf"));
			byte[] buf = new byte[4*1024]; int len;
			while ((len = br.read(buf)) != -1) {
				bout.write(buf,0,len);
			}
			
			br.close();
			
			bout.flush();
			bout.close();
			System.out.println("Finish");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
