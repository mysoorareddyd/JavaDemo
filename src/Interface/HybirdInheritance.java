package Interface;

class A1{     // to achive the hybird inheritance we need to have one class it should directly extend in child class.than we can implements the 2 interfaces at a to achive the hybrid
	void m1() {
		System.out.println("This is method from A1 class");
	}
}
interface B1{
	void m2();
}
interface B2{
	void m3();
}
public class HybirdInheritance extends A1 implements B1,B2 {
	public void m2() {
		System.out.println("this m2 method from B1 interface");
		
	}
	public void m3() {
		System.out.println("this m3 method from B1 interface");
	}
	public static void main(String[] args) {
		HybirdInheritance mi=new HybirdInheritance();
		mi.m1();
		mi.m2();
		mi.m3();
	}

}
