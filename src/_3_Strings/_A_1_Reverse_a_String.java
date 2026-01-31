package _3_Strings;

import java.util.Scanner;

/*
Given a string:
"hello"

Output should be:
"olleh"

Given a string:

"hello"


Output should be:

"olleh"
 */
public class _A_1_Reverse_a_String {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String:");
		String str = sc.next();

		char[] arr = str.toCharArray();

		int left =0;
		int right = arr.length -1;

		while(left < right) {

			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}

		String reverse = new String(arr);
		System.out.println("Reverse string is :" + reverse);

		sc.close();
	}

}
