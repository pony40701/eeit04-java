package tw.pony.tutor;

import java.util.HashMap;
import java.util.Set;

public class Pony35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> person =new HashMap<String, Object>();
		person.put("name", "Pony");
		person.put("gender", true);
		person.put("age", 18);
		person.put("w", 79.7);
		System.out.println(person.size());
		person.put("age", 28);
		System.out.println(person.size());
		person.put("alias", 28);
		System.out.println(person.size());
		System.out.println("------");
		Set<String> keys = person.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + person.get(key));
		}
		}

}
