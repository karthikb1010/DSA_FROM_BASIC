package _5_Stack;

/*


🔴 1️⃣ IMPLEMENT STACK USING ARRAY 🔴

We follow structure:

1️⃣ Concept

We implement our own stack.

We will NOT use Java’s Stack class.

We use:

An array

A variable called top

Stack follows:

👉 LIFO (Last In First Out)

2️⃣ How Stack Works Internally
int[] stack = new int[5];

Initially:

stack = [ ?, ?, ?, ?, ? ]
top = -1

Why top = -1?

Because:

No elements in stack yet.

Array indexing starts from 0.

So valid indices:

0, 1, 2, 3, 4

For array size n:

Last valid index = n - 1
3️⃣ Push Operation

When we do:

push(10)

We:

top++
stack[top] = 10

Now:

stack = [10, ?, ?, ?, ?]
top = 0

Why increment first?

Because initially top = -1.
After increment → top = 0 (first valid index).

4️⃣ Pop Operation

When we pop:

value = stack[top]
top--

We do NOT delete element.

We just move top down.

Stack considers only elements from 0 to top.

5️⃣ Visual Example (Capacity = 3)

Initially:

stack = [_, _, _]
top = -1
push(5)
top = 0
stack = [5, _, _]
push(7)
top = 1
stack = [5, 7, _]
push(9)
top = 2
stack = [5, 7, 9]

Now stack is FULL.

Because:

top == capacity - 1
2 == 2
pop()

Returns 9.

top = 1
stack logically = [5, 7]
6️⃣ Code
public class MyStack {

    int[] arr;
    int top;
    int capacity;

    MyStack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
}
7️⃣ Execution Flow
MyStack stack = new MyStack(3);

Initial:

arr = [_, _, _]
top = -1
push(10)
top = 0
arr[0] = 10
push(20)
top = 1
arr[1] = 20
push(30)
top = 2
arr[2] = 30
push(40)
top == capacity - 1
2 == 2 → TRUE
Stack Overflow
🔥 Important Concepts

✔ Array index starts from 0
✔ Last index = capacity - 1
✔ Overflow → top == capacity - 1
✔ Underflow → top == -1

Time Complexity:

Push → O(1)
Pop  → O(1)
Peek → O(1)
 
 */

public class _A_1_MyStack {

	public static void main(String[] args) {


	}

}
