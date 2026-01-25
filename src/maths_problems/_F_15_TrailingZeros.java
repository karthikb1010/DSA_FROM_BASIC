package maths_problems;

import java.util.Scanner;

//Counting trailing zeros in Factorial

public class _F_15_TrailingZeros {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int count = 0;
		
		while( n>0) {
			n = n / 5 ;
			count  = count + n;
		}
		System.out.println("The trailing numbers are: " + count);

		sc.close();
	}

}
