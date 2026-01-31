package _2_Arrays;

import java.util.Scanner;

/*FIND MISSING NUMBER (1 TO N)
      You are given an array that contains numbers from 1 to N,
	  but one number is missing.(this problem deals when only 1 digit is missing)
	  Your task 👉 find the missing number.

	There is a formula for sum of first N numbers: Sum = N × (N + 1) / 2
	1️ Calculate expected sum
	2️ Calculate array sum
	3️ Missing = expected - actual 
	
	Exactly one number missing AND no duplicates.
	*/

public class _C_3_Find_Missing_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N(last number):");
		int N = sc.nextInt();
		
		int[] arr = new int[N-1];
		
		System.out.println("Enter the elements");
		for(int i=0; i<N-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int expectedSum = N * (N + 1) /2 ; 
		
		int actualSum = 0;
		
		for(int i=0; i< arr.length; i++) {
			actualSum = actualSum + arr[i] ;
		}

		int missing  = expectedSum - actualSum ;
		
		System.out.println("The missing number is:" + missing);
		
		sc.close();
		}

}
