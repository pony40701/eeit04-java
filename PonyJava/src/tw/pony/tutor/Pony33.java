package tw.pony.tutor;

import java.util.HashSet;
import java.util.TreeSet;

public class Pony33 {

	public static void main(String[] args) {
		//HashSet<Integer> lottery = new HashSet<Integer>();
		TreeSet<Integer> lottery = new TreeSet();
		while (lottery.size() < 6) {
			lottery.add((int) (Math.random() * 49 + 1));
		}
		System.out.println(lottery);
	}
}
