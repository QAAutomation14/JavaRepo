package org.java.qa;

public class OperatorsInJava1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20; 
		
		System.out.println(++a); //10+1=11   first increment then use 
		
		System.out.println(--a);//11-1=10
		
		
		System.out.println(a++);//10, 10+1=11 first use then Increment
		
		System.out.println(a--);//11, 11-1=10
		
		System.out.println(a);
		
		
		int c =++a + ++b; 
		
		System.out.println(c);
		
	}

}
