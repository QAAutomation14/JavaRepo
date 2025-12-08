package org.java.oops.qa;

public class Constructure3 {

	int a;// 0 //5

	// User defined

	public Constructure3(int a) {//3

		System.out.println("User deined zero argument constructure");//4
	for(int i=4000; i<=a;i++) {
		System.out.println(i);
	}
	}

	public static void main(String[] args) {//1

		Constructure3 ref = new Constructure3(5000);//2

		System.out.println(ref.a);//6
	}

}
