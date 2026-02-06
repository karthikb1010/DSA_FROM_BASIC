package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
📌 Problem (simple words)

You are given a sorted array like:

[1,1,2,2,3,3,3,4]


You must:

👉 remove duplicates
👉 keep only unique elements

Result should become:

[1,2,3,4]


(you don’t need a new array — modify same one)

🧠 BIG IDEA (Two pointers)

We use:

👉 one pointer to track unique position (j)
👉 one pointer to scan array (i)

👉 Pointer meaning:

• i → moves through array
• j → stores next unique element position

🧠 WHY THIS WORKS?

Because array is sorted:

👉 duplicates are always together
👉 so we compare adjacent values

🧠 SIMPLE LOGIC

• if same → ignore
• if different → store it

🧠 ONE-LINE MEMORY

Keep unique at front using two pointers
*/

public class _E_5_Remove_Duplicates_From_Sorted_Array {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,3,3,4};
		int n = arr.length;
		
		int j =0;
		
		for(int i=1;i<n;i++) {
			
			if(arr[i] != arr[j]) {
				j++;
				arr[j] =arr[i];
			}
		}
		
		System.out.println("Array After Removing Duplicates");
		for(int i=0;i<= j;i++) {
			System.out.print(arr[i] + " ");
			
		}

	}

}
