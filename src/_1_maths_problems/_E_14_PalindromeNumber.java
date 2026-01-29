package _1_maths_problems;

// Palindrome Number Check

import java.util.Scanner;

public class _E_14_PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
	
		int original = n;
		int rev = 0 ;
		
		while(n > 0) {
			int digit = n % 10 ;
			rev = rev * 10 + digit;
			n = n / 10;
			
		
		}
		if(rev == original) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		sc.close();

	}

}
