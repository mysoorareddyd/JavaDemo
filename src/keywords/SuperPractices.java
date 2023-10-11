package keywords;

/* Super Keyword
 * ----------------
 * 1.super can be used to refer immediate parent class instance variable
 * 2.Super can be used to invoke immediate parent class method.
 * 3.Super can be used to invoke immediate parent class constructor.
 * 
 */
	

public class SuperPractices {

	public static void main(String[] args) {
		
		Dog d=new Dog(); // for constructor at the time of instanctation both the parent and child class variable is called in object creation
		
		d.displaycolor();  //black. if we use super keyword it will refer the immediate parent class variable
		d.eating();// it call base call method.And after typing "super.eating" it will give the parent class method
	
	
	}
	
	

}
