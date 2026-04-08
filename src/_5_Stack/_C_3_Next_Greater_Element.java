package _5_Stack;

import java.util.Stack;
public class _C_3_Next_Greater_Element {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,25};
		int n = arr.length;
		
		int[] result = new int[n];

		Stack<Integer> stack = new Stack<>();
		
		for(int i = n-1 ;i >= 0; i--) {
		while(!stack.isEmpty() && stack.peek() <= arr[i]) {
		
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

/*

🔴 3️⃣ NEXT GREATER ELEMENT (NGE) 🔴
1️⃣ Problem Statement

Given an array:

arr = [4, 5, 2, 25]

For every element, find the first greater element on its right.

If no greater element exists → return -1.

✅ Expected Output
4  → 5
5  → 25
2  → 25
25 → -1

Final result array:

[5, 25, 25, -1]
2️⃣ Brute Force Approach (Normal Method)

For each element:

Go to the right

Check one by one

Stop when you find greater

Example for 4:

Check 5 → greater → stop

Example for 5:

Check 2 → no
Check 25 → yes → stop

⏱ Time Complexity
O(n²)

Because:

For every element

We scan remaining array

👉 Slow for large input.

3️⃣ Optimized Approach Using Stack

Now stack becomes powerful 🔥

🧠 Core Idea

We traverse from:

RIGHT → LEFT

Why?

Because we want information about the RIGHT side.

If we go left → right, we don’t know future elements yet.

If we go right → left:

Right side already processed

Stack already contains useful candidates

🔴 Stack Rule

For every element:

1️⃣ Remove all smaller or equal elements from stack
2️⃣ If stack empty → answer = -1
3️⃣ Else → stack top = next greater
4️⃣ Push current element into stack

4️⃣ Complete Dry Run

Array:

[4, 5, 2, 25]

We go from RIGHT → LEFT

🔹 Step 1 → i = 3 → 25

Stack empty.

So:

result[3] = -1

Push 25.

Stack:

[25]
🔹 Step 2 → i = 2 → 2

Stack:

[25]

Check:

Is 25 <= 2? ❌ No

So:

result[2] = 25

Push 2.

Stack:

[25, 2]
🔹 Step 3 → i = 1 → 5

Stack:

[25, 2]

Remove smaller elements:

2 <= 5 → remove 2

Stack becomes:

[25]

Now check:

25 <= 5? ❌ No

So:

result[1] = 25

Push 5.

Stack:

[25, 5]
🔹 Step 4 → i = 0 → 4

Stack:

[25, 5]

Check:

5 <= 4? ❌ No

So:

result[0] = 5

Push 4.

Stack:

[25, 5, 4]
✅ Final Result
[5, 25, 25, -1]
🔴 Why We Remove Smaller Elements?

Suppose current element = 5
Stack top = 2

2 is smaller than 5.

Can 2 ever be next greater for 5? ❌ No

So 2 is useless → remove it.

🔴 Why Use <= Instead of < ?

If equal exists:

Example:

arr = [2, 2]

Second 2 cannot be next GREATER for first 2.

So we remove equal also.


5️⃣ Java Code (Placement Ready)
import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};
        int n = arr.length;

        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
6️⃣ Full Code Flow Summary

Loop runs:

i = 3 → 2 → 1 → 0

Each element:

Enters stack once

Leaves stack once

So total operations:

O(n)
🔥 Time & Space Complexity

Time:

O(n)

Space:

O(n)
🔴 Important Interview Insight

This is called:

👉 Monotonic Decreasing Stack

Because stack always keeps elements in decreasing order.

🔥 Very Important Pattern

NGE is base for:

Stock Span Problem

Daily Temperatures

Largest Rectangle in Histogram

Sliding Window Maximum

Trapping Rain Water

This is foundation of many hard problems.

🎯 Final Concept Summary (Write This in Notes)
Next Greater Element:

Traverse from right to left.
Use stack.
Remove smaller or equal elements.
Top of stack becomes answer.
Push current element.
Time complexity = O(n).

*/

