package accessmodifiers;

public class AccessModifier {
	/*
	 * Access modifier :define the scope of variables and methods
	 
	 There are four types of access modifiers
	 1.public
	 2.protected
	 3.default
	 4.private
	 
	 1. private: the private access modifier is accessible only within class
	  
	  2.Default :if we don't use any modifier, it is treated as default by default.This default modifier is accessible only within package
	  
	  3.Protected : The protected accessible within the package and outside the package but through inheritance only. 
	  *
	  4.Public:  We can access everything from every where with class and within package and outside package .if we access outside package we need n't to extends the package
	  *
	  *
	  *AccessModifier      Within class       Within Package     Outside package by subclass only     outside package
	  *Private 					Y					N								N						N
	  *Default					y					y								N						N
	  *Protected				y					Y								Y						N
	  *Public 					Y					Y								Y						Y
	  *
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
