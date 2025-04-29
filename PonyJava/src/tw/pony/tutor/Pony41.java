package tw.pony.tutor;

import java.io.File;

public class Pony41 {

	public static void main(String[] args) {
		File f1 = new File("D:\\pony\\dir3");
		if(f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			f1.mkdir();
		}
	}

}
