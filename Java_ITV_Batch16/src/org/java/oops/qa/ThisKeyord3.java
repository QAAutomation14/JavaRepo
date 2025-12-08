package org.java.oops.qa;

public class ThisKeyord3 {

	void demo() {

		System.out.println("I am in demo method");
	}

	public void test(int a) {
		this.demo();
		System.out.println("I am in test method");
		System.out.println("the a value will be " + a);
	}

	public static void main(String[] args) {

		ThisKeyord3 obj = new ThisKeyord3();

		obj.test(300);

	}

}
