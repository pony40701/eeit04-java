package tw.pony.tutor;

import java.util.function.Consumer;

public class Pony68 {
	public static void main(String[] args) {
		Store2 store2 = new Store2();
		Producer2 p = new Producer2(store2);
		ConSumer2 c1 = new ConSumer2(store2, "A");
		ConSumer2 c2 = new ConSumer2(store2, "B");
		ConSumer2 c3 = new ConSumer2(store2, "C");
		p.start();
		c1.start();
		c2.start();
		c3.start();
	}
}

class Store2 {
	private int qty;
	private final int max = 10;

	synchronized void add(int add) throws InterruptedException {
		System.out.printf("進貨中...%d\n", add);
		while (add + qty > max) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		qty += add;
		notifyAll();
		System.out.printf("完成進貨...%d,目前庫存量：%d\n", add, qty);
	}

	synchronized void buy(int buy, String who) throws InterruptedException {
		System.out.printf("<%s>購買中...%d\n", who,buy);
		while (buy > qty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		qty -= buy;
		notifyAll();
		System.out.printf("<%s>完成購買...%d,目前庫存量：%d\n", who, buy, qty);
	}
}

class Producer2 extends Thread {
	private Store2 store;

	public Producer2(Store2 store) {
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				store.add(5);
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ConSumer2 extends Thread {
	private Store2 store;
	private String name;

	public ConSumer2(Store2 store, String name) {
		this.store = store;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				store.buy((int) (Math.random() * 5) + 1, name);
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}