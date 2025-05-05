package tw.pony.tutor;

import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.Charset;

public class Pony53 {

	public static void main(String[] args) {
		String mesg = "永支4號謝欣達";	
		byte[] data = mesg.getBytes();
		try{
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					data, data.length,
					InetAddress.getByName("10.0.104.255"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
