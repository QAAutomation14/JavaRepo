package org.java.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {
	
	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\EclipseWorkspace\\Java_ITV_Batch14\\TestData\\testdata.properties");
		
		pro.load(fis);
		
		//System.out.println(pro.getProperty("url"));
		String url=pro.getProperty("url");
		System.out.println(url);
		
		String un=pro.getProperty("userName");
		System.out.println(un);
		
		
		String pwd=pro.getProperty("password");
		System.out.println(pwd);
		
		fis.close();
	}

}
