package execptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in-progress");

		/*int a =100;
		try {
		
		System.out.println(a/0);          //throw Arithmetic exception
		}
		catch(ArithmeticException e) {
			System.out.println("Enter into catch block");
			
		}*/
		
		
		String s=null;    
		try {
		System.out.println(s.length());    //NullPointer Exception
		
		}
		catch(Exception e) {    //if we don't know the exception .Just specify the "Exception. Because Exception is the super class of all exception class
		System.out.println();	
		}
		
		String x="abc";
		// int i =Integer.parseInt(x);     //NumberFormat Exception
		
		int arr[]=new int[5];
		//arr[10]=50;           			//ArrayIndexOutOfBound Exception
		
		 
		System.out.println("Program is completed");
		System.out.println("Program is exited");


		
	}

}
