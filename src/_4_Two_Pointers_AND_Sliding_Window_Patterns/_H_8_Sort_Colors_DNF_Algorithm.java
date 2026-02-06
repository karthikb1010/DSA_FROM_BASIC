package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
📌 Problem (simple words)

You are given an array that contains only:

0 , 1 , 2


Example:

[2,0,2,1,1,0]


You must sort it like:

[0,0,1,1,2,2]


⚠️ Without using extra array
⚠️ In one pass (single loop)

🧠 BIG IDEA (3 pointers)

We use:

👉 low → for 0s
👉 mid → current element
👉 high → for 2s

👉 Meaning:

• left side → only 0s
• middle → 1s
• right side → only 2s

 */
public class _H_8_Sort_Colors_DNF_Algorithm {

	public static void main(String[] args) {

		int[] arr = {2,0,2,1,1,0};
		int n = arr.length;

		int low =0, mid =0, high = n - 1;

		while(mid<= high) {

			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;

				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {  //if(arr[mid]==2) {

				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;

				high--;
			}	
		}

		System.out.println("Sorted array:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
