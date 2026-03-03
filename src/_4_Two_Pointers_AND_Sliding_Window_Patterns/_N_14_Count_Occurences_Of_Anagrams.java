package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
🔹 Problem

Given:

String s

Pattern p

Find how many substrings of s are anagrams of p.

🔹 Core Idea

Use Fixed Sliding Window + HashMap (Frequency Map)

Window size = k = p.length()

🔹 Algorithm Steps

1️⃣ Store frequency of pattern p in a HashMap.

2️⃣ Initialize:

count = number of unique characters in map
left = 0
ans = 0

3️⃣ Move right pointer:

If character exists in map:

Decrease frequency

If frequency becomes 0 → count--

4️⃣ When window size becomes k:

If count == 0 → anagram found → ans++

Before moving left:

Restore frequency of s[left]

If frequency becomes 1 → count++

Move left++

🔹 Important Logic

✔ count == 0 → All characters matched
✔ Fixed window → right - left + 1 == k

🔹 Time Complexity
O(N)

Each character processed at most twice.

🔹 Pattern Type

✅ Fixed Sliding Window
✅ Frequency Map Technique
*/
import java.util.HashMap;

public class _N_14_Count_Occurences_Of_Anagrams {
 
	public static void main(String[] args) {

		String s = "forxxorfxdofr";
		String p = "for";

		HashMap<Character,Integer> map = new HashMap<>();

		for(char c : p.toCharArray()) {
			map.put(c, map.getOrDefault(c ,0)+ 1);
		}

		int count = map.size();
		int k = p.length();
		int ans = 0;
		int left = 0;
		

		for(int right =0; right<s.length(); right++) {
			char ch = s.charAt(right);

			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) -1);

				if(map.get(ch) ==0) {
					count--;
				}
			}
				if(right - left + 1 ==k ) {
					if(count ==0) {
						ans++;
					}

					char leftChar = s.charAt(left); 
					
					if(map.containsKey(leftChar)){ 
						map.put(leftChar, map.get(leftChar) + 1); 
						if(map.get(leftChar) == 1){ 
							count++; 
						}
					} 
					left++; 
				}
			}
			System.out.println("Total anagrams = " + ans);
		}
	}

