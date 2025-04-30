package tw.pony.tutor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Pony56 {

	public static void main(String[] args) {
		try {
			Socket client = new Socket(InetAddress.getByName("127.0.0.1"),9999);
			client.close();
			System.out.println(client + "OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
