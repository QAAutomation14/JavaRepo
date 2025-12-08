package org.java.oops.qa.part2;

public class Inheritance_Test {

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
		
		Inheritance_Child1_2 ref3=new Inheritance_Child1_2();
		System.out.println(ref3.bankBalanceOfChild2);
		System.out.println(ref3.bankBalanceOfChild);
		System.out.println(ref3.bankBalanceOfParent);
		
		ref3.Car();
		ref3.cycle();
		ref3.cycle2();

		System.out.println("Animal Hierarchical---------------");
		
		Dog dog=new Dog();
		System.out.println(dog.legsOfAnimal);
		dog.eating();
		dog.barking();
		
		Cat cat=new Cat();
		
		System.out.println(cat.legsOfAnimal);
		cat.eating();
		cat.mewing();
		
		
	}

}
