package _3_Strings;

/*
✅ CHECK IF ONE STRING IS SUBSEQUENCE OF ANOTHER ✅
📌 PROBLEM IN SIMPLE WORDS

You are given two strings:

👉 small string s1
👉 big string s2

You must check:

👉 Do all characters of s1 appear in s2 in the same order
(not necessarily continuous)

🧪 Examples:
s1 = "abc"
s2 = "ahbgdc"


👉 a → found
👉 b → found after a
👉 c → found after b

So:

YES (subsequence)


s1 = "axc"
s2 = "ahbgdc"
👉 a → found
👉 x → NOT found ❌

So:

NO

🧠 BASIC IDEA (TWO POINTERS)

We use:

👉 one pointer for s1
👉 one pointer for s2

We move through s2 and try to match s1 characters in order.
 */
import java.util.Scanner;

public class _I_9_Check_Subsequence_Of_Other { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string1 :");
		String s1 = sc.next();

		System.out.println("Enter string2 :");
		String s2 = sc.next();

		int i=0;
		int j=0;
 
		while(i < s1.length() && j < s2.length()) {
			if(s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			j++;
		}
		if(i == s1.length()) {
			System.out.println("Subsequence");
		}else {
			System.out.println("It is not subsequence");
		}
		sc.close();
	}

}
