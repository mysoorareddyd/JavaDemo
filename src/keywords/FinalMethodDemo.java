package keywords;

final class Bike{    // we can't extend the parent class to child class if we meantion as final
	final void run() {    //final method, so we can't overrid this method in child class
		System.out.println("Running.......");
	}
}

class Honda extends Bike{
	   void run() {        // compile time error. we can't override the final key word method.
		System.out.println("Started ..........");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
