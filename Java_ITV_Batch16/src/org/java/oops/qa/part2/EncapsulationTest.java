package org.java.oops.qa.part2;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		
		Encapsulation1_Bank ref=new Encapsulation1_Bank();
		
		
		ref.setBankBalance(5000);
		System.out.println(ref.getBankBalance());
		
	}

}
