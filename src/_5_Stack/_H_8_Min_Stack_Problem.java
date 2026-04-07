package _5_Stack;

import java.util.*;

class _H_8_Min_Stack_Problem {

	     Stack<Integer> stack = new Stack<>();
	     Stack<Integer> minStack = new Stack<>();

	     public void push(int x){

	         stack.push(x);

	         if(minStack.isEmpty() || x <= minStack.peek()){
	             minStack.push(x);
	         }
	     }

	     public void pop(){

	         int removed = stack.pop();

	         if(removed == minStack.peek()){
	             minStack.pop();
	         }
	     }

	     public int top(){
	         return stack.peek();
	     }

	     public int getMin(){
	         return minStack.peek();
	     }
	 }





/*

1️⃣ Problem

We need a stack that supports:

push(x)
pop()
top()
getMin()

Example:

push(5)
push(3)
push(7)

Stack:

5
3
7

Now:

getMin() → 3

Minimum element in the stack.

2️⃣ Why Normal Stack Fails

Normal stack only gives:

push
pop
peek

To find minimum normally we would scan entire stack:

O(n)

But question requires:

getMin() → O(1)

Constant time.

3️⃣ Core Idea

Use two stacks.

Stack 1

Normal stack → stores all values.

Stack 2

Min stack → stores minimum values.

Rule

When pushing element:

if minStack empty OR x <= minStack.peek()
    push x to minStack

When popping element:

if popped value == minStack.peek()
    pop from minStack

So minStack always holds current minimum.

4️⃣ Example

Operations:

push(5)
push(3)
push(7)
push(2)

push(5)

Main stack:

[5]

Min stack:

[5]

push(3)

3 ≤ 5

Main stack:

[5,3]

Min stack:

[5,3]

Minimum = 3

push(7)

7 ≤ 3 ❌

Main stack:

[5,3,7]

Min stack:

[5,3]

Minimum still 3

push(2)

2 ≤ 3

Main stack:

[5,3,7,2]

Min stack:

[5,3,2]

Minimum = 2

5️⃣ Code
import java.util.*;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x){

        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop(){

        int removed = stack.pop();

        if(removed == minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
6️⃣ Code Flow Example

Operations:

push(5)
push(3)
push(7)
getMin()

Stacks:

Main stack

[5,3,7]

Min stack

[5,3]

Now:

getMin() → minStack.peek()

Answer:

3

Key Insight

Min stack always stores the history of minimum values.

So current minimum is always on top.

Time complexity:

push → O(1)
pop → O(1)
getMin → O(1)

*/

