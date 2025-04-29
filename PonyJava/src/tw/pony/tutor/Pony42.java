package tw.pony.tutor;

import java.io.File;

public class Pony42 {
	public static void main(String[] args) {
		File f1 = new File(".");
		System.out.println(f1.getAbsolutePath());
		File dir1 = new File("./dir3");
				System.out.println(dir1.exists());
	}
}
