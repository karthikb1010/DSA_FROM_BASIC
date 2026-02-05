package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
🧠 WHAT IS THIS PROBLEM REALLY?

You are given heights:

[1,8,6,2,5,4,8,3,7]


Think of them as vertical walls:

|
|       |       |
|       |   |   |
|   |   |   |   |
|   | | | | | | |
-----------------


(rough idea)

Now you must:

👉 choose ANY TWO walls
👉 pour water between them

The water forms a container

Your goal:

🎯 find the two walls that hold the MOST water

💧 HOW MUCH WATER CAN TWO WALLS HOLD?

Water depends on TWO things:

1️⃣ Width (distance between them)

If walls are far apart → more space

2️⃣ Height (shorter wall)

Water will spill from the shorter wall.

⚠️ IMPORTANT REAL LIFE FACT:

If one wall is short and one tall:

👉 water can only fill up to the SHORT wall

Example:

Tall wall 10
Short wall 3


Water will overflow after height 3.

So height = 3 (the smaller one)

🎯 THAT IS WHY WE USE:
min(h[left], h[right])


Because:

👉 water level = smaller wall height

*/

public class _C_3_Container_With_Most_Water {

	public static void main(String[] args) {

		int[] arr = { 1,8,6,2,5,4,8,3,7};

		int left = 0;
		int right = arr.length -1;

		int maxArea = 0;

		while(left < right) {

			int height = Math.min(arr[left], arr[right]);
			int width = right - left;
			int area = height * width ;
			maxArea = Math.max(maxArea, area);

			if(arr[left] < arr[right]) {
				left++;
			}else {
				right--;
			}
		}

		System.out.println("Max Water : " + maxArea);

	}
}


