package _4_Two_Pointers_AND_Sliding_Window_Patterns;
/*
🧠 WHAT IS THIS PROBLEM REALLY?

You are given heights of walls:

Example:

heights = [3, 0, 2, 0, 4]


Imagine rain falls.

Some water gets trapped between walls.

Your job:

👉 calculate TOTAL trapped water.


🧠 SIMPLE LOGIC (NO CODE YET)

At each position:

👉 Water = min(maxLeft, maxRight) - height[i]

Meaning:

• find tallest wall on left
• find tallest wall on right
• smaller of them decides water level

📌 Why smaller?

Because water will spill from the shorter side.

🧪 For example at height 0 (index 1):

Left max = 3
Right max = 4

So:

water = min(3,4) - 0 = 3
 */
public class _D_4_Trapped_Rain_Water {

	public static void main(String[] args) {

		int[] h = {3,0,2,0,4};
		int n = h.length;

		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		leftMax[0] = h[0];
		for(int i= 1;i<n;i++) {

			leftMax[i] = Math.max(leftMax[i -1], h[i]);
		}
		rightMax[n-1] = h[n-1];
		for(int i= n-2 ;i >=0 ;i--) {

			rightMax[i] = Math.max(rightMax[i +1], h[i]);
		}

		int water =0;
		for(int i=0;i<n;i++) {
			water += Math.min(leftMax[i], rightMax[i]) - h[i];
		}
		System.out.println("The Trapped water :" + water);
	} 

}
