package org.java.qa;

public class OperatorsInJava5 {

	public static void main(String[] args) {

		System.out.println("Assignment Operators");

		int a = 10;

		int b = 20;

		int c = 30;

		int d = a + b;

		System.out.println(d);//10+20=30

		System.out.println(a += b);// a=a+b; a=10+20=30

		System.out.println(a -= b);// a=a-b a=30-20=10  

		System.out.println(a /= b);// a=a/b  a=10/20=0

		System.out.println(a %= b);// a=a%b  a=0%20=0

		System.out.println(a *= b);// a=a*b   a=0*20=0

	}

}
