package _3_Strings;

import java.util.Scanner;



public class _G_7_Longest_Common_Prefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string array size:");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		System.out.println("Enter string elements:");
	for(int i=0;i<n;i++) {
		arr[i] = sc.next(); 
	}
	
	String prefix = arr[0];
	
	for(int i=1;i<n;i++) {
		while(arr[i].indexOf(prefix) != 0) {
			prefix = prefix.substring(0, prefix.length()-1);
			
			if(prefix.isEmpty()) {
				System.out.println("No commom prefix");
				return;
			}
		}
		
	}
	
	System.out.println("The common prefix is: " + prefix);
	
	}

}


/*
You are given multiple strings.

You must find the longest starting part (prefix) that is common in all strings.

Example 1:
["flower", "flow", "flight"]

Common prefix:
"fl"


🧪 Example 2:
["dog", "racecar", "car"]
Common prefix:
""   (nothing common)

🧠 BASIC IDEA (VERY SIMPLE)

👉 Take the first string as reference
👉 Compare its characters with same position in other strings
👉 Stop when mismatch happens




extra



## 📘 Longest Common Prefix — Revision Notes (Theory Only)

---

## 🧠 Problem Understanding

You are given multiple strings.
Your task is to find the **longest starting portion (prefix)** that is common in **all strings**.

* Prefix = characters from the **beginning only**
* If no common prefix → return empty string `""`

---

## 💡 Core Idea (Most Important Line)

👉 Start with one string as reference and **reduce/compare until all strings match**

---

## 🔍 Key Observations

* The answer will always be a prefix of the **first string**
* If even one string doesn’t match → reduce prefix
* Once prefix becomes empty → no common prefix exists

---

## ⚙️ Two Main Approaches (Theory)

### 1️⃣ Prefix Shrinking Method

* Take first string as prefix
* Compare with each string
* If mismatch → keep reducing prefix
* Stop when it matches all

👉 Think like:

> “Try full word → if fails, remove last character → repeat”

---

### 2️⃣ Character-by-Character Comparison

* Compare characters at same index across all strings
* Stop when:

  * mismatch occurs OR
  * any string ends

👉 Think like:

> “Check column-wise instead of word-wise”

---

## ⚖️ Time Complexity

* **O(n × m)**

  * `n` = number of strings
  * `m` = length of shortest string

---

## ⚠️ Important Edge Cases (VERY IMPORTANT)

* Array is empty → return `""`
* Only one string → return that string
* Strings with no common prefix → return `""`
* One string is very short → limits prefix length

---

## ❌ Common Mistakes

* Comparing full strings instead of prefix only
* Forgetting empty string case
* Index out of bounds in character comparison
* Not stopping early when mismatch found

---

## 🧠 Interview Explanation (Use This)

👉
*"I take the first string as a candidate prefix and compare it with other strings. If it doesn’t match, I reduce the prefix until it matches all strings or becomes empty."*

---

## 🔗 Pattern Recognition

This problem belongs to:

* String matching
* Prefix problems
* Iterative reduction pattern

---

## 🎯 Key Takeaway

👉 Always **narrow down the prefix step-by-step** until it works for all strings.

---

If you want, I can give:

* 🔥 5 similar important problems (asked in placements)
* 🔥 Trick to solve all prefix-type questions easily


*/
