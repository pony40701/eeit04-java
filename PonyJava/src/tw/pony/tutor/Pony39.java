package tw.pony.tutor;

public class Pony39 {

	public static void main(String[] args) {
		m1();
		System.out.println("Finish");
	}

	static void m1() {
		int a = 10, b = 3;
		try {
			System.out.println(a / b);
			
		} catch (Exception e) {
			System.out.println("XX");
			return;
		}finally {
			System.out.println("Finally");
		}
		System.out.println("End");
	}
}