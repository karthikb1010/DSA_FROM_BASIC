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


/*

📘 Remove Duplicates from String – Theory Notes
📌 Problem Definition

Given a string, remove all duplicate characters and keep only the first occurrence of each character.

👉 The order of characters must remain the same as the original string.

🎯 Objective
Eliminate repeated characters
Preserve original sequence
Return a string with unique characters
🧠 Core Idea

We scan the string character by character:

If the character appears for the first time → keep it
If it has appeared before → skip it
📦 Concept Used: HashSet
What is a HashSet?

A HashSet is a collection that:

✅ Stores only unique elements
❌ Does not allow duplicates
⚡ Provides fast lookup (O(1))
⚙️ Working Principle
Start with an empty result
Create a HashSet to track seen characters
Traverse the string:
For each character:
Check if it exists in the set
If not:
Add it to the set
Add it to the result
If yes:
Ignore it
Final result contains only unique characters


⏱️ Time Complexity
O(n) → We traverse the string once
💾 Space Complexity
O(n) → In worst case, all characters are unique


⚠️ Important Points
Order is preserved because we process string sequentially
HashSet ensures duplicates are automatically ignored
Works for:
lowercase letters
uppercase letters
digits
symbols
🧩 Key Insight

👉 The combination of iteration + HashSet gives:

Efficient duplicate removal
Simple logic
Optimal performance
*/
 