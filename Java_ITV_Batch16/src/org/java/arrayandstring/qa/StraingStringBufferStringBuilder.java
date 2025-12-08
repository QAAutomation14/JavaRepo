package org.java.arrayandstring.qa;

public class StraingStringBufferStringBuilder {

	public static void main(String[] args) {
		System.out.println("Strat------------------");

		StringBuffer s1=new StringBuffer("Sachin");
		StringBuffer s2=new StringBuffer("Tendulkar");
		StringBuffer s3=new StringBuffer("Sachin");
	

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// memory mapping

		System.out.println("Memory Mapping------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		// SCP

		System.out.println("Mutable----------");

		s3 = s3.append("Kohli");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		System.out.println("End------------------");
	}

}
