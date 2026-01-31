package _2_Arrays;

import java.util.Scanner;

// Move all zeros to End(0,1,0,2,4) ->(1,2,4,0,0)

public class _E_5_Move_Zeros_To_End {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter your array elements:");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		
		for(int i =0;i<n;i++) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		while(index < n) {
			arr[index] = 0;
			index++;
		}
		
		System.out.println("Result:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		sc.close();
	}

}
 