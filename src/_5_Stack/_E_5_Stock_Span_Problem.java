package _5_Stack;

/*

🔴 5️⃣ Stock Span Problem 🔴

We follow the structure:

1️⃣ Concept
2️⃣ What the problem is asking
3️⃣ Why normal method is slow
4️⃣ Stack idea
5️⃣ Dry run example
6️⃣ Code
7️⃣ Full code flow
8️⃣ Practice Question

1️⃣ Concept (What is Stock Span?)

Stock span means:

👉 How many consecutive previous days (including today) the stock price was less than or equal to today's price.

In simple words:

For each day, count how many days back the price was ≤ today's price.

2️⃣ Example

Prices:

[100, 80, 60, 70, 60, 75, 85]

We calculate span for each day.

Day 1 → Price = 100

No previous day.

Span = 1
Day 2 → Price = 80

Check previous:

100 ≤ 80 ? ❌ No
Span = 1
Day 3 → Price = 60

Check previous:

80 ≤ 60 ? ❌ No
Span = 1
Day 4 → Price = 70

Check backwards:

60 ≤ 70 ✅
80 ≤ 70 ❌
Span = 2
Day 5 → Price = 60

Check previous:

70 ≤ 60 ❌
Span = 1
Day 6 → Price = 75

Check backwards:

60 ≤ 75 ✅
70 ≤ 75 ✅
60 ≤ 75 ✅
80 ≤ 75 ❌
Span = 4
Day 7 → Price = 85

Check backwards:

75 ≤ 85 ✅
60 ≤ 85 ✅
70 ≤ 85 ✅
60 ≤ 85 ✅
80 ≤ 85 ✅
100 ≤ 85 ❌
Span = 6
Final Span
[1, 1, 1, 2, 1, 4, 6]
3️⃣ Why Brute Force Is Slow

Brute force approach:

For each day → scan left side.

Example:

10 20 30 40 50

Each element compares with many previous elements.

Worst case:

O(n²)

This becomes slow for large inputs.

4️⃣ Stack Idea

We use a stack to store indices of prices.

The stack maintains decreasing order of prices.

Rule:

While stack top price ≤ current price, remove it.

Because it cannot block the span anymore.

Key Formula

If stack becomes empty:

span = i + 1

Else:

span = i - stack.peek()

Then push current index into stack.

5️⃣ Dry Run

Prices:

[100, 80, 60, 70, 60, 75, 85]
Day 0 → 100

Stack empty.

Span = 1

Push index 0

Stack:

[0]
Day 1 → 80

Check stack top:

100 ≤ 80 ? ❌

Span:

1 - 0 = 1

Push index 1

Stack:

[0, 1]
Day 2 → 60

Check stack top:

80 ≤ 60 ❌

Span:

2 - 1 = 1

Push index 2

Stack:

[0, 1, 2]
Day 3 → 70

Check stack:

60 ≤ 70 → remove

Stack becomes:

[0, 1]

Check again:

80 ≤ 70 ❌

Span:

3 - 1 = 2

Push index 3

Stack:

[0, 1, 3]
Day 4 → 60

Check stack:

70 ≤ 60 ❌

Span:

4 - 3 = 1

Push index 4

Stack:

[0, 1, 3, 4]
Day 5 → 75

Check stack:

60 ≤ 75 → remove
70 ≤ 75 → remove

Stack becomes:

[0, 1]

Check again:

80 ≤ 75 ❌

Span:

5 - 1 = 4

Push index 5

Stack:

[0, 1, 5]
Day 6 → 85

Check stack:

75 ≤ 85 → remove
80 ≤ 85 → remove

Stack becomes:

[0]

Check again:

100 ≤ 85 ❌

Span:

6 - 0 = 6

Push index 6

Stack:

[0, 6]



7️⃣ Important Line
price[stack.peek()]

The stack stores indices, not values.

So we use the index to access the price.

Example:

stack.peek() = 3
price[3] = 70
🎯 Final Output
1 1 1 2 1 4 6
🧠 Practice Question

If prices are:

[10, 20, 30, 40]

Find the span array.

Solution:

Day 1 → 10

Span = 1

Day 2 → 20

10 ≤ 20 → span = 2

Day 3 → 30

20 ≤ 30
10 ≤ 30
span = 3

Day 4 → 40

30 ≤ 40
20 ≤ 40
10 ≤ 40
span = 4

Final Span:

[1, 2, 3, 4]

*/

import java.util.Stack;

public class _E_5_Stock_Span_Problem {
	public static void main(String[] args) {
		
		int[] price = {100,80,60,70,60,75,85};
		int n = price.length;
		
		int[] span = new int[n];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0;i< n ;i++) {
			
			while(!stack.isEmpty() && price[stack.peek()] <= price[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				span[i] = i +1; 
			}else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
	  for(int x : span) {
		  System.out.print(x + " ");
	  }
	}

}


/*

🔴 Stock Span Problem — Quick Revision Notes
1️⃣ Core Idea

👉 For each day, find how many consecutive previous days (including today)
have stock price ≤ current day price

2️⃣ What You Actually Calculate

For every index i:

👉 Count how far you can go left until you find a greater price

3️⃣ Key Observation

We are looking for:

👉 Nearest Greater Element to the Left (NGL)

Span depends on:

👉 Distance between current index and that greater element

4️⃣ Why Brute Force is Bad
For each element → check all previous elements
Worst case:

👉 Increasing array → compare with all previous

⏱ Time Complexity: O(n²)

5️⃣ Stack Optimization (Main Idea)

We use a stack to store indices of elements.

🔥 Stack Property

👉 Stack maintains decreasing order of prices

6️⃣ Important Rule

While:

👉 Top element price ≤ current price
👉 Remove it (pop)

❓ Why?

Because:

👉 That element cannot block span anymore
👉 Current price dominates it

7️⃣ Span Formula (VERY IMPORTANT)

After popping:

Case 1: Stack is Empty

👉 No greater element on left
👉 Span = i + 1

Case 2: Stack NOT Empty

👉 Top is nearest greater element

👉 Span = i - stack.peek()

8️⃣ Why Store Indices (Not Values)?

Because:

👉 We need distance (i - index)

If we store values → cannot calculate span properly

9️⃣ Pattern Recognition (Interview Important)

Stock Span belongs to:

👉 Monotonic Stack Problems

Similar problems:

Next Greater Element
Previous Greater Element
Histogram Largest Rectangle
Daily Temperatures
🔟 Time Complexity

👉 Each element is:

Pushed once
Popped once

⏱ Total = O(n)

1️⃣1️⃣ Space Complexity

👉 Stack stores indices

📦 Space = O(n) (worst case)

1️⃣2️⃣ Intuition in One Line

👉 "Remove all smaller elements on left,
then measure distance to the first greater element."

1️⃣3️⃣ Edge Cases
Strictly increasing → span grows (1,2,3,4...)
Strictly decreasing → span always 1
All equal → span keeps increasing

*/
