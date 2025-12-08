package org.java.oops.qa.part3;

public class SBI implements RBI,WorldBank {

	@Override
	public void loan() {
		
		System.out.println("SBI Loan");
		System.out.println("ROI= "+8.55+"%");

	}

	@Override
	public void regulatory() {
		System.out.println("Regulatory body of SBI");
		
	}

	

}
