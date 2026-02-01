package _3_Strings;

/*
Two strings are called anagrams if:

👉 they contain the same characters
👉 in the same quantity
👉 but order can be different

🧪 Examples:
"listen"  & "silent"  → anagram ✅
"race" & "care" → anagram ✅
"hello" & "world" → not anagram ❌


We will:

1️⃣ Count characters of first string
2️⃣ Count characters of second string
3️⃣ Compare both

If all counts match → anagram
*/

import java.util.HashMap;
import java.util.Scanner;

public class _E_5_Check_Two_Strings_Are_Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1 = sc.next();


		System.out.println("Enter the string2:");
		String str2 = sc.next();

		if(str1.length() != str2.length()) {
			System.out.println("Its Not a Anagram");
			return;
		}


		HashMap<Character ,Integer> map = new HashMap<>();

		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);

			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			map.put(ch, 1);

		}

		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);

			if(!map.containsKey(ch)) {
				System.out.println("Not a Anagrams");
				return;
			}
			map.put(ch ,map.get(ch) -1);	
		}
		System.out.println("It is a Anagram");

	}

}
