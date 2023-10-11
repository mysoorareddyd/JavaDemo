package overloading;

public class ConstructorOverLoading {
	
	ConstructorOverLoading(int a,int b){
		System.out.println(a+b);
	}
	ConstructorOverLoading(int a,double b){
		System.out.println(a+b);
	}
	ConstructorOverLoading(double a,double b){
		System.out.println(a+b);
	}
	ConstructorOverLoading(int a,int b,int c){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// we don't need to call through object .Just while instances time in the class constructor just provide the parameters.
		ConstructorOverLoading co=new ConstructorOverLoading(10,20);

		ConstructorOverLoading co1=new ConstructorOverLoading(10,20,30);// we can create new object or change the parameters
		ConstructorOverLoading co2=new ConstructorOverLoading(10.5,20.4);
		
	
	}
	

}
