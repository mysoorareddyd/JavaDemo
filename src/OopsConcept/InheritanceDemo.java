package OopsConcept;

/*  Inheritance :--> Aquiring all the properties & behavior from one class to another class is called as Inheritance.
 *  parent/base class/super class ---> child class/sub class/derived class
 *  
 *   
 *   5 Types of inheritance :
 *   1.Single
 *   2.Multi-level
 *   3.hierarchical
 *   4.Multiple   --->This is achived through Interface
 *   5.Hybrid   ----->This is achived through combination of Inheritance and Interface
 *   
 *   With help of "extends" KeyWord we can inherit the properties & behavior of from super class to base class
 *   
 *   
 */




	class A{
	int a;
	void display() {
		System.out.println(a);
	}
	}
	class C extends A{  //B is child class,A is parent class
	int b;
	void print() {
		System.out.println(b);
	}
}
	
	

public class InheritanceDemo  {

	public static void main(String[] args) {
		
		A obja=new A();
		obja.a=100;
		obja.display();
		
		C objb=new C();
		
		objb.b=200;
		objb.print();
		objb.a=20;
		objb.display();
		
		
	}

}
