package tw.pony.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pony44 {
	public static void main(String[] args) {
		try {
			File file = new File("dir1/file2.txt");
			FileInputStream fin = new FileInputStream(file);

			int len;
			byte[] buf = new byte[(int) file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
//			while( (len = fin.read(buf)) != -1) {
//				System.out.print(new String(buf , 0 , len));
//			}
			fin.close();
			// System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}