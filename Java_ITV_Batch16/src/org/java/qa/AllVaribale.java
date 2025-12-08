package org.java.qa;

public class AllVaribale {

	// static variable
	static short s = 100;

	// Instance variable
	double d = 100.32323d;

	public static void main(String[] args) {

		// Local variable
		byte a = 10;
		System.out.println(a);

		// Static access
		System.out.println(AllVaribale.s);

		// Non-static or Instance variable-
		AllVaribale ref = new AllVaribale();
		System.out.println(ref.d);

	}

}
