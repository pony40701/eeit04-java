package tw.pony.tutor;

class Pony611 extends Thread {
	private String name;

	Pony611(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s : %d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public void m1() {
		System.out.println("Pony611:m1()");
	}
}

class Pony612 implements Runnable {
	private String name;

	Pony612(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s : %d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public void m1() {
		System.out.println("Pony611:m1()");
	}
}

public class Pony61 {
	public static void main(String[] args) {
		Pony611 obj1 = new Pony611("A");
		Pony611 obj2 = new Pony611("B");
		Pony612 obj3 = new Pony612("C");
		Thread mt1 = new Thread(obj3);
		obj1.start();
		obj2.start();
		mt1.start();
		System.out.println("main finish");
	}
}
