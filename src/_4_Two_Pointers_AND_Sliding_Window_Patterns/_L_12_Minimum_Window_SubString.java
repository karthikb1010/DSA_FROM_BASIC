package _4_Two_Pointers_AND_Sliding_Window_Patterns;
/*

Minimum Window Substring — Notes
🔴 Problem
Given two strings:
s → main string
t → required characters
Find the smallest substring of s that contains all characters of t (with frequency).
Example:
Copy code

s = "ADOBECODEBANC"
t = "ABC"
Answer = "BANC"
🧠 Core Idea
This is a Variable Sliding Window problem.
We:
Expand right pointer until window becomes valid.
Shrink left pointer to make window minimum.
Repeat.
🔴 Step 1: Build Frequency Map of t
Java
Copy code
for(char c : t.toCharArray()){
    map.put(c, map.getOrDefault(c, 0) + 1);
}
What this does:
Converts string t into characters.
Counts how many times each character appears.
Stores frequency in HashMap.
Example:
Copy code

t = "AABC"

Map:
A → 2
B → 1
C → 1
🔴 What is getOrDefault(c, 0)?
Meaning:
If c exists → return its value.
If c does not exist → return 0.
Example:
Copy code

First time 'A' → returns 0 → store 1
Second time 'A' → returns 1 → store 2
🔴 Important Variables
Copy code

left = start of window
right = end of window
count = number of required characters still needed
minLength = smallest window found
start = starting index of smallest window
Initially:
Copy code

count = t.length()
Meaning: We still need all characters.
🔴 Expanding Window
For each character at right:
If character is required:
Reduce its count in map.
If it was needed → decrease count.
When:
Copy code

count == 0
Window becomes VALID.
🔴 What Does count Mean?
count = How many required characters are still missing.
When:
Copy code

count == 0
All required characters are present.
🔴 Shrinking Window
While count == 0:
Update minimum length:
Copy code

right - left + 1
Try removing left character.
If removal makes a required character missing:
Increase count
Move left++
🔴 Why right - left + 1?
Because window is inclusive.
Example:
Copy code

left = 4
right = 9
Window size = 9 - 4 + 1 = 6
🔴 Complete Pattern
Copy code

Expand → until valid
Shrink → until invalid
Repeat
🔥 Key Concepts Learned
✔ Frequency HashMap
✔ Variable Sliding Window
✔ Expand and Shrink logic
✔ Using count to track validity
✔ Inclusive window size formula

Just keep it

*/
import java.util.HashMap;

public class _L_12_Minimum_Window_SubString {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		if(s.length() < t.length()) {
			System.out.println("");
			return;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for(char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}

		int left =0;
		int minLength = Integer.MAX_VALUE;
		int count = t.length();
		int start = 0;

		for(int right = 0; right<s.length(); right++) {

			char ch = s.charAt(right);

			if(map.containsKey(ch)) {
				if(map.get(ch) >0) {
					count--;
				}
				map.put(ch, map.get(ch)-1);
			}

			while(count == 0) {

				if(right - left + 1 < minLength) {
					minLength = right - left +1;
					start = left ;
				}

				char leftChar = s.charAt(left);

				if(map.containsKey(leftChar)) {
					map.put(leftChar, map.get(leftChar) +1);
					if(map.get(leftChar) > 0) {
						count++;
					}
				}
				left++;
			}
		}
		if(minLength == Integer.MAX_VALUE) {
			System.out.println("");
		}else {
			System.out.println(s.substring(start , start + minLength));
		}

	}

}
