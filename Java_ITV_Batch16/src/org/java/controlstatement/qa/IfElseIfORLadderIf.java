package org.java.controlstatement.qa;

public class IfElseIfORLadderIf {

	public static void main(String[] args) {

		System.out.println("Start");

		int a = 1000;
		int b = 210;
		int c = 3000;

		if (a > b && a > c) {
			System.out.println("a is richest");
		} 
		else if (b > a && b > c) {
			System.out.println("b is richest");
		} 
		else  {
			System.out.println("c is richest");
		}

		System.out.println("End");
	}

}
