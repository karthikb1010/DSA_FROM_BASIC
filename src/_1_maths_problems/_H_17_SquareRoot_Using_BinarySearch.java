package _1_maths_problems;

// find the square root of a number

import java.util.Scanner;

public class _H_17_SquareRoot_Using_BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			
			int low = 1;
			int high = n;
			int ans = 0;
			
			while(low <= high) {
				int mid = (low + high) /2;
			
				if(mid * mid == n) {
					ans = mid;
					break;
				}else if(mid * mid < n) {
					ans = mid;
					low = mid + 1;
				}else {
					high = mid -1;
				}
				
				
			}
			System.out.println("The square root is:" + ans);

			
			sc.close();
	}

}
