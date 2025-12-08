package org.java.qa;

public class InstanceVariable {

	int a=10;
	double d; 
	
	
	public static void main(String[] args) {
		
		//creation of the Object
		//Object- Instance of the class
		//1 class = 1 or n Object 
		// ClassName variableName=new ClassName(); 

		InstanceVariable obj = new InstanceVariable();

		System.out.println(obj.a);
		System.out.println(obj.d);
		
	}

}
