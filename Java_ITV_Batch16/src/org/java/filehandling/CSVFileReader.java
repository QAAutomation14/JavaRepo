package org.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
	
	public static void main(String[] args) throws IOException {
		
		String file="C:\\EclipseWorkspace\\Java_ITV_Batch14\\TestData\\TestData.csv"; 
		
		String line;
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while((line=br.readLine())!=null) {
			
			String str[]=line.split(",");
			
			for(String values:str) {
				System.out.println(" "+values);
			}
		}
		br.close();
		
	}

}
