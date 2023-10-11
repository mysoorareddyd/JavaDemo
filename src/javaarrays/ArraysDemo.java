package javaarrays;

/*Array: Array is collection of elements of same data type.
 * int a[]=new int[5];
 * 
 * For normal variable int a= 10; a=10;
 * 
 * Two types of arrays
 * ---------------------
 * 1.Single Dimensional
 * 2.Two/multi Dimensional
 *  
 *   
 *   1.Single Dimensional array
 *   --------------------
 *   1)Declare an array
 *   2)insert values into array
 *   3)find size of an array
 *   4)Read values from an array.
 *   
 *   int a[]=new int[5];// int []a =new int [5];
 *   
 *   
 *   
 * for(initialization;condition;inc){
 * statement
 * 
 *   Advance for loop/Enhanced for loop/For each loop
 *   for(initailization){
 *   Statement;
 *   
 */



public class ArraysDemo {

	public static void main(String[] args) {
		//int a[]=new int[5];   //declare array with size 5,starting index is 0,last index is 4;
	
		/*//storing/inserting values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//OR
		
		int a[]= {100,200,300,400,500};// we can declare an array without specifying the size.
		
		//To find size of an array
		System.out.println("Length of an array is:"+a.length);  //prints length/size of an array.
		
		System.out.println(a[2]);  //read specific value
		//if we want read the value we need to use for loop
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		//Read values using enhanced for loop
		
		for(int i:a) {
			System.out.println(i);
		}
		
		
		
		
		
		
		

	}

}
