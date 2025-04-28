package tw.pony.tutor;

public class Pony21 {
	
	public static void main(String[] args) {
	Pony213 obj = new Pony213((int)1);
	}

}
class Pony211{
	Pony211(String a){
	
	}
}
class Pony212 extends Pony211{
	Pony212(int a){
		super("a");
	}
}
class Pony213 extends Pony212{
	Pony213(){
		super(1);
		System.out.println("A");
	}
	Pony213(int a ){
		super(1);
		System.out.println("B");
	}
	Pony213(double a){
		super(1);
		System.out.println("C");
	}
	Pony213(byte a){
		super(1);
		System.out.println("D");
	}
}