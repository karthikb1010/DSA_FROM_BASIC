package maths_problems;

import java.util.Scanner;

//Reverse Digits of a number  (123 = 321)

public class Reverse_Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int rev = 0;
		
		while( n>0) {
			int digit = n % 10 ;
			rev = rev * 10 + digit ;
			n = n / 10 ;
			
		}
		System.out.println("Reversal of a number is " + rev);

	}

}
