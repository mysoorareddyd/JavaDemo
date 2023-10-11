package arraylist;

import java.util.ArrayList;

/*
 Derived data types(Collections)
  primitive data type array ( int a[]=new a[5])
  *in Primitive data type we need to specify with in range and data type should be same.
  
  Operations on ArrayList:
  How to declare array list
  How to add element/value to array list
  How to find size of array list
  Read value from array list
  Remove elements from array list
 */

public class ArrayListCollections {

	public static void main(String[] args) {
		// How to declare array list  -->There are two different ways
		
		// ArrayList list=new ArrayList();   //we can store any type of data elements
		
		// ArrayList<String> list=new ArrayList<String>(); //This specified type of array list store on specified data (ex:String);
		//ArrayList<Integer> list=new ArrayList<Integer>(); //this stores only integer.
		
		ArrayList<String> list=new ArrayList<String>();
		
		//Adding values to ArrayList 
		list.add("Mysoora");   //Array list we have add method to add into list
		list.add("reddy");  
		list.add("donthi");  
		list.add("Reddy");
		
		//to get size of array list
		System.out.println(list.size());  //Size method is used to get the size .it will return int
		System.out.println("before removing the elements:"+list); // to print all elements
		//remove  an element 
		list.remove(2);
		System.out.println(list.size()); 
		System.out.println("After removing the elements:"+list); 
		
		// inserting a new elements in middle of the array list
		list.add(2,"ramesh");
		
		//Reading values from array list using for loop
		for(String s:list) {
			System.out.println(s);
		}
		
		
	}

}
