package _2_arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
You are given two arrays.

Find the elements that appear in both arrays.

(Intersection = common elements)

COUNT FREQUENCY OF EACH ELEMENT 🔴

(This introduces HashMap counting — very important!)


Example:
Array = [1, 2, 2, 3, 1, 4, 2]


Output:

1 → 2 times
2 → 3 times
3 → 1 time
4 → 1 time

Example:
Array = [1, 2, 2, 3, 1, 4, 2]


Output:

1 → 2 times
2 → 3 times
3 → 1 time
4 → 1 time

*/

public class _O_15_Count_Frequency_Of_Each_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(int key : map.keySet()) {
			System.out.println(key + "->" + map.get(key));
		}
		
		sc.close();
	}

}
