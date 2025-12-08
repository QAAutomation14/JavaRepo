package org.java.oops.qa;

public class ThisKeyord {

	int a;//0  

	public void test(int b) {
		a = b;//a=420
	}

	public static void main(String[] args) {

		ThisKeyord obj = new ThisKeyord();
		
		System.out.println(obj.a);
		obj.test(420);
		System.out.println(obj.a);
		

	}

}
