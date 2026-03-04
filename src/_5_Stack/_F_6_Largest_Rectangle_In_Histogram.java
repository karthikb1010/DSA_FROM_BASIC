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
