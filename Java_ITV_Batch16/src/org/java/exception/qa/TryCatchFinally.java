package org.java.exception.qa;

public class TryCatchFinally {

	void m1() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void main(String[] args) {

		System.out.println("Start----");
		
		try {
		Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();//runtime exception 
		}finally {
			System.out.println("I will get executed with or with execption handling");
		}

		System.out.println("End----");
	}

}
