package tw.pony.tutor;
public class Pony28 {
	public static void main(String[] args) {
		Pony281 obj1 = new Pony281();
		Pony281 obj2 = new Pony282();
		Pony281 obj3 = new Pony283();
		Pony282 obj4 = (Pony282)obj2;
		System.out.println(obj2 == obj4);
		obj1.m1();
		obj2.m1();
		obj4.m1();
		obj4.m2();
		System.out.println(obj1 instanceof Pony283);
	}
}

class Pony281 {
	void m1() {
		System.out.println("Pony281:m1()");
	}
}

class Pony282 extends Pony281 {
	void m1() {
		System.out.println("Pony282:m1()");
	}
	void m2() {
		System.out.println("Pony282:m2()");
	}
}

class Pony283 extends Pony281 {
	void m1() {
		System.out.println("Pony283:m1()");
	}
}