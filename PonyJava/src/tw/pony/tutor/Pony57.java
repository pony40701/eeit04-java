package tw.pony.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Pony57 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com.tw");
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer mesg = new StringBuffer();
			while ((line = br.readLine()) != null) {
				mesg.append(line + "\n");
				
			}
			
			br.close();
			conn.disconnect();
			
			System.out.println(mesg);
			System.out.println("Finish");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
