package _4_Two_Pointers_AND_Sliding_Window_Patterns;
/*
You are given an array and a number diff.

You must check if there exists a pair such that:

arr[right] - arr[left] = diff

🧪 Example:
arr = [1, 3, 5, 8, 10]
diff = 2


Possible pair:

3 - 1 = 2 ✅
5 - 3 = 2 ✅


So answer → YES

🧠 BIG IDEA

Since array is sorted:

👉 Use two pointers

left = 0
right = 1

Rules:

• if difference is SMALL → move right
• if difference is BIG → move left
• if equal → found pair

 */
public class _G_7_Pair_With_Given_Difference {

	public static void main(String[] args) {

		int[] arr = {1,3,5,8,10};
		int diff = 5;

		int left =0;
		int right =1;

		boolean found = false;
		while( left < arr.length && right <arr.length) {


			int currentDiff = arr[right] -arr[left];

			if(currentDiff == diff) {
				System.out.println("Pairs Found : " + arr[left] + " ," + arr[right]);
				found = true;
				break;
			}else if( currentDiff < diff) {
				right++;
			}else {
				left++;
			}
			// make sure right always ahead
			if( left == right) {
				right++;
			}
		}
		if(!found) {
			System.out.print("No Pairs Found");
		}
	}

}
