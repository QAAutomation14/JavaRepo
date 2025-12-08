package org.java.arrayandstring.qa;

public class StraingMethods {

	public static void main(String[] args) {
		System.out.println("Strat------------------");

		String s1 = "Sachin";// Heap-SCP

		String s2 = "Tendulkar";// Heap-SCP

		String s3 = new String("sachin");// Heap

		String s4 = " Abc ";

		// System.out.println(s4);
		// String Methods
		
		//15 null
		
		String s7=null;
		
		System.out.println(s7);

		//14. Split- String []
		
		String s6="I am a test engineer";
		
		String srr[]=s6.split(" ");
		
		for(String brr:srr) {
			System.out.println(brr);
		}
		
		
		//13. Substring- String
		
		System.out.println("Substring-> "+s1.substring(3));
		
		
		// 12. replaceAll()- String

		System.out.println("replaceAll-> " + s1.replaceAll(s1,s4));

		// 11. replace()- String

		System.out.println("replace-> " + s1.replace("in", "out"));

		// 10. contains()- boolean

		System.out.println("contains-> " + s1.contains("inn"));

		// 9. equalsIgnoreCase- boolean t/f==> compare the value without case sensitive

		System.out.println("equalsIgnoreCase " + s1.equalsIgnoreCase(s3));

		// 8. equals- boolean t/f==> compare the value

		System.out.println("equals " + s1.equals(s3));
		// 7. trim()-String

		System.out.println("Trim " + s4.trim());

		// 6. indexOf()- int

		System.out.println("indexOf " + s1.indexOf('i'));

		// 5. toLowerCase()- String

		System.out.println("Lowercase-> " + s1.toLowerCase());

		// 4. toUpperCase()-String

		System.out.println("Upper case-> " + s1.toUpperCase());

		// 3. charAt()- char

		System.out.println(s1.charAt(2));

		// Concatenation- adding 2 string or 1 string with 1 numeric value
		int a = 10;
		System.out.println(s1 + s2);
		System.out.println("Result of contact => " + s1 + "," + s2);
		System.out.println("Result of String & Numeric concat will be String only " + s1 + " " + a);

		String s5 = s1 + s2;
		s3 = s1 + s2;
		System.out.println(s5);
		System.out.println(s3);

		System.out.println("Concat Method-> " + " " + s1.concat(" " + s2));

		// length()- Measure the length/size of the String

		System.out.println(s1.length());

		// memory mapping

		System.out.println("Memory Mapping------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		System.out.println("End------------------");
	}

}
