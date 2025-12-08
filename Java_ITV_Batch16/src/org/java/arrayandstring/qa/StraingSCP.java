package org.java.arrayandstring.qa;

public class StraingSCP {

	public static void main(String[] args) {
		System.out.println("Strat------------------");

		String s1 = "Sachin";

		String s2 = "Tendulkar";

		String s3 = "Sachin";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// memory mapping

		System.out.println("Memory Mapping------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		// SCP

		System.out.println("Immutable----------");

		s3 = "Kohli";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Immutable 2----------");

		s1 = "Virat";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		System.out.println("Immutable 3----------");

		String s4 = "Sachin";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("End------------------");
	}

}
