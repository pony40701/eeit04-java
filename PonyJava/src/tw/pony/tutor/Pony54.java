package tw.pony.tutor;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.Charset;

public class Pony54 {
	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			
			
			String urIp = packet.getAddress().getHostAddress();
			String mesg = new String(packet.getData(), 0,packet.getLength());
			System.out.printf("%s : %s\n", urIp,mesg);
			System.out.println("Receive OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
