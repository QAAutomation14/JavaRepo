package org.java.oops.qa;

class Opps1 {
	{
	System.out.println("Non-Static Block");
	}
	
	static {
		System.out.println();
	}
	// member- variable and method

	// non-static or Instance- can be access via ref variable- after object creation
	int a = 10;

	// static- can be accessed via class name
	static double c = 01.00d;

	// non-static or Instance- can be access via ref variable- after object creation
	public void m1() {
		System.out.println("I am inside non-static method");
	}

	// static- can be accessed via class name
	public static void m2() {
		System.out.println("I am inside static method");
	}

	public static void main(String[] args) {

		// local
		int b = 100;

		System.out.println(b);

		//static
		System.out.println(Opps1.c);
		Opps1.m2();

		// className refVariableName=new Class();
		// we are creating the object for non-static/instance
		Opps1 obj = new Opps1();

		System.out.println(obj.a);
		obj.m1();
		// obj.m2();- not recommended to access static member via object reference

		Opps1 obj2 = new Opps1();
		System.out.println(obj2.a);
		obj2.m1();
		
		Opps1 obj3 = new Opps1();
		System.out.println(obj3.a);
		obj3.m1();
	}

	// Nested Or Inner class
	private class Opps2 {

	}
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Non-Static Block");
	}


}
