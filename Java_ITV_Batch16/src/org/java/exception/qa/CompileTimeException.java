package org.java.exception.qa;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeException {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Start----");
		
		//exceptions- I need to handle
		//Checked or Compile-time exception
		
		//Throws- it is used 
		
		Thread.sleep(5000);//5000ms-5s
		
		FileReader fr=new FileReader("Abc.txt");
		
		
		System.out.println("End----");
	}

}
