package _3_Strings;

/*
FIRST NON-REPEATING CHARACTER ✅
📌 PROBLEM IN SIMPLE WORDS

You are given a string.
You must find the first character that appears only once.

Examples:
"swiss"  → w
"loveleetcode" → v
"aabbcc" → none

*/

import java.util.HashMap;
import java.util.Scanner;

public class _C_3_First_Non_Repeating_Character {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.next();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+ 1);
			}else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i< str.length();i++){
			char ch = str.charAt(i);
			
			if(map.get(ch) == 1) {
				System.out.println("First non repeating character is : " + ch);
				return;
			}
		}
		System.out.println("No non repeating character found");

		sc.close();
	}

}



/*

Got it 👍 — here are **clean revision notes (no code)** for your topic.

---

# 🧠 First Non-Repeating Character — Revision Notes

## 📌 Problem Idea
- Given a string, find the **first character that appears only once**
- If no such character exists → return **-1** (or “none”)

---

## 💡 Core Concept
You need to:
1. **Count frequency** of each character  
2. **Scan again** to find the first character with frequency = 1  

👉 This is a **2-pass approach**

---

## 🔁 Steps to Solve

### ✅ Step 1: Frequency Count
- Traverse the string
- Store how many times each character appears
- Use:
  - HashMap (general case)
  - Array (if only lowercase letters)

---

### ✅ Step 2: Find First Unique
- Traverse the string again (same order)
- Check:
  - If frequency == 1 → return that character/index immediately

---

## ⚡ Why Two Loops?
- First loop → builds data (frequency)
- Second loop → preserves **order** (important!)

👉 If you don’t use second loop, you may lose order.

---

## 🧪 Examples

| Input | Output | Reason |
|------|--------|--------|
| "swiss" | w | s repeats, w appears once |
| "loveleetcode" | v | first unique |
| "aabbcc" | -1 | all repeat |

---

## ⏱ Complexity

- Time Complexity: **O(n)**
- Space Complexity:
  - **O(n)** using HashMap  
  - **O(1)** using array (only a–z)

---

## 🔥 Important Interview Points

### ✔ Order Matters
- Must return **first** non-repeating
- Not just any unique character

---

### ✔ In-place vs Extra Space
- This problem **requires extra space**
- Because you must store frequency

---

### ✔ Optimization
- Use **array instead of HashMap** when:
  - Characters are limited (like lowercase letters)

---

## ❗ Common Mistakes

❌ Checking uniqueness in one loop → wrong  
❌ Returning last unique instead of first  
❌ Forgetting to handle “no unique character”  
❌ Not preserving order  

---

## 🧠 Pattern Recognition

This problem belongs to:
- **Hashing / Frequency Count**
- **String Traversal**
- **Two-pass pattern**

---

## 🚀 Quick Memory Trick

👉 “Count first → then find”

---

If you want next, I can give:
✅ Similar problems for practice (important for placements)  
✅ OR convert this into a **1-page PDF revision sheet**

*/
 