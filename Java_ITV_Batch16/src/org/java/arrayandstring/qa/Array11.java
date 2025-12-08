package org.java.arrayandstring.qa;

public class Array11 {

public static void main(String[] args) {
	
//Array- Non Primitive- Object 
	
	
	int arr[] =new int[2];
	
	arr[0]=123;
	arr[1]=124; 
	
	System.out.println("Print by normal syso");
	System.out.println("Index 0 value is "+arr[0]);
	
	System.out.println(arr[1]);
	
	
	System.out.println("Print by for loop");
	
	for(int i=0; i<arr.length; i++) { //index= length-1 
		System.out.println(arr[i]);
	}
	
	System.out.println("Print by for each loop or advance for loop");
	
	for(int brr :arr) {
		
		System.out.println(brr);
	}
}

}
