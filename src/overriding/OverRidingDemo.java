package overriding;

/*Method OverRiding:
 *If subclass (child class) has the same method as declared in the parent class, it is known as Method OverRiding in java
 * 
 * --->Rules for java method overriding
 * 1.method must have same name as in the parent class
 * 2.method must have same parameter as in the parent class.
 */

class Bank{
	double rateOfIntreset() {
		return 0;
	}
}
class SBI extends Bank{
	double rateOfIntreset() {
		return 10.5;
	}
	
}
class ICICI extends Bank{
	double rateOfIntreset() {
		return 9.7;
	}
}
class AXIS extends Bank{
	double rateOfIntreset() {
		return 8.5;
	}
}

public class OverRidingDemo {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		System.out.println(sbi.rateOfIntreset());
		
		ICICI icici=new ICICI();
		System.out.println(icici.rateOfIntreset());
		
		AXIS axis=new AXIS();
		System.out.println(axis.rateOfIntreset());

	}

}
