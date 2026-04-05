package _5_Stack;

/*

Largest Rectangle in Histogram — Notes
🔴 Problem

Given an array heights[] representing histogram bar heights, find the largest rectangular area that can be formed.

Example:

heights = {2,1,5,6,2,3}
Output = 10
🧠 Core Idea

Use a Monotonic Increasing Stack (stores indexes).

Stack maintains bars in increasing height order.

When a smaller bar appears, it means the rectangle of the taller bar must end here, so we pop and calculate area.

📌 Rectangle Calculation

When a bar is popped:

height = heights[popped_index]

Width is calculated using:

width = right_smaller - left_smaller - 1

In the code:

right_smaller = i
left_smaller = stack.peek()

So:

width = i - stack.peek() - 1

If stack becomes empty:

width = i
⚙️ Algorithm Steps

Traverse histogram from 0 → n.

Maintain increasing stack of indexes.

If current bar is smaller than stack top, pop bars.

For each popped bar:

Calculate height

Calculate width

Compute area.

Track maximum area.

Push current index.

Use an extra iteration (i = n) with height 0 to empty stack.

⏱ Time Complexity
O(n)

Each element is pushed once and popped once.

📦 Space Complexity
O(n)

For the stack.

🔑 Key Idea to Remember
current < stack_top  → rectangle of stack_top ends

So pop and compute area.

*/


import java.util.Stack;

public class _F_6_Largest_Rectangle_In_Histogram {

	public static void main(String[] args) {

	        int[] heights = {2, 1, 5, 6, 2, 3};
	        int n = heights.length;

	        Stack<Integer> stack = new Stack<>();
	        int maxArea = 0;

	        for (int i = 0; i <= n; i++) {

//	            int h;
//	            if (i == n) {
//	                h = 0;
//	            } else {
//	                h = heights[i];
//	            }
	        	int h = (i == n) ? 0 : heights[i];
	            while (!stack.isEmpty() && h < heights[stack.peek()]) {

	                int height = heights[stack.pop()];

	                int width;

	                if (stack.isEmpty()) {
	                    width = i;
	                } else {
	                    width = i - stack.peek() - 1;
	                }

	                int area = height * width;

	                maxArea = Math.max(maxArea, area);
	            }

	            stack.push(i);
	        }

	        System.out.println("Maximum Area = " + maxArea);
	    }
	}


/*

1️⃣ Core Problem

👉 Given histogram bars (heights array)

👉 Find maximum rectangular area that can be formed

2️⃣ Key Observation

👉 For every bar:

It can expand left and right
Until we find a smaller bar

👉 That bar becomes the limit

3️⃣ What You Actually Need

For each bar:

👉 Find:

Nearest Smaller to Left (NSL)
Nearest Smaller to Right (NSR)

Then:

👉 Width = right - left - 1

👉 Area = height × width

4️⃣ Why Brute Force is Bad
For each bar → expand left & right
Takes O(n) per element

⏱ Total = O(n²) ❌

5️⃣ Stack Optimization (Main Idea)

👉 Use Monotonic Increasing Stack

Stores indices
Heights are in increasing order
6️⃣ Important Rule

👉 When current height < stack top height:

➡️ The taller bar cannot extend further

➡️ So its rectangle ends here

👉 Pop it and calculate area

7️⃣ Rectangle Calculation (VERY IMPORTANT)

When popping:

Height

👉 height = heights[popped_index]

Width

Two cases:

✅ Case 1: Stack is Empty

👉 No smaller element on left

👉 Width = i

✅ Case 2: Stack NOT Empty

👉 Left boundary = stack.peek()

👉 Width = i - stack.peek() - 1

8️⃣ Why We Use Extra Iteration (i = n)

👉 At the end, some bars remain in stack

👉 To process them:

➡️ Assume current height = 0

➡️ Forces all remaining bars to pop

9️⃣ Why Store Indices (Not Values)?

👉 Needed to calculate width:

👉 i - index

Without indices → cannot compute span/width

🔟 Pattern Recognition (Very Important)

👉 This is a Monotonic Stack Problem

Same pattern used in:

Stock Span
Next Greater Element
Trapping Rain Water
Daily Temperatures
1️⃣1️⃣ Time Complexity

👉 Each element:

Pushed once
Popped once

⏱ Total = O(n) ✅

1️⃣2️⃣ Space Complexity

📦 Stack usage = O(n)

1️⃣3️⃣ Intuition in One Line

👉 "When a smaller bar comes, finish rectangles of taller bars."

1️⃣4️⃣ Edge Cases
All increasing → processed at end
All decreasing → processed immediately
Single bar → area = height
Equal heights → handled using < condition
1️⃣5️⃣ Common Mistakes

❌ Forgetting extra iteration (i = n)
❌ Wrong width formula
❌ Using values instead of indices
❌ Not understanding why we pop
❌ Using <= instead of < (can change behavior)

🎯 Final Summary (Super Short)

👉 Maintain increasing stack
👉 If current < top → pop & calculate area
👉 Width depends on stack state
👉 Track max area

 */