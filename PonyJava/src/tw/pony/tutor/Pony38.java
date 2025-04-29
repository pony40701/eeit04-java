package tw.pony.tutor;

public class Pony38 {

	public static void main(String[] args) {
		Pony391 obj = new Pony391();
		obj.m1();
	}

}
class Pony391{
	void m1() {
		System.out.println("m1");
		try {
			m2();
		} catch (Exception e) {
		}
	}
	void m2() throws Exception{
		System.out.println("m2");
		m3();
	}
	void m3() throws Exception{
		System.out.println("m3");
		throw new Exception();
	}
}