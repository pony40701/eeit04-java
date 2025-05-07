package tw.pony.tutor;

import tw.pony.apis.BCrypt;

public class Pony69 {
	public static void main(String[] args) {
		String passwd = "123456";
		String pw_hash = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(pw_hash);
		System.out.println(pw_hash.length());
		
		String input = "123456";
		 if (BCrypt.checkpw(input, pw_hash)) {
			 System.out.println("Check OK!");
		 }else {
			 System.out.println("XX");
		 }
	}
}
