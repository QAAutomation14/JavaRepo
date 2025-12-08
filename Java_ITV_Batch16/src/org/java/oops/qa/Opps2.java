package org.java.oops.qa;

class Opps2 {
	
	// member- variable and method

	// non-static or Instance- can be access via ref variable- after object creation
	int a = 10;

		// non-static or Instance- can be access via ref variable- after object creation
	public void m1() {
		System.out.println("I am inside non-static method");
	}

	public static void main(String[] args) {

		// className refVariableName=new ClassName();
		
		// we are creating the object for non-static/instance variable or methods
		Opps2 obj = new Opps2();

		System.out.println(obj.a);
		obj.m1();
		// obj.m2();- not recommended to access static member via object reference

		Opps2 obj2 = new Opps2();
		System.out.println(obj2.a);
		obj2.m1();
		
		Opps2 obj3 = new Opps2();
		System.out.println(obj3.a);
		obj3.m1();
	}





}
