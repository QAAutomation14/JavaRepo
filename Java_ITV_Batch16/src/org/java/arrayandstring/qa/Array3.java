package org.java.arrayandstring.qa;

public class Array3 {

public static void main(String[] args) {
	
//Array- Non Primitive- Object 
	
int arr[][]=new int[2][2];

arr[0][0]=2253;
arr[0][1]=4;
arr[1][0]=5;
arr[1][1]=83;

for(int i=0; i<arr.length;i++) {//row   i=0 1
	for(int j=0; j<arr.length; j++) {//column data j=0 1  0 1
		
		System.out.println(arr[i][j]);
	}
}

	System.out.println("For each loop or Advance for each loop");
	
	for(int brr[]:arr) {
		for(int crr:brr) {
			System.out.println(crr);
		}
		
	}
	
}

}
