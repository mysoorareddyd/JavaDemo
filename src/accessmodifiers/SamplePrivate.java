package accessmodifiers;

class A{
	private int data=10;
	private void m1() {
		
		/*
		 * Private modifier we can use only with in the class .we can't even use outside the class and packages
		 */
		 
	}
}

public class SamplePrivate extends SampleProtected {

	public static void main(String[] args) {
		/*A obja=new A();
		obja.data=20;  // We can't access variable outside the class if the modifier is private.error(this field A.data is not visable)
	
		obja.m1();// methods also same (this is also complie time error
	*/
	
		
	}
	

}
