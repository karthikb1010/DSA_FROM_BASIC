package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
✅ MAX SUM SUBARRAY OF SIZE K ✅
📌 Problem (simple words)

Given:

arr = [2,1,5,1,3,2]
k = 3

Find maximum sum of any subarray of size 3.

🧪 All possible subarrays of size 3:
[2,1,5] → sum = 8
[1,5,1] → sum = 7
[5,1,3] → sum = 9
[1,3,2] → sum = 6

Answer = 9

🧠 BRUTE FORCE (wrong way)

Nested loop → O(nk) ❌
Too slow.

🧠 SLIDING WINDOW IDEA

Instead of recalculating sum every time:

👉 Keep track of current window sum
👉 Subtract element going out
👉 Add new element coming in

//clear way
///
📌 Problem in simple words

You have an array:

[2, 1, 5, 1, 3, 2]

And a number:

k = 3

You must:

👉 Find 3 continuous numbers
👉 Whose sum is maximum

🧠 What does “subarray of size 3” mean?

Subarray means:

👉 Continuous elements
👉 No skipping

Example:

Allowed:

[2,1,5]
[1,5,1]

Not allowed:

[2,5,3] ❌ (not continuous)
🧠 Brute Force Thinking (slow way)

We could:

1️⃣ Take first 3 numbers → add
2️⃣ Move one step → add again
3️⃣ Repeat

But notice something:

When we move window:

[2,1,5]  →  [1,5,1]

We are:

Removing 2
Adding 1

So why calculate full sum again?

🔴 SLIDING WINDOW IDEA 🔴

Think like a moving box:

[2,1,5] → window

Then slide right:

[1,5,1]

Then:

[5,1,3]

Then:

[1,3,2]
🧠 Instead of recalculating:

When window moves:

Old window:

2 + 1 + 5 = 8

Next window:

Remove leftmost element
Add new rightmost element

So:

8 - 2 + 1 = 7
🎯 So the core logic is:

👉 First calculate sum of first window
👉 Then for every move:

subtract element leaving window

add element entering window

🧠 Why this is smart?

Because:

Instead of adding 3 numbers every time
We do only:

1 subtraction + 1 addition

Much faster.

*/

public class _I_9_MaxSumSubarrayK {

	public static void main(String[] args) {

		int[] arr = {2,1,5,1,3,2};

		int windowSum = 0;
		int maxSum = 0;

		int k = 3;

		for(int i=0; i<k;i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;

		for(int i= k; i < arr.length; i++) {
			windowSum = windowSum - arr[i-k] + arr[i];

			if(windowSum > maxSum) {
				maxSum = windowSum;
			}
		}
		System.out.println("Max sum = " + maxSum);
	}
}
