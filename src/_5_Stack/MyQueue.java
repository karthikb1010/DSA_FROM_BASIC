package _5_Stack;

/*

🔴 2️⃣ IMPLEMENT STACK USING QUEUE 🔴

We follow structure:

1️⃣ Concept
2️⃣ Idea
3️⃣ Visual
4️⃣ Example Flow
5️⃣ Code
6️⃣ Code Execution Flow
7️⃣ Important Points

1️⃣ Concept

Stack → LIFO
Queue → FIFO

We must make FIFO behave like LIFO.

We use:

One Queue

2️⃣ Core Idea

When pushing:

Add element to queue.

Rotate queue (size - 1 times).

This brings new element to front.

So queue front behaves like stack top.

3️⃣ Visual Understanding

Initially:

Queue = []
push(10)
add(10)
Queue = [10]
push(20)
add(20)
Queue = [10, 20]

Rotate 1 time:

remove(10) → add(10)
Queue = [20, 10]

Now 20 is at front.

push(30)
add(30)
Queue = [20, 10, 30]

Rotate 2 times:

remove(20) → add(20)
Queue = [10, 30, 20]

remove(10) → add(10)
Queue = [30, 20, 10]

Now 30 is at front.

Correct stack behavior.

4️⃣ Why Rotate size - 1 Times?

After adding new element:

[a, b, c, new]

Rotate 3 times:

[new, a, b, c]

If rotated 4 times:

[a, b, c, new]

Back to original ❌

So rotate:

q.size() - 1
5️⃣ Code
import java.util.LinkedList;
import java.util.Queue;

public class MyStackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {

        q.add(x);

        for(int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }

    public int pop() {
        if(q.isEmpty()){
            return -1;
        }
        return q.remove();
    }

    public int peek() {
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }
}
6️⃣ Execution Flow
push(5)
push(7)
push(9)
pop()
peek()
push(5)
q = [5]
push(7)
q = [5, 7]
rotate once
q = [7, 5]
push(9)
q = [7, 5, 9]
rotate twice
q = [9, 7, 5]
pop()
remove front → 9
q = [7, 5]
peek()
7
🔥 Important Concepts

✔ Convert FIFO to LIFO
✔ Rotate size - 1 times
✔ New element moves to front

Time Complexity:

Push → O(n)
Pop  → O(1)
Peek → O(1)

| Feature        | Stack using Array | Stack using Queue |
| -------------- | ----------------- | ----------------- |
| Push           | O(1)              | O(n)              |
| Pop            | O(1)              | O(1)              |
| Implementation | Simple            | Trick-based       |
| Space          | O(n)              | O(n)              |



*/

public class MyQueue {

}
