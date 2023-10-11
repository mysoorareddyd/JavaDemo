package keywords;

/*
 * Final is keyword which can be defined as the final .So, we can't change the value once if we use final keyword
 * 
 * final keyword can be used in variable, method,class.
 * 
 * Variable---> if we give final to variable you can't change the value of the variable
 * Method----> method can't be override in the child class.
 * Class-----> class can't extends to child class.
 */

public class FinalKeyWord {
	
	
	//Final key word for variable
	final int speed=40;    //Final variable, So, we cannot change the value.
	
	
	
	
	
	
	public static void main(String[] args) {
		
		FinalKeyWord fk=new FinalKeyWord();
		//fk.speed=100;// Compile time error.
		System.out.println(fk.speed);
		
	}

}
