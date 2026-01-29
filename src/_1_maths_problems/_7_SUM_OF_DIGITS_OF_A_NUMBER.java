package _1_maths_problems;

import java.util.Scanner;

// FIND  THE SUM OF DIGITS OF A NUMBER

public class _7_SUM_OF_DIGITS_OF_A_NUMBER {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int n = sc.nextInt();
		int sum =0;
		
		while( n> 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("sum of digits is :" + sum);
		
		
		sc.close();
		

	}

}
