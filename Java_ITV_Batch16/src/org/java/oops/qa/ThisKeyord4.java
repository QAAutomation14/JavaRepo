package org.java.oops.qa;

public class ThisKeyord4 {

	ThisKeyord4(){
		this(23445);//constructor chaining 
		System.out.println("This is zero argument const");
	
	}
	
	ThisKeyord4(int a){
		System.out.println("This is 1 int type argument const");
		System.out.println("a value is "+a);
	}

	public static void main(String[] args) {

		ThisKeyord4 obj = new ThisKeyord4();
		
	

		

	}

}
