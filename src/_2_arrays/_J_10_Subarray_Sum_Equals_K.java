package _2_arrays;

import java.util.HashMap;
import java.util.Scanner;

/* You are given:

👉 an array
👉 a number K

You must find if there exists a continuous subarray whose sum = K.

🧪 Example:
Array = [1, 2, 3, 4, 5]
K = 9

Subarray:

[2, 3, 4] → sum = 9 ✅

We use:

👉 prefix sum
👉 hashmap (store previous sums)

Prefix sum means:

👉 sum from start up to current index.

Example:

Array = [1,2,3,4]
Prefix sums:
[1,3,6,10]

*/
public class _J_10_Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the k:");
		int k = sc.nextInt();
		
		
		HashMap<Integer ,Integer> map = new HashMap<>();
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += arr[i];
		
		if(sum == k) {
			System.out.println("The subarray index is from 0 to " + i);
			return;
		}
		
		if(map.containsKey(sum -k)) {
			System.out.println("Subarray found from " + (map.get(sum - k) + 1 ) + " to " + i);
			return;
		}
		
		
		map.put(sum, i);
		
		}
		
System.out.println("No subarray sum equals found");
sc.close();
	}

}
