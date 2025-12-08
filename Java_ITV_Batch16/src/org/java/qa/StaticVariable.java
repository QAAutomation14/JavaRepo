package org.java.qa;

public class StaticVariable {

	static int a=10; 
	
	static int b; //0
	
	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);

		//best practice access the static variable with class name only
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.b);
	}
	
}
