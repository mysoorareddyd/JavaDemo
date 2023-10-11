package overloading;

/*
 * OverLoading :creating method and constructor with the same name with different parameters
 * 
 * Advantage:Save memory ,saves time.
 * 
 * 1.number of parameters
 * 2.Data type of parameters
 * 
 * 
 */
public class DemoMethodOverLoading {
	
	void add(int a,int b) {              //1
		System.out.println(a+b);
	}
	void add(int a,double b) { 			//2
		System.out.println(a+b);
	}
	void add(double a,double b) {		//3
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {		//4
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		DemoMethodOverLoading md=new DemoMethodOverLoading();
		md.add(10,20);  //1
		md.add(10,20,30); //4
		md.add(10,20.5);	//2
		md.add(10.5,20.5);		//3
		
		
		
	}

}
