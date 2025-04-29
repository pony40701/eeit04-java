package tw.pony.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pony46 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir2/image.jpg");
			FileInputStream fin = new FileInputStream("dir1/image.jpg");
			int len;
			byte[] buf = new byte[4 * 1024];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf , 0 , len);
			}
			fin.close();
			fout.close();
			fout.flush();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
