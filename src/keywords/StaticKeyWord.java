package keywords;

/*
 *   Static--> applicable for variables and methods
 *   
 *   Static variables 
 *   Static methods
 *   1. Static methods can access only static stuff (directly).
 *   2. static method can also access non-static stuff but through object.
 *   3. Non static method can access both static & non static stuff direct.
 */

public class StaticKeyWord {
	static int a=10;     //static varaiable
	int b=20;     //non-static
	
	
	static void m1() {
		System.out.println("this is m1 -static method");
	}
	
	void m2() {     //non-static
		
		System.out.println("This is m2 - Non static method");
		
	}
	void m3() {   //non static method can call both static and non static
		System.out.println("This m3 method ----Non-static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	

	public static void main(String[] args) {
		
		 //   1. Static methods can access only static stuff (directly).
		
		System.out.println(a);    //Without creating an object we can static variable directly
		m1();                   //method also same without object
		//or
		StaticKeyWord.m1(); // or we can access directly by providing class name
		
		
		//System.out.println(b); // variable b is non-static variable we can't access directly without creating object
		// m2();     //method also we can't access without object
		
		
		
		//2. Static method can also access non-static stuff but through object
		StaticKeyWord sk=new StaticKeyWord();
		System.out.println(sk.b);
		
		sk.m2(); //Non- static method can access through object
		sk.m3();
	}
	

}
