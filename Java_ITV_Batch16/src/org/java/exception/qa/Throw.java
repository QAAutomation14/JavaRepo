package org.java.exception.qa;

import java.io.FileNotFoundException;

public class Throw {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Start----");

		int age = 20;

		if (age > 21) {

			System.out.println("You can proceed");
		} else {
			System.out.println("Age is below the condition");
			// throw new StringIndexOutOfBoundsException();

			throw new FileNotFoundException();
		}

		 System.out.println("End----");

	}

}
