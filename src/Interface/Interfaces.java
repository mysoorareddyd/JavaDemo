package Interface;

interface A{     // we define interface with interface keyword.
	
	int a=10;     // we can leave the variables as (int a;) we need to assign some values. By default variables are static and finial 
	
	void m1() ;   // in interface contains only abstract methods an by default the method are public(is higher level modifier) and denote end with semi-colon ;
		
	


}

public class Interfaces implements A {   // We must implement body for methods
	 
	public void m1() {         //When we create a method by defalut it's "Defalut modifier". So, the interface method is by defalut in public .SO, we can't reduse the level .We need to define it public
		System.out.println(a);
	}

	public static void main(String[] args) {
		Interfaces t=new Interfaces();  //Interfaces t is called as variable and new Interfaces  is called instaseation 
		t.m1();
		
		A a=new Interfaces();   // variable we can create for interface but we can't create instaseation for interface (ex A a=new A();//invalid )
		a.m1();
		 
	}

}

/*
What is Interface?
1. An interface in java is a blueprint of a class
2. interface contains final and static variables 
3.Interface contains abstract methods ("An abstract method contains only defination but not body")

4.Method in interface are public by default
5.interface supports the functionality of multiple inheritance.
6.we can define interface with interface keyword
7.A class extends another class, An interface extends another interface but a class implements an interface
8. we can create object reference for interface but we cannot instantiate interface

*/