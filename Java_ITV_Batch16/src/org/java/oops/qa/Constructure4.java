package org.java.oops.qa;

public class Constructure4 {

	int a;// 0 //5

	// User defined

	public Constructure4(int a) {// 3

		System.out.println("User deined argument constructure");// 4
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}

	Constructure4() {// 3
		System.out.println("zero argument construre");
	}

	public static void main(String[] args) {// 1

		Constructure4 ref = new Constructure4(5);// 2

		System.out.println(ref.a);// 6
		
		Constructure4 ref2 = new Constructure4();// 2

		System.out.println(ref2.a);// 6
	}

}
