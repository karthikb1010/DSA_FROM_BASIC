package _5_Stack;
/*

1️⃣ Concept

Given an array, for every element we must find the first smaller element on the right side.

If no smaller element exists → return -1.

Example:

arr = [4, 8, 5, 2, 25]

We check only elements to the right of each element.

Expected Output
4  → 2
8  → 5
5  → 2
2  → -1
25 → -1

Final Result Array:

[2, 5, 2, -1, -1]
2️⃣ Brute Force Idea

For every element:

Check all elements to the right until we find a smaller element.

Example for element 8:

8 → check 5 → smaller → answer = 5

Example for element 2:

2 → check 25 → not smaller
No smaller element → answer = -1
Time Complexity
O(n²)

Because:

For every element we scan the remaining array.

Too slow for large inputs.

3️⃣ Optimized Stack Idea

We use a monotonic stack.

Idea:

Traverse the array from right to left.

For each element:

1️⃣ Remove elements greater than or equal to current element
2️⃣ If stack becomes empty → answer = -1
3️⃣ Otherwise → stack top is the next smaller element
4️⃣ Push the current element into stack

Why traverse from right?

Because we want the next smaller element on the right side.

Stack will always store possible smaller candidates.

4️⃣ Dry Run

Array:

[4, 8, 5, 2, 25]

Traverse from right → left.

Step 1 → 25

Stack empty.

Result = -1

Push 25.

Stack:

[25]
Step 2 → 2

Check stack top:

25 >= 2 → remove 25

Stack becomes empty.

Result = -1

Push 2.

Stack:

[2]
Step 3 → 5

Check stack top:

2 >= 5 ? ❌ No

So next smaller = 2

Result = 2

Push 5.

Stack:

[2, 5]
Step 4 → 8

Check stack top:

5 >= 8 ? ❌ No

So next smaller = 5

Result = 5

Push 8.

Stack:

[2, 5, 8]
Step 5 → 4

Check stack:

8 >= 4 → remove
5 >= 4 → remove
2 >= 4 ? ❌ No

Next smaller = 2

Result = 2

Push 4.

Stack:

[2, 4]
Final Result
[2, 5, 2, -1, -1]

*/

import java.util.Stack;

public class _D_4_Next_Smaller_Element {

	public static void main(String[] args) {
		
		int[] arr = {4,8,5,2,25};
		int n = arr.length;
		
		int[] result = new int[n];

		Stack<Integer> stack = new Stack<>();
		
		for(int i = n-1 ;i >= 0; i--) {
		while(!stack.isEmpty() && stack.peek() >= arr[i]) {
		
			stack.pop();
		}
		
		
		if(stack.isEmpty()) {
			result[i] = -1;
		}else {
			result[i] = stack.peek();
		}
		
		stack.add(arr[i]);
		}
		
		for(int x : result) {
			System.out.print(x + " ");
		}
	}

}

/*

Here’s your **clean revision theory** for **Next Smaller Element (Right Side using Stack)** — simple + exam-ready 👇

---

# 📚 Next Smaller Element (Right Side) — Revision Notes

## 🔹 1. Problem Definition

👉 Given an array, for each element find:

➡️ **First smaller element on its right side**

If no smaller element exists → return **-1**

---

### 🔸 Example

```
arr = [4, 8, 5, 2, 25]

Output:
[2, 5, 2, -1, -1]
```

---

## 🔹 2. Key Idea

👉 We only look **to the right side**
👉 We need the **first smaller element (nearest)**

---

## 🔹 3. Brute Force Approach

### ✔ Idea:

For each element:

* Check all elements to its right
* Stop when a smaller element is found

---

### ✔ Time Complexity:

👉 **O(n²)**

❌ Not efficient for large inputs

---

## 🔹 4. Optimized Approach (Stack)

👉 Use a **Monotonic Increasing Stack**

---

## 🔹 5. Why Stack?

Stack helps to:

* Keep track of **possible smaller elements**
* Remove useless elements quickly

---

## 🔹 6. Important Trick ⭐

👉 Traverse **RIGHT → LEFT**

Because:

* We need elements on the **right side**
* Stack already contains future elements

---

## 🔹 7. Algorithm Steps

For each element (right → left):

### Step 1:

```java
while(!stack.isEmpty() && stack.peek() >= arr[i])
```

👉 Remove all elements **greater than or equal**
👉 Because they can never be the answer

---

### Step 2:

```java
if(stack.isEmpty())
    result[i] = -1;
else
    result[i] = stack.peek();
```

👉 If stack empty → no smaller element
👉 Else → top is answer

---

### Step 3:

```java
stack.push(arr[i]);
```

👉 Push current element for future use

---

## 🔹 8. Time & Space Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(n)       |

👉 Each element is pushed & popped **only once**

---

## 🔹 9. Stack Behavior (Very Important)

👉 Stack always maintains:

➡️ **Increasing order (bottom → top)**

Example stack:

```
[2, 5, 8]
```

---

## 🔹 10. Why We Remove `>=` Elements?

👉 Because:

* We need **strictly smaller**
* Larger or equal elements are useless

---

## 🔹 11. Key Observations ⚡

* Traverse from **right to left**
* Stack stores **valid smaller candidates**
* Top of stack = **nearest smaller element**
* If empty → answer is **-1**

---

## 🔹 12. One-Line Summary

👉 **Use a stack and traverse from right to left, removing larger elements to find the next smaller element efficiently in O(n).**

---

## 🔹 13. Interview/Viva Points 🎯

* Type: **Monotonic Stack Problem**
* Direction matters (**right → left**)
* Similar problems:

  * Next Greater Element
  * Previous Smaller Element
  * Stock Span

---

If you want next step, I can give:
✅ Comparison: Next Greater vs Smaller (very important)
✅ Pattern recognition (how to identify stack problems instantly)
✅ Dry run table format for exams

Just tell 👍


*/
