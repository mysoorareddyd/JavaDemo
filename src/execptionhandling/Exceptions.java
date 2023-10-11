package execptionhandling;

/*Compile: this will executes the program line by line and throws error when executing the program 
 * 
 * interpter: this will run  the entire program and show all error in line by line.
 * 
 * Exception Handling: 
   Exception is an abnormal condition. 
   in java, exception is an event the disturbs the normal flow of the program
   
   Types of exceptions :
   we have two types of exception
   1.Checked:The exception checked/identified by the compiler.This can be identified before running the program by the compiler show error message.
    Examples :
    1.InterruptedException
    2.IOException
    3.FileNotFoundException etc. 
   2.Un-checked:This exception can't be identified by the compiler.This can be identified while running the program in console
	Examples:
	1.ArithmeticException
	2.NullPointerException
	3.NumberformatException
	4.ArrayIndexOutOfException  etc...
   
   Common Un-Checked exception:
   int a= 50/0   ----> Arithmetic Exception
   
   String s=null;
   System.out.println(s.length());   ---->NullPointerException
   
   String s="abc";
   int i=Integer.parseint(s);   ------>NumberFormatException
   
    int a[]=new int[5];
    a[10]=50;                   ------->ArrayIndexOutOfBoundsException
   
   
   Handling Exception:
   
   try{
   Statement;
   }
   catch(Exception type)
{
statement;
}
  catch(Exception type)
{
statement;
One try block can have multiple catch statements

 try{
   Statement;
   }
   catch(Exception type)
{
statement;
}
finally{
 this finally block is an optional .
 Finally block is always executes...
 1.Exception doesn't occur
 2.Exception occurs and not handled
 3.Exception occurs and handled.
 
 
 Checked exception can be handled by two way:
 1.Try catch
 2.throws keyword
}

   
   
 */

public class Exceptions {

	public static void main(String[] args) {
		
		
	}

}
