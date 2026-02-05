package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
Given an array, find all triplets (3 numbers) whose sum = 0.

Example:

arr = [-4, -1, -1, 0, 1, 2]


Answer:

[-1, -1, 2]
[-1, 0, 1]

🧠 BIG IDEA

1️⃣ Fix one number (i loop)
2️⃣ Use two pointers for remaining part (left & right)
3️⃣ Reduce it to Two Sum

⚠️ Array must be sorted first

Sorted array:

[-4, -1, -1, 0, 1, 2]
*/

public class _B_2_Three_Sum {

	public static void main(String[] args) {
		
		int[] arr =  { -4, -1, -1, 0, 1,2 };
		int n = arr.length;
		
		for(int i=0;i< n -2; i++) {
			
			int left = i + 1;
			int right = n -1;
			
			while(left < right) {
				
				 // skip duplicate fixed element //this and below can be skipped if array doesn't have duplicate elements
				  if(i > 0 && arr[i] == arr[i - 1]) continue;
				
				int sum = arr[i] + arr[left] + arr[right] ;
				
				if(sum ==0) {
					System.out.println(arr[i] + " " +  arr[left] + " " + arr[right]);
					
					  // skip duplicate left and right
                    while(left < right && arr[left] == arr[left + 1]) left++;
                    while(left < right && arr[right] == arr[right - 1]) right--;

					left++;
					right--;
				}else if(sum < 0) {
					left++;
				}else {
					right--;
				}
			}
			
		}

	}

}
