package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {

	public static void main(String[] args) {
		//Declaration 
		 
		//HashMap hm=new hashMap();        //one-way to declare
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();   //second way
		 //Adding pairs into hashmap
		 hm.put(101,"Mysoora");
		 hm.put(102,"Mysoora");

		 hm.put(103,"Mysoora");
		 hm.put(104,"Mysoora");
		 hm.put(105,"Mysoora");
		 System.out.println(hm);
		 
		 //Remove a pair from hashmap
		 hm.remove(103); 
		 System.out.println("After removing a pair:"+hm);
		 
		//reading pairs using for loop
		 for(Map.Entry m:hm.entrySet()) {   // to get pair value .entrySet() then it will return Map.Entry type
			 System.out.println(m.getKey()+  "  "+m.getValue());   // For pair if we need to separate the kay and value we need to use objN.getKey()for key and objN.getValue()for value
			 
		 }
		 
		 

	
	
	
	
	
	}

}
