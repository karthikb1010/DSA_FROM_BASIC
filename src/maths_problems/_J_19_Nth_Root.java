package maths_problems;

// Find Nth root of a number

import java.util.Scanner;

public class _J_19_Nth_Root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number m:");
		int m = sc.nextInt();

		System.out.println("Enter the number n:");
		int n = sc.nextInt();

		int low = 1;
		int high= m;
		int ans = -1;

		while(low <= high) {
			int mid = (low+high)/2;

			long power = 1;
			for (int i =1;i<=n;i++) {
				power = power * mid;
			}
			if(power == m) {
				ans = mid;
				break;
			}
			else if(power < mid) {	
				low = mid +1;
			}
			else {
				high = mid -1;
			}

		}
		if(ans == -1) {
			System.out.println("No integer root found");
		}else {
			System.out.println("The nth root is : " + ans);
		}


		sc.close();
	}

}
