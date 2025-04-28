package tw.pony.tutor;
public class Pony30 {

	public static void main(String[] args) {
		Pony302 obj1 = new Pony302();
		obj1.m1();
	}
}
interface Pony301{
	void m1();
	void m2();
	void m3();
}
class Pony302 extends Object implements Pony301,Pony303{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	
}
interface Pony303{
	void m3();
	void m4();
}
interface Pony304 extends Pony301,Pony303{
	void m5();
}
class Pony305 implements Pony304{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}
}