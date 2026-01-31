package _2_Arrays;

import java.util.Scanner;

//KADANE'S ALGORITHM(MAX SUBARRAY SUM)

//You are given an array.
//
//You must find the continuous part (subarray) whose sum is maximum.
/*
[ -2, 1, -3, 4, -1, 2, 1, -5, 4 ]
The best subarray is:
[4, -1, 2, 1]

Sum:
4 + (-1) + 2 + 1 = 6  ✅ (maximum)

As we move through array:

👉 keep adding numbers
👉 if sum becomes negative → drop it (start fresh)

Because:

Negative sum only makes future sum smaller.

 */


public class _G_7_Max_Subarray_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int n =sc.nextInt();

		int[] arr = new int[n];

		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}

		int currentSum = arr[0];
		int maxSum = arr[0];

		for(int i=1;i<n;i++) {
			currentSum = Math.max(arr[i] ,currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}


		System.out.print("Maximum subarray sum = " + maxSum);

		sc.close();
	}

}
