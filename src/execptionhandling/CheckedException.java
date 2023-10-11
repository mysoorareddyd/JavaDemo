package execptionhandling;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {   //throws keyword need add in method level 
		System.out.println("Program is started");
		System.out.println("Program is in-progress");
		
		/*try {
			Thread.sleep(5000);   //compiler is identified the exception.Without checked the exception complier will not allow the run
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();    //
		}  */
		Thread.sleep(5000);
		
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
	}

}
