package _4_Two_Pointers_AND_Sliding_Window_Patterns;
/*
📌 Problem (simple words)

You are given two sorted arrays:

Example:

arr1 = [1, 3, 5]
arr2 = [2, 4, 6]


You must merge them into one sorted array:

[1, 2, 3, 4, 5, 6]

🧠 BIG IDEA (Two pointers)

We use:

👉 one pointer for arr1 → i
👉 one pointer for arr2 → j
👉 one pointer for merged array → k

We always pick the smaller element.

*/
public class _F_6_Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] merged = new int[n1 + n2];
		
		int i=0 ,j=0 ,k=0;
		
		while( i < n1 && j < n2 ) {
			if(arr1[i] < arr2[j]) {
				merged[k] = arr1[i];
				i++;
			}else {
					merged[k] = arr2[j];
					j++;
				}
				k++;
			
		}
		
		while( i < n1) {
			merged[k] = arr1[i];
			i++;
			k++;
		}
		
		while( j < n2) {
			merged[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println("Merged Array is : ");
		for(int x =0 ; x < merged.length ;x++) {
			System.out.print(merged[x] + " ");
		}
	}

}
