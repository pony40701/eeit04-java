package tw.pony.tutor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ServerSocket;

public class Pony56 {

	public static void main(String[] args) {
		String mesg = "Hello World";
		try {
			Socket client = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(mesg);
			bw.flush();

			client.close();
			System.out.println("send ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}