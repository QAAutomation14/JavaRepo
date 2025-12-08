package org.java.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling3 {

	public static void main(String[] args) throws IOException {

		Properties pro = new Properties();

		FileOutputStream fos = new FileOutputStream(
				"C:\\EclipseWorkspace\\Java_ITV_Batch14\\TestData\\testdata_write.properties");

		pro.setProperty("url", "https://www.KatalonAI.com");
		pro.setProperty("Name", "Mr AI");
		pro.setProperty("Address", "San Jones");
		pro.setProperty("Zip", "451101");
		
		pro.store(fos, "Test Configuration");
		
		fos.close();

	}

}
