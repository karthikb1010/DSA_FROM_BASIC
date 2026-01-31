package _2_Arrays;

import java.util.Scanner;

/*
	MAXIMUM PRODUCT SUBARRAY
	(This is like Kadane’s Algorithm, but with multiplication instead of addition)
	You are given an array.

	Find the continuous subarray whose product is maximum.

	Example:
	[2, 3, -2, 4]

	Best subarray:
	[2, 3]

	Product:
	2 × 3 = 6  ✅ (maximum)
 */
public class _H_8_Maximum_Product_Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		System.out.println("Enter the array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];


		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		int maxProd = arr[0];
		int minProd = arr[0];
		int result = arr[0];

		for(int i =1;i<n;i++) {
			int tempMax = Math.max(arr[i], Math.max(maxProd * arr[i] , minProd * arr[i]));
			int tempMin = Math.min(arr[i], Math.min(maxProd * arr[i] , minProd * arr[i]));

			maxProd = tempMax;
			minProd = tempMin;

			result = Math.max(result, maxProd);
		}

		System.out.println("The maximum product subarray is:" + result);

		sc.close();
	}

}
