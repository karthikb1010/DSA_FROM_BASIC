package _2_Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
FIND ALL REPEATING ELEMENTS

You are given an array.
You must print all numbers that appear more than once.

🧪 Example:
Array = [1, 2, 3, 2, 4, 1, 5, 2]


Repeating elements are:
1 (appears twice)
2 (appears three times)

Output:
1 2
 */
public class _Q_17_Repeating_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer ,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("The Repeated numers are");
		for(int key : map.keySet()) {
			if(map.get(key) > 1) {
			System.out.print(key + " ");
		}
			}
		
		
		
		sc.close();
	}

}
