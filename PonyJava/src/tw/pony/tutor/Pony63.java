package tw.pony.tutor;

public class Pony63 {
	public static void main(String[] args) {
		System.out.println("main start");
		Pony631 obj1 = new Pony631();
		Pony632 obj2 = new Pony632();
		obj1.start();
		obj2.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main finish");
	}
}

class Pony631 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
class Pony632 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(100+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}