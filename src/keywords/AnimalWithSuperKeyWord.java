package keywords;

public class AnimalWithSuperKeyWord {
	
	AnimalWithSuperKeyWord()
	{
		System.out.println("Animal is created");
	}
	
	String color="white";
	void eating() {
		System.out.println("Eating ..........");
	}

}
class Dog extends AnimalWithSuperKeyWord{
	String color="Black";
	
	void displaycolor() {
		System.out.println(color);
		System.out.println(super.color);
		
		
	}
	void eating() {
		System.out.println("Eating breed...........");
		super.eating();
	}
	Dog(){
		super(); //invoke the parent class constructor 
		System.out.println("Dog is created");
		
	}
	
	
}
