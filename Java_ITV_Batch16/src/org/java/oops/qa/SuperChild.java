package org.java.oops.qa;

public class SuperChild extends SuperParent {

	int b = super.bankBalance;;

	public void childCycle() {
		super.car();
	}
	
	public SuperChild(){
		super();
	}
	
	public static void main(String[] args) {

		SuperChild sc = new SuperChild();

		System.out.println(sc.b);
		sc.childCycle();

	}
}
