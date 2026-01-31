package _2_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
//THREE SUM PROBLEM

📌 PROBLEM IN SIMPLE WORDS

You are given an array.

Find three numbers whose sum is 0 (or a given target).

(Most famous version → sum = 0)

📌 PROBLEM IN SIMPLE WORDS

You are given an array.

Find three numbers whose sum is 0 (or a given target).

(Most famous version → sum = 0)

🧪 Example:
Array = [-1, 0, 1, 2, -1, -4]


One valid triplet:

[-1, 0, 1]


Another:

[-1, -1, 2]
*/
public class _L_12_Three_Sum_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n-2; i++) {
			
			int left = i + 1;
			int right = n -1;
			
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				
				if(sum == 0) {
					System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
					left++;
					right--;
				}
				else if(sum < 0) {
					left++;
				}
				else {
					right--;
				}
				
			}
		}
	}

}



/*
///////////////////// if they ask target then below code

🧠 WHAT CHANGED?

Before:

if(sum == 0)

Now:

if(sum == target)
That’s it ✅


import java.util.*;

public class ThreeSumTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        for(int i = 0; i < n - 2; i++){

            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == target){
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    left++;
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}


*/




