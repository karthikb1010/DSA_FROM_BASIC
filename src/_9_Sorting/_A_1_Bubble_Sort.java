package _9_Sorting;

/*
Think of bubbles in water 🫧

👉 Smaller numbers “bubble up” to the front
👉 Bigger numbers slowly move to the end

Bubble Sort works by:

✅ Comparing two adjacent elements
✅ Swapping them if they are in wrong order
✅ Repeating this again and again

Simple Example (Ascending order)

Array:

5  3  1  4


We compare side by side:

Pass 1:

Compare 5 and 3 → swap → 3 5 1 4
Compare 5 and 1 → swap → 3 1 5 4
Compare 5 and 4 → swap → 3 1 4 5

👉 Biggest number (5) reached end

Pass 2:

Compare 3 and 1 → swap → 1 3 4 5
Compare 3 and 4 → no swap

Pass 3:

Compare 1 and 3 → no swap

Now array is sorted:

1 3 4 5

*/

import java.util.Scanner;

public class _A_1_Bubble_Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}


		for(int i =0;i < n-1 ;i++) {

			for(int j=0; j<n-1 -i ;j++) {
				if(arr[j] > arr[j + 1] ) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}

		}
		System.out.println("The sorted array is :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
			
			sc.close();
		}

	}

}
