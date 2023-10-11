package keywords;

public class ThisKeyWord {
	int a,b; //class variable or instances variable 
	
	/*void getValues(int x,int y) {   //this variable are method level
		a=x;
		b=y;
	
	}*/
	void getValues(int a,int b) {  //if we still need to use same variable name in method .So, inorder to differenciate we will use THIS keyword
		 
		this.a=a;   //For constrcutor 
		this.b=b;
	}
	void printValues() {
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		ThisKeyWord th=new ThisKeyWord();
		th.getValues(10, 20);
		th.printValues();
	}

}
