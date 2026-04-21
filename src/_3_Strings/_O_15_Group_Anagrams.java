package _3_Strings;
/*
Given array of strings:

["eat","tea","tan","ate","nat","bat"]


Group them like:

[eat, tea, ate]
[tan, nat]
[bat]

🧠 BIG IDEA (simple)

If two words are anagrams:

👉 when you SORT their letters → they become SAME

Example:

"eat" → sort → "aet"
"tea" → sort → "aet"
"ate" → sort → "aet"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _O_15_Group_Anagrams {

	public static void main(String[] args) {

		String[] words = {"eat","tea","tan","ate","nat","bat"};

		HashMap<String, List<String>> map = new HashMap<>();

		for(String word : words){

			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			if(!map.containsKey(key)){
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(word);
		}

		for(List<String> group : map.values()){
			System.out.println(group);
		}
	}

}
/*

📌 Problem Understanding

You are given a list of words.
You need to group together words that are anagrams.

👉 Anagrams = words having same characters with same frequency, but in different order
Example: eat, tea, ate

🧠 Core Concept

If two words are anagrams:

👉 When their letters are sorted, they become identical

Example:

eat → aet
tea → aet
ate → aet

✔ Same sorted form ⇒ same group

🛠️ Approach (Conceptual Steps)
Take each word one by one
Rearrange (sort) its characters
Use this sorted version as an identity (key)
Group all words having the same key together

👉 Store groups using a mapping structure (key → list of words)

💡 Why This Works
Anagrams contain same letters
Sorting arranges letters in fixed order
So all anagrams produce same sorted string
This becomes a reliable way to identify groups
⚡ Complexity Understanding
Sorting each word takes time
If there are n words and each word has length k:

👉 Total Time = O(n × k log k)

Extra space is used for grouping words
🔥 Key Interview Points
Main trick: convert problem → grouping using common representation
Sorted string acts as a unique identifier
Efficient grouping achieved using hashing (mapping)
🚀 Alternative Idea (Important)

Instead of sorting:

👉 Count frequency of each character (a–z)

Every anagram will have the same frequency pattern
This avoids sorting and improves performance
⚠️ Edge Cases to Remember
Empty strings
Single element input
No anagrams (each word separate)
All words identical
🧠 One-Line Revision

👉 “Anagrams → same sorted form → use it as key → group them”

*/
