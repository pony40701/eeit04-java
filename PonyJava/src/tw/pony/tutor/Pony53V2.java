package tw.pony.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.Charset;

public class Pony53V2 {
    public static void main(String[] args) throws Exception {
        // 1. 準備訊息
        String mesg = "永支謝欣達";
        byte[] data = mesg.getBytes(Charset.forName("UTF-8"));

        // 2. 建立同一個 socket
        DatagramSocket socket = new DatagramSocket();

        // 3. 迴圈從 .1 發到 .255
        for (int i = 1; i <= 255; i++) {
            String host = "10.0.104." + i;
            InetAddress addr = InetAddress.getByName(host);

            DatagramPacket packet = new DatagramPacket(
                data,
                data.length,
                addr,
                8888
            );
            socket.send(packet);
        }

        socket.close();
        System.out.println("Sent to 10.0.104.1 ~ 10.0.104.255");
    }
}
