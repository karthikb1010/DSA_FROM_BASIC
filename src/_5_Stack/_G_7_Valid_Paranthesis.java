package _5_Stack;

import java.util.Stack;

public class _G_7_Valid_Paranthesis {

	public static void main(String[] args) {
		
		String s = "([{}])";
		int n = s.length();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<n ; i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("Invalid ");
					return;
				}
			
			char top = stack.pop();
			
			if(ch == ')' && top!= '(' ||
				ch == '}' && top!= '{' ||
				ch == ']' && top!= '[' ) {
				System.out.println("Invalid");
				return;
			}
		}
		}
		if(stack.isEmpty()) {
			System.out.println("Valid parenthesis");
		}else {
			System.out.println("Invalid parenthesis");
		}
	}

}

/*

Here are **quick revision notes** for your *Valid Parentheses using Stack* problem 👇

---

## 🧠 Core Idea

* Use a **Stack (LIFO)** to track opening brackets.
* Every closing bracket must match the **most recent opening bracket**.

---

## 🔑 Key Logic

* Traverse string **left → right**
* For each character:

  * **Opening bracket** → push into stack
  * **Closing bracket** → check with top of stack

---

## ⚡ Rules to Remember

### 1️⃣ Push condition

* If `(`, `{`, `[` → push into stack

---

### 2️⃣ Pop & Match condition

* If closing bracket:

  * First check → stack **should NOT be empty**
  * Pop top element
  * Check matching:

    * `)` → `(`
    * `}` → `{`
    * `]` → `[`

---

### 3️⃣ Invalid cases

* Stack empty when closing appears ❌
* Mismatch pair ❌
* Stack not empty at end ❌

---

### 4️⃣ Valid case

* Stack is **empty at end** ✅

---

## 🔄 Flow Summary

1. Start loop
2. Push opening brackets
3. For closing:

   * Check empty
   * Pop and compare
4. After loop:

   * Stack empty → Valid
   * Else → Invalid

---

## 🧩 Example Walkthrough

`([{}])`

* Push `(`
* Push `[`
* Push `{`
* `}` matches `{` ✅
* `]` matches `[` ✅
* `)` matches `(` ✅
* Stack empty → **Valid**

---

## 💡 Important Concepts (Interview Focus)

* **Stack (LIFO)**
* **Matching pairs**
* **Edge cases handling**
* **Early return optimization**

---

## 🚨 Common Mistakes

* Forgetting `stack.isEmpty()` check
* Not checking mismatch properly
* Ignoring leftover elements in stack

---

## 🧠 One-Line Memory Trick

👉 *"Push openings, match closings, stack must end empty."*

---

If you want, I can also give you **1–2 tricky interview test cases** that break most beginner solutions 🔥


*/
