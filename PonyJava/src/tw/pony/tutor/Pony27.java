package tw.pony.tutor;

public class Pony27 {

	public static void main(String[] args) {
		Pony271.m2();
		Pony271.m2();
		Pony271.m2();
	}

}
class Pony271{
	{
		System.out.println("{}");
	}
	static {
		System.out.println("static:{}");
	}
	Pony271(){
		System.out.println("Pony271()");
	}
	void m1() {
		System.out.println("Pony271:m1");
	}
	static void m2() {
		System.out.println("static:m2()");
	}
}