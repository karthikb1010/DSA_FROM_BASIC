package _2_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
You are given an array.

You must replace each number with its rank when the array is sorted.

👉 Smallest number → rank 1
👉 Second smallest → rank 2
👉 and so on...

🧪 Example:
Array = [20, 15, 26, 2, 98, 6]


First sort it:

[2, 6, 15, 20, 26, 98]


Assign ranks:

2  → 1
6  → 2
15 → 3
20 → 4
26 → 5
98 → 6


Now replace in original array:

[20, 15, 26, 2, 98, 6]
 ↓   ↓   ↓  ↓   ↓   ↓
[4,  3,  5, 1,  6,  2]

We do this in 3 steps:

	1️⃣ Make a copy of array
	2️⃣ Sort the copy
	3️⃣ Store ranks in HashMap
	4️⃣ Replace original values using HashMap
 */
public class _P_16_Replace_EachElement_By_Its_Rank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		int[] temp = arr.clone();
		Arrays.sort(temp);

		HashMap<Integer,Integer> map = new HashMap<>();

		int rank = 1;

		for(int i=0;i<n;i++) {
			if(!map.containsKey(temp[i])) {
				map.put(temp[i], rank);
				rank++;
			}
		}

		for(int i=0;i<n;i++) {
			arr[i] = map.get(arr[i]);
		}
		System.out.println("Array after Replacing by rank is:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
