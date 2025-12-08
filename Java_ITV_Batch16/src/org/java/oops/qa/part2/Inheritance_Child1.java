package org.java.oops.qa.part2;

public class Inheritance_Child1 extends Inheritance_Parent1{
	
	int bankBalanceOfChild=10000; 
	
	public void cycle() {
		System.out.println("Child Cycle");
	}

	public static void main(String[] args) {

		// simple Inheritance
		//child object reference can access both parent and itself property 
		Inheritance_Child1 ref1=new Inheritance_Child1();
		
		System.out.println(ref1.bankBalanceOfChild);
		System.out.println(ref1.bankBalanceOfParent);
		
		ref1.Car();
		ref1.cycle();
		
		Inheritance_Parent1 ref2=new Inheritance_Parent1();
		System.out.println(ref2.bankBalanceOfParent);
		ref2.Car();

	}

	
}
