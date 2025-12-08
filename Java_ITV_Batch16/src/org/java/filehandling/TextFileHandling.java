package org.java.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextFileHandling {
	
	public static void main(String[] args) {
		
		try {
		FileInputStream fis=new FileInputStream("C:\\EclipseWorkspace\\Java_ITV_Batch14\\Test.txt");
		
		int i;
		
		/*
		 * System.out.println(fis.read()); System.out.println(fis.read());
		 */
		
		
		while((i=fis.read())!=-1) {//true false
			System.out.print((char)i);
		}
		fis.close();
		
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		//writing the value
		
	try {
		FileOutputStream fos=new FileOutputStream("C:\\EclipseWorkspace\\Java_ITV_Batch14\\Test2.txt");
		
		String data="I am a qa automation engineer";
		
		fos.write(data.getBytes());
		
		fos.close();
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		
	}

}
