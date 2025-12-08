package org.java.exception.qa;

public class TryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
		int a=10/0;
		
		System.out.println(a);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

	

}
