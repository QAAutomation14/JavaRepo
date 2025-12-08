package org.java.oops.qa;

public class Methods {

	public void m1() {

		System.out.println("m1");
	}

	public static void m2() {
		System.out.println("m2");
	}

	void m3() {
		System.out.println("m3");
	}

	static void m4() {
		System.out.println("m4");
	}

	private int m5() {

		System.out.println("m5");

		return 10;
	}

	protected static double m6() {

		System.out.println("m6");

		return 214.21d;
	}
	
	public void m7(int a) {
		System.out.println("m7");
		System.out.println(a);
	}
	
	static void m8(String a, int b) {
		System.out.println("m8");
		System.out.println(a+b);
	}
	
	public static byte m9(int a) {
		System.out.println("m9");
		System.out.println(a);
		
		return 10;
	}
	
	long m10(float f) {
		
		System.out.println("m10");
		
		System.out.println(f);
		
		return 10325327342783l;
	}
	

	public static void main(String[] args) {// method signature

		// method body

		// method- we write the code logic.
		// it take action

		// it block of the code that perform some specific task.

		// it execute the code
		// it is a block where we writes the code which perform some action.
		
		
		Methods obj=new Methods();
	    obj.m1();
	    
	    Methods.m2();
	    
	    obj.m3();
	    
	    Methods.m4();
	    
		obj.m5();
		System.out.println(obj.m5());
		
		Methods.m6();
		System.out.println(Methods.m6());
		
		obj.m7(400);
		
		Methods.m8("Ajeet", 1234);

		Methods.m9(2753275);
		System.out.println(Methods.m9(44764643));
		
		obj.m10(4573247.753458732f);
		System.out.println(obj.m10(4242.43242342424f));
		
	}

}
