package tw.pony.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pony43 {
	public static void main(String[] args) {
		String mesg = "Hello,Pony";
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/file1.txt");
			fout.write(mesg.getBytes());
			fout.close();
			System.out.println("OK");
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}
