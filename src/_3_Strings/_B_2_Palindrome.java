package _3_Strings;
/*
We compare:


👉 first character with last
👉 second with second last
👉 and so on...

If all match → palindrome.

*/

import java.util.Scanner;

public class _B_2_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String:");
		String str = sc.next();

		int left =0;
		int right = str.length() -1 ;

		boolean isPalindrome = true;
		while(left < right) {
			if( str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		sc.close();
	}

}
