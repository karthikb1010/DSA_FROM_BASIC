package _2_arrays;

import java.util.Scanner;

public class _I_9_Equilibrium_Index {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int totalSum = 0;
		for(int i=0; i<n; i++) {
			 totalSum += arr[i];
		}
		
		int leftSum = 0;
		
		for(int i=0;i<n;i++) {
			int rightSum = totalSum - leftSum - arr[i] ;
			
			if(leftSum == rightSum) {
				System.out.println("This is the Equilibrium index: " + i);
				return;
			}
			leftSum += arr[i];
		}
		System.out.println("No Equilibrium index found");
		
		sc.close();
	}

}
