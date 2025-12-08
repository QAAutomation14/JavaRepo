package org.java.arrayandstring.qa;

public class StraingStringBufferStringBuilder2 {

	public static void main(String[] args) {
		System.out.println("Strat------------------");

		System.out.println("String-------");
		
		String s2 = "ABc";
		s2.concat("dgh");//tempo
		System.out.println(s2);

		System.out.println("StringBuffer-------");
		
		StringBuffer s1 = new StringBuffer("Sachin");
		s1.append("Tendulkar");
		System.out.println(s1);

		System.out.println("StringBuilder-------");
		StringBuilder s3 = new StringBuilder("Sachin");
		s3.append("Tendulkar");
		System.out.println(s3);
		System.out.println("End------------------");
	}

}
