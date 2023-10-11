package javapackages;

import accessmodifiers.SamplePublic;

public class SamplePublicImport {  //here we no need to extend the class of SamplePublic from the package.Just we need to import the Class from package

	public static void main(String[] args) {
		
		SamplePublic sp4=new SamplePublic();
		sp4.p4=60;
		sp4.m4();
	}

}
