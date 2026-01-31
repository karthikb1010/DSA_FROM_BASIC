package _2_arrays;

import java.util.Scanner;

/*
 You are given an array.

For each index, you must calculate:

👉 product of ALL elements except the one at that index.

⚠️ You are NOT allowed to use division.

🧪 Example:
Array = [1, 2, 3, 4]


Output:

[24, 12, 8, 6]


Because:

At index 0 → 2×3×4 = 24
At index 1 → 1×3×4 = 12
At index 2 → 1×2×4 = 8
At index 3 → 1×2×3 = 6
 */

public class _T_20_Product_Of_Array_Except_Itself {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];


		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		int[] left = new int[n];
		int[] right = new int[n];
		int[] result = new int[n];

		left[0] = 1;
		for(int i=1; i<n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}	

		right[n-1] = 1;
		for(int i= n-2 ;i >= 0;i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}

		for(int i=0;i<n;i++) {
			result[i] = left[i] * right[i];
		}

		System.out.println("The product of array except itself :");
		for(int i=0;i<n;i++) {
			System.out.print(result[i] + " ");
		}

		sc.close();
	}

}
