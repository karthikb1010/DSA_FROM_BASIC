package _3_Strings;

import java.util.Scanner;




/*
📌 PROBLEM IN SIMPLE WORDS

You are given a string.

You must find the longest part (substring) that is a palindrome.

(Remember: palindrome = same forward & backward)

Examples:
"babad" → "bab"  (or "aba")
"cbbd"  → "bb"
"racecar" → "racecar"

🧠 IMPORTANT DIFFERENCE
👉 Subsequence (earlier problem)

Characters can be apart.

👉 Substring (this problem)

Characters must be continuous.

Example:

"abc"
substrings: "a", "ab", "abc", "b", "bc", "c"

🧠 BASIC IDEA (EXPAND FROM CENTER)

Every palindrome has a center.

Example:

racecar
   ^


or

bb
 ^^


So we:

👉 pick each index as center
👉 expand left and right while characters match

 */
public class _J_10_Longest_Palindrome_Substring {

	public static String expand(String s,int left,int right) {

		while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1,right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string :");
		String s = sc.next();

		String longest = "";

		for(int i=0;i< s.length();i++) {

			String p1 =expand(s , i ,i);
			String p2 =expand(s , i ,i+1);

			if(p1.length() > longest.length()) {
				longest = p1;
			}
			if(p2.length() > longest.length()) {
				longest = p2;
			}
		}
		System.out.println("Longest palindrome substring:" + longest);

sc.close();
	}

}
