package tw.pony.tutor;

class Pony621 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i % 10 == 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class Pony62 {
	public static void main(String[] args) {
		System.out.println("main start");
		Pony621 obj = new Pony621();
		obj.setDaemon(true);
		obj.start();
		System.out.println("main finish");
	}
}
