package _5_Stack;
/*

1️⃣ Concept

Given an array, for every element we must find the first smaller element on the right side.

If no smaller element exists → return -1.

Example:

arr = [4, 8, 5, 2, 25]

We check only elements to the right of each element.

Expected Output
4  → 2
8  → 5
5  → 2
2  → -1
25 → -1

Final Result Array:

[2, 5, 2, -1, -1]
2️⃣ Brute Force Idea

For every element:

Check all elements to the right until we find a smaller element.

Example for element 8:

8 → check 5 → smaller → answer = 5

Example for element 2:

2 → check 25 → not smaller
No smaller element → answer = -1
Time Complexity
O(n²)

Because:

For every element we scan the remaining array.

Too slow for large inputs.

3️⃣ Optimized Stack Idea

We use a monotonic stack.

Idea:

Traverse the array from right to left.

For each element:

1️⃣ Remove elements greater than or equal to current element
2️⃣ If stack becomes empty → answer = -1
3️⃣ Otherwise → stack top is the next smaller element
4️⃣ Push the current element into stack

Why traverse from right?

Because we want the next smaller element on the right side.

Stack will always store possible smaller candidates.

4️⃣ Dry Run

Array:

[4, 8, 5, 2, 25]

Traverse from right → left.

Step 1 → 25

Stack empty.

Result = -1

Push 25.

Stack:

[25]
Step 2 → 2

Check stack top:

25 >= 2 → remove 25

Stack becomes empty.

Result = -1

Push 2.

Stack:

[2]
Step 3 → 5

Check stack top:

2 >= 5 ? ❌ No

So next smaller = 2

Result = 2

Push 5.

Stack:

[2, 5]
Step 4 → 8

Check stack top:

5 >= 8 ? ❌ No

So next smaller = 5

Result = 5

Push 8.

Stack:

[2, 5, 8]
Step 5 → 4

Check stack:

8 >= 4 → remove
5 >= 4 → remove
2 >= 4 ? ❌ No

Next smaller = 2

Result = 2

Push 4.

Stack:

[2, 4]
Final Result
[2, 5, 2, -1, -1]

*/

import java.util.Stack;

public class _D_4_Next_Smaller_Element {

	public static void main(String[] args) {
		
		int[] arr = {4,8,5,2,25};
		int n = arr.length;
		
		int[] result = new int[n];

		Stack<Integer> stack = new Stack<>();
		
		for(int i = n-1 ;i >= 0; i--) {
		while(!stack.isEmpty() && stack.peek() >= arr[i]) {
		
			stack.pop();
		}
		
		
		if(stack.isEmpty()) {
			result[i] = -1;
		}else {
			result[i] = stack.peek();
		}
		
		stack.add(arr[i]);
		}
		
		for(int x : result) {
			System.out.print(x + " ");
		}
	}

}
