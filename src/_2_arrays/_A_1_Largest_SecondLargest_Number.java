package _2_Arrays;

import java.util.Scanner;

//FIND LARGEST & SECOND LARGEST ELEMENT IN A ARRAY

public class _A_1_Largest_SecondLargest_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt(); 
		}
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i < n ;i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			
			}else if(arr[i] > max2 && arr[i] !=max1) {
					max2 = arr[i];
				}
		
		}
			System.out.println("The 1st largest is:" + max1);
			System.out.println("The 2nd largest is:" + max2);
			
		
			sc.close();
	}

}
