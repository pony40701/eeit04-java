package tw.pony.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pony47 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir2/image.jpg");
			FileInputStream fin = new FileInputStream("dir1/image.jpg");
			int c;
			byte[] buf = new byte[4 * 1024];
			while ((c = fin.read()) != -1) {
				fout.write(c);
			}
			fin.close();
			fout.close();
			fout.flush();
			System.out.println("OK");
			System.out.println(System.currentTimeMillis() - start);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
