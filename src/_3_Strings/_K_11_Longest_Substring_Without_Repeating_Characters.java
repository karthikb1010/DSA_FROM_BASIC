package _3_Strings;

import java.util.HashSet;
import java.util.Scanner;


/*
📌 PROBLEM IN SIMPLE WORDS

You are given a string.

You must find the longest continuous part (substring) that has:

👉 NO repeated characters

🧪 Examples:
"abcabcbb" → "abc" (length 3)
"bbbbb" → "b" (length 1)
"pwwkew" → "wke" (length 3)

🧠 BASIC IDEA (SLIDING WINDOW)

We use:

👉 two pointers: left and right
👉 a HashSet to track unique characters

We:

• expand right pointer
• if duplicate found → move left pointer

Like a window sliding.
 */

public class _K_11_Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string :");
		String s = sc.next();

		HashSet<Character> set= new HashSet<>();

		int left = 0;
		int maxLength = 0;
		for(int right=0; right <s.length();right++) {
			char ch = s.charAt(right); 

			while(set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			maxLength = Math.max(maxLength,  right -left +1);
		}
		System.out.println("The Longest length:" + maxLength);
		sc.close();
	}
}
