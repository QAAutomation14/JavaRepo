package org.java.oops.qa;

public class Constructure2 {

	int a;// 0 //5

	// User defined

	public Constructure2() {//3

		System.out.println("User deined zero argument constructure");//4
	}

	public static void main(String[] args) {//1

		Constructure2 ref = new Constructure2();//2

		System.out.println(ref.a);//6
	}

}
