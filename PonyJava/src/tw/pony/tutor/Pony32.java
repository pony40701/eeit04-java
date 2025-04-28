package tw.pony.tutor;

import java.util.HashSet;
import java.util.Iterator;

import tw.pony.apis.Bike;

public class Pony32 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Pony");
		set.add(new Bike());
		System.out.println(set.size());
		set.add("Pony");
		System.out.println(set.size());
		set.add(123);	// int => auto-boxing => Interger
		System.out.println(set.size());
		set.add(12.3);  // double => auto-boxing => DOUBLE
		System.out.println(set.size());
		set.add(123);
		System.out.println(set.size());
		System.out.println("-----");
		System.out.println(set);
		Iterator it =  set.iterator();
		while(it.hasNext()) {
			it.next();
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("-----");
		for(Object obj : set) {
			System.out.println(obj);
		}
	}

}
