package _2_Arrays;

import java.util.Scanner;

//Rotate array by K positions

/*Rotating an array means:

	👉 shifting elements to the right (or left)

	Example (right rotate by 2):

	Original: [1, 2, 3, 4, 5]	
	Rotate by 2 → [4, 5, 1, 2, 3]    */

public class _F_6_Rotate_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the k:");
		int k = sc.nextInt();

		int[] temp = new int[n];


		for(int i=0; i< k; i++) {
			temp[i] = arr[n -k +i];
		}
		for(int i =k;i<n;i++) {
			temp[i] = arr[i - k];
		}
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " " );
		}


		sc.close();
	}

}
