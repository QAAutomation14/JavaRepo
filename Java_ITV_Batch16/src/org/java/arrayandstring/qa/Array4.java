package org.java.arrayandstring.qa;

class Array4 {

	public static int a = 10;

	 static int b = 10;

	public static void main(String[] args) {

//Array- Non Primitive- Object 

		int arr[][] = { { 123, 323 }, { 314365, 3256372 } };

		for (int i = 0; i < arr.length; i++) {// row i=0 1
			for (int j = 0; j < arr.length; j++) {// column data j=0 1 0 1

				System.out.println(arr[i][j]);
			}
		}

		System.out.println("For each loop or Advance for each loop");

		for (int brr[] : arr) {
			for (int crr : brr) {
				System.out.println(crr);
			}

		}

	}

}
