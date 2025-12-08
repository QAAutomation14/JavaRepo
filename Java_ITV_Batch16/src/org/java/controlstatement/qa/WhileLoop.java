package org.java.controlstatement.qa;

public class WhileLoop {

	public static void main(String[] args) {

		System.out.println("Print 1-10");

		int a = 1;

		do {

			System.out.println(a);
			++a;
		} while (a <= 10); // 1>=10

		System.out.println("Print 10-1");

		int b = 10; // 9

		do {
			System.out.println(b);// 10 9 8
			--b;
		} while (b >= 1); // 9>=1 8>=1

	}

}
