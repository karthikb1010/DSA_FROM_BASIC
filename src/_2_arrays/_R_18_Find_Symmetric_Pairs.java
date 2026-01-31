package _2_Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
FIND SYMMETRIC PAIRS

You are given pairs of numbers like this:
(a, b)

A symmetric pair exists if:
(a, b) and (b, a)

both are present.

🧪 Example:
Input pairs:

(1, 2)
(3, 4)
(2, 1)
(5, 6)
(4, 3)


Symmetric pairs are:

(1, 2) and (2, 1)
(3, 4) and (4, 3)

 */
public class _R_18_Find_Symmetric_Pairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of pairs:");
		int n = sc.nextInt();

		HashMap<Integer,Integer> map = new HashMap<>();

		System.out.println("Enter the pair:");
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();


			if(map.containsKey(b) && map.get(b) == a) {
				System.out.println("symmetric pairs are: (" + a + ", " + b + ")");
			}else {
				map.put(a, b);
			}

		}
		sc.close();
	}

}
