package _2_arrays;

import java.util.Scanner;

// Find Duplicate number in a array

public class _D_4_Find_Duplicate_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yout array size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for (int j= i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicates are:" + arr[i]);
					return;
				}
			}
		}
		System.out.println("No Duplicates found");
		

		sc.close();
	}

}
