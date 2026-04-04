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

/*

🫧 Bubble Sort — Quick Revision Notes
🔹 What is Bubble Sort?

Bubble Sort is a simple comparison-based sorting algorithm where:

👉 Adjacent elements are compared
👉 Swapped if they are in the wrong order
👉 This process repeats until the array is sorted

🔹 Key Idea (Very Important)

👉 Largest element moves to the end in each pass
👉 Just like bubbles rise to the top 🫧

🔹 Working Principle

For an array of size n:

Total passes = n - 1
In each pass:
Compare adjacent elements
Swap if needed
After each pass:
The last element is fixed (sorted)
🔹 Algorithm Steps
Start from index 0
Compare arr[j] and arr[j+1]
Swap if arr[j] > arr[j+1]
Repeat till end of array
Reduce comparisons in next pass (n-1-i)
Continue until all passes complete
🔹 Code Logic (Your Code Understanding)
Outer Loop
for(int i = 0; i < n-1; i++)

👉 Controls number of passes

Inner Loop
for(int j = 0; j < n-1-i; j++)

👉 Controls comparisons per pass
👉 -i because last elements are already sorted

Swap Condition
if(arr[j] > arr[j+1])

👉 Swap if elements are in wrong order

🔹 Time Complexity
Case	Time Complexity
Best Case	O(n) (if optimized)
Average	O(n²)
Worst Case	O(n²)

👉 Your code is not optimized, so:
➡️ Best case is also O(n²)

🔹 Space Complexity

👉 O(1) (in-place sorting, no extra space)

🔹 Stability

👉 ✅ Stable algorithm
(Same elements keep their relative order)

🔹 Advantages

✔ Easy to understand
✔ Easy to implement
✔ No extra memory needed

🔹 Disadvantages

❌ Very slow for large data
❌ Not used in real-world big applications
*/


