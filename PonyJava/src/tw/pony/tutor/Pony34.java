package tw.pony.tutor;

import java.util.LinkedList;

public class Pony34 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Pony"); // 0
		names.add("Tom"); // 1
		names.add(2, "Eric"); // 2
		names.add("Ivy"); // 擺在2的位置，原本2往後推
		names.add("Emma"); // 全都擺在0 => 順序顛倒 = 先進後出
		System.out.println(names.size());
		System.out.println(names.toString());

	}

}
