package overloading;

public class OverLoadMainMethod {
	
	//Yes, we can overload the main method by passing the different parameter but not same parameters
	public void main(int x) {
		System.out.println(x);
	}
	public void main(int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		OverLoadMainMethod om=new OverLoadMainMethod();
		om.main(100);
		om.main(100,200 );
		

	}

}
