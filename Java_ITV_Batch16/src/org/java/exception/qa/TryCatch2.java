package org.java.exception.qa;

public class TryCatch2 {

	public static void main(String[] args) {

		System.out.println("start");

		try {
			int a = 10 / 0;

			System.out.println(a);
		} finally {
			for(int i=10; i<20; i++) {
				System.out.println(i);
			}
			System.out.println("I wil executed with or without execption handling");
		}

		System.out.println("end");
	}

}
