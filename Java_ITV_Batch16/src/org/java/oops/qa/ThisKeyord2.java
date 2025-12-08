package org.java.oops.qa;

public class ThisKeyord2 {

	int a;//0 

	public void test(int a) {
		
		this.a = a;//a=420
	}

	public static void main(String[] args) {

		ThisKeyord2 obj = new ThisKeyord2();
		
		System.out.println(obj.a);
		obj.test(420);
		System.out.println(obj.a);
		

	}

}
