package tw.pony.tutor;

import tw.pony.apis.TWID;

public class Pony25 {

	public static void main(String[] args) {
		if (TWID.checkTWID("A123456789")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("--------");
		TWID id1 = new TWID();
		TWID id2 = new TWID(false);
		TWID id3 = new TWID('X');
		TWID id4 = new TWID(true,'R');
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println("---------");
		TWID id5 = TWID.createTWID("A123456789");
		if (id5 != null) {
			System.out.println(id5.getId());
		}else {
			System.out.println("XX");
		}
	}

}
