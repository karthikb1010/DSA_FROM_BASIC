package _1_maths_problems;

import java.util.Scanner;

// SWAP TWO NUMBERS WITHOUT USING TEMP VARIABLE

public class _A_10_SWAP_TWO_NUMBERS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a =  sc.nextInt();


		System.out.println("Enter the 2nd number");
		int b =  sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("values of a and b after swap");
		System.out.println("a:" + a);
		System.out.println("b:" + b);

		sc.close();
	}


}
