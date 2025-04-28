package tw.pony.tutor;

public class Pony26 {

	public static void main(String[] args) {
		Pony261 obj1 = new Pony261();
		Pony261 obj2 = new Pony261();
		Pony261 obj3 = new Pony261();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		System.out.println("---------");
		System.out.println(obj1.j);
		System.out.println(Pony261.j);
	}
}	
class Pony261{
	int i;
	static int j;
	Pony261(){
		i++;
		j++;
	}
}

