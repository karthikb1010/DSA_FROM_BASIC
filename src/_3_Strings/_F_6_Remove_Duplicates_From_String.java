package _3_Strings;

/*
REMOVE DUPLICATES FROM STRING

📌 PROBLEM IN SIMPLE WORDS

You are given a string.
You must remove duplicate characters and keep only the first occurrence.

🧪 Examples:
"programming" → "progamin"
"banana" → "ban"
"aabbcc" → "abc"

🧠 BASIC IDEA (VERY SIMPLE)
We will:

👉 go through each character
👉 if we see it first time → keep it
👉 if already seen → skip it

We use HashSet (stores unique values).

WHAT IS A HashSet? (VERY SIMPLE)
Think of HashSet as a box that:

✅ Stores values
❌ NEVER allows duplicates

That’s it.
📦 Example:

If you try to put:
a, b, c, a, b

Inside HashSet →

It will store only:
a, b, c

Because:

👉 duplicates are ignored automatically

*/

import java.util.HashSet;
import java.util.Scanner;

public class _F_6_Remove_Duplicates_From_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		

		String result = "";
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);	
			
			if(!set.contains(ch)) {
				set.add(ch);
				result = result + ch;
			}
		}
		System.out.println("After removing duplicates: " + result);
		
sc.close();
	}

}
