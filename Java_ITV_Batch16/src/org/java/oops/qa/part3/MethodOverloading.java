package org.java.oops.qa.part3;

public class MethodOverloading {

	// moverloading- same name, diff- argument type, size and sequence

	public void m1() {
		System.out.println("Zero argument method");
	}

	public void m1(int a) {
		System.out.println("1 int type argument method");
		System.out.println(a);
		//for calculation log- diff implementaion 
		
		for(int i=0; i<=a; i++) {
			System.out.println(i);
		}
	}

	public void m1(String s) {
		System.out.println("1 String argument method");
		System.out.println(s);
	}

	public void m1(int a, String b) {
		System.out.println("2 int String argument method");
		System.out.println(a + b);
	}

	public void m1(String b, int a) {
		System.out.println("2 String int argument method");
		System.out.println(b + a);
	}

	public int m1(long b) {

		return 10;
	}

	MethodOverloading() {
		System.out.println("Zero argument constructor");
	}

	MethodOverloading(int a) {
		System.out.println("Zero argument constructor");
	}

	public static void main() {
		System.out.println("Zero argument main method");
	}

	public static void main(String[] args) {

		MethodOverloading ref = new MethodOverloading();
		ref.m1();
		ref.m1(125);
		ref.m1(34);
		ref.m1("Ram");
		ref.m1(12, "Shyam");
		ref.m1("Sheeta", 4554);
		System.out.println(ref.m1(45535353252352352l));

		MethodOverloading.main();

	}

}
