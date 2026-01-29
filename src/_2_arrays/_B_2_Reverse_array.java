package _2_arrays;

import java.util.Scanner;

//Reverse an array

public class _B_2_Reverse_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];


		
		System.out.println("Enter the array elements");
		for(int i = 0; i < n ;i++ ) {
			arr[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = n-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println("Reversed array:");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
