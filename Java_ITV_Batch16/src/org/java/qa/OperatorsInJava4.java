package org.java.qa;

public class OperatorsInJava4 {

	public static void main(String[] args) {
		
		System.out.println("Logical Operators");

		int a = 10;
		int b = 20;
		int c = 100;


		System.out.println(a > b && a > c);

		System.out.println(b > a && b > c);

		System.out.println(c > a && c > b);

		
		
		System.out.println(a > b || a > c);

		System.out.println(b > a || b > c);

		System.out.println(c > a || c > b);
		
	
		System.out.println(!(c > a || c > b));

	}

}
