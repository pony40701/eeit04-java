package tw.pony.tutor;

import tw.pony.apis.Bike;

public class Pony16 {

	public static void main(String[] args) {
		Bike bike;
		bike = new Bike();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();
		System.out.println(bike.getSpeed());
		bike.downSpeed();bike.downSpeed();
		System.out.println(bike.getSpeed());
		System.out.println("----");
		//bike.speed = 10.1;
		System.out.println(bike.getSpeed());
	}

}
