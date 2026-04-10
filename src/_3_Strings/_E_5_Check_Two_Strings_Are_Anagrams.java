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


/*

Good — this is a **classic and very important placement problem** 🔥
Here are your **clean revision notes (no code)** 👇

---

# 🧠 Anagram Strings — Revision Notes

## 📌 Problem Idea

Two strings are **anagrams** if:

* They contain the **same characters**
* With the **same frequency**
* Order **does NOT matter**

---

## 🧪 Examples

| String 1 | String 2 | Result        |
| -------- | -------- | ------------- |
| listen   | silent   | ✅ Anagram     |
| race     | care     | ✅ Anagram     |
| hello    | world    | ❌ Not Anagram |

---

## 💡 Core Concept

👉 “Same characters + Same count = Anagram”

---

## 🔁 Steps to Solve

### ✅ Step 1: Length Check

* If lengths are different → ❌ Not anagram
* Because counts can’t match

---

### ✅ Step 2: Count Characters

* Count frequency of characters in first string

---

### ✅ Step 3: Compare with Second String

* Traverse second string:

  * If character not found → ❌ Not anagram
  * Decrease count

---

### ✅ Step 4: Final Check

* If all counts become **zero** → ✅ Anagram

---

## ⚡ Why This Works

* First string builds frequency
* Second string cancels it out
* If perfectly balanced → valid anagram

---

## ⏱ Complexity

* Time: **O(n)**
* Space:

  * **O(n)** → HashMap
  * **O(1)** → Array (for a–z)

---

## 🔥 Important Interview Points

### ✔ Order Doesn’t Matter

* Only frequency matters

---

### ✔ Early Exit Optimization

* If length mismatch → stop immediately

---

### ✔ Best Optimization

* Use **array instead of HashMap** when:

  * Only lowercase letters
  * Faster + constant space

---

## ❗ Common Mistakes (IMPORTANT ⚠️)

### ❌ 1. Overwriting frequency

* Don’t reset count accidentally while counting

---

### ❌ 2. Not checking negative count

* If count goes below 0 → ❌ Not anagram

---

### ❌ 3. Forgetting final validation

* All counts must be **zero**

---

### ❌ 4. Ignoring case sensitivity

* "Listen" ≠ "silent" (if case-sensitive)

---

## 🧠 Pattern Recognition

This problem belongs to:

* **Hashing / Frequency Count**
* **String Comparison**
* **Validation Problems**

---

## 🚀 Quick Memory Trick

👉 “Count → Cancel → Check Zero”

---

## ⚡ Bonus (Advanced Thinking)

### Variations asked in interviews:

* Valid Anagram (basic)
* Group Anagrams
* Anagram Substring
* Minimum changes to make anagram

---

If you want next, I can:
✅ Fix the small bug in your code (there is one 👀)
✅ Give tricky test cases interviewers use
✅ Or give you top 10 string problems for placements


*/
