package org.java.exception.qa;

public class TryCatch3 {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
		String [] str= {"Abc","Xyz"};
		
		System.out.println(str[2]);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("end");
	}

	

}
