package tw.pony.tutor;

public class Pony29 {
	public static void main(String[] args) {
		//Pony291 obj1 = new Pony291();
		Pony291 obj1 = new Pony291() {
			void m3() {
				System.out.println("Pony291:m3()");
			}
		};
		obj1.m3();
		System.out.println("---");
		Pony291 obj2 = new Pony292();
		obj2.m3();
		System.out.println("---");
		
		Pony291 obj3 = new Pony291() {
			void m3() {
				System.out.println("Pony291:m3():other");
			}
		};
		obj3.m3();
	}
}

abstract class Pony291 {
	Pony291(){System.out.println("Pony291()");}
	void m1() {}
	void m2() {}
	abstract void m3();
}

class Pony292 extends Pony291 {
	Pony292(){System.out.println("Pony292()");}
	void m3() {System.out.println("Pony292:m3()");}
}

class Pony293 extends Pony291 {
	Pony293(){System.out.println("Pony293()");}
	void m3() {System.out.println("Pony293:m3()");}
}
