package tw.pony.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Pony52 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("2");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}

}
