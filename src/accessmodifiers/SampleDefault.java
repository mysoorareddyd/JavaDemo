package accessmodifiers;

public class SampleDefault {
	int d=20;
	void m2() {
		System.out.println(d);
	}

	public static void main(String[] args) {
		SampleDefault sd=new SampleDefault();
		sd.d=30;
		sd.m2();
		

	}

}
