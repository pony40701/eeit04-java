package tw.pony.tutor;

import tw.pony.apis.Scooter;

public class Pony17 {
	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		System.out.println(s1.getSpeed());
		s1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(s1.getSpeed());
	}
}
