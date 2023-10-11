package OopsConcept;


class A1{
	int a;
	void display() {
		System.out.println(a);
		
	}
}
class B extends A1{
	int b;
	void print() {
		System.out.println(b);
		
	}
}
class C1 extends B{
	int c;
	void show() {
		System.out.println(c);
	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C1 obj=new C1();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		
		obj.display();
		obj.print();
		obj.show();
		
		}
		
		
		

	}


