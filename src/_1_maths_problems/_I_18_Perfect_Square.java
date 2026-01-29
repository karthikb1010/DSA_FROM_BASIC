package _1_maths_problems;

//check if a number is a  perfect square

import java.util.Scanner;

public class _I_18_Perfect_Square {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int low = 1;
		int high = n;
		boolean isPerfect = false;

		while(low <= high) {
			int mid = (low + high) /2;

			if(mid * mid == n) {
				isPerfect = true;
				break;
			}else if(mid * mid < n) {
				low = mid +1;

			}else {
				high = mid -1;
			}
		}
		if(isPerfect ) {
			System.out.println("The number is Perfect Square");
		}else {
			System.out.println("The number is not a perfect square");
		}


		sc.close();

	}

}
