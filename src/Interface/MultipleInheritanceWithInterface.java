package Interface;


interface ABC{
	int x=100;
	 void m1();
	 
}
interface XYZ{
	int y=200;
	void m2();
}   // to implements the interface we must have a class




public class MultipleInheritanceWithInterface implements ABC,XYZ {

	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		MultipleInheritanceWithInterface test=new MultipleInheritanceWithInterface();
		test.m1();
		test.m2();
		
		ABC test2=new MultipleInheritanceWithInterface();
		test.m1();
		test.m2();
	}

}
