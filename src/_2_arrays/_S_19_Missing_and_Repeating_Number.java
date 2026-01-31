package _2_Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
MISSING + REPEATING NUMBER (1 to N)

You are given an array of size N
It contains numbers from 1 to N

👉 One number is missing
👉 One number is repeating

You must find both.

🧪 Example:
Array = [1, 2, 2, 4, 5]

Here:

👉 Numbers should be: 1 2 3 4 5
👉 But 3 is missing ❌
👉 And 2 appears twice 🔁

So:

Missing = 3
Repeating = 2

🧠 SIMPLE CONCEPT (USING HASHMAP — EASY TO UNDERSTAND)
We’ll:

✔ count frequency
✔ the one with freq = 2 → repeating
✔ the number from 1..N with freq = 0 → missing

*/
public class _S_19_Missing_and_Repeating_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+ 1);
		}else {
			map.put(arr[i], 1);
		}
		}
		
		int missing = -1;
		int repeating = -1;
		
		for(int i = 1;i<=n;i++) {
			if(!map.containsKey(i)) {
				missing = i;
			}
			else {
				if(map.get(i) == 2) {
					repeating = i;
				}
			}
		}
		System.out.println("Missing number :" + missing);
		System.out.println("Repeating number: " + repeating);
		
sc.close();
	}

}
