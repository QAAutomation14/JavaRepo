package org.java.controlstatement.qa;

public class NestedIf {

	public static void main(String[] args) {

		System.out.println("Start");

		int age = 0;
		int salary = 0;
		int car = 0;

		if (age >= 21) {
			if (salary >= 1000) {
				if (car >= 2) {
					System.out.println("you are eligible for marry");
				} else {
					System.out.println("you don't have enough car for the marriage");
				}
			} else {
				System.out.println("you don't have good salary");
			}

		} else {
			System.out.println("You are minor in age");
		}

		System.out.println("End");
	}

}
