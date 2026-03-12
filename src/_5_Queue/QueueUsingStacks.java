package _5_Queue;

/*

Sure Karthik 👍
Here is the **same content again** clearly formatted so you can revise.

---

# 🔴 12️⃣ Implement Queue using Stacks 🔴

This is a **very common interview question** (especially for placements), so it's good you are learning it now.

We simulate **Queue (FIFO)** using **Stacks (LIFO)**.

---

# 1️⃣ Reminder

## Stack

**LIFO**
Last In First Out

Example:

```
push(10)
push(20)
push(30)
```

Stack:

```
10 20 30
```

Pop:

```
30 removed
```

---

## Queue

**FIFO**
First In First Out

Example:

```
enqueue(10)
enqueue(20)
enqueue(30)
```

Queue:

```
10 20 30
```

Dequeue:

```
10 removed
```

---

# 2️⃣ Problem

Stacks remove the **last element**,
but a queue must remove the **first element**.

So we need a **trick**.

---

# 3️⃣ Idea

Use **two stacks**.

```
stack1 → for insertion
stack2 → for deletion
```

---

# 4️⃣ Operations

## enqueue(x)

Simply push into **stack1**.

```
stack1.push(x)
```

---

## dequeue()

Steps:

1️⃣ Move all elements **stack1 → stack2**
2️⃣ Pop from **stack2**
3️⃣ Move elements **back to stack1**

Why?

Because **stack reverses order**.

---

# 5️⃣ Example

Operations:

```
enqueue(10)
enqueue(20)
enqueue(30)
dequeue()
```

---

## After enqueue

Stack1:

```
[10,20,30]
```

Stack2:

```
[]
```

---

## dequeue()

Move **stack1 → stack2**

```
stack2.push(30)
stack2.push(20)
stack2.push(10)
```

Stack2:

```
[30,20,10]
```

---

## Pop from stack2

```
10 removed
```

Correct because queue removes **first element**.

---

## Move back

Stack1:

```
[20,30]
```

---

# 6️⃣ Code

```java
import java.util.*;

public class QueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x){
        s1.push(x);
    }

    void dequeue(){

        if(s1.isEmpty()){
            System.out.println("Queue empty");
            return;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        System.out.println("Removed: " + s2.pop());

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args){

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
    }
}
```

---

# 7️⃣ Full Flow

Initial:

```
s1 = []
s2 = []
```

---

### enqueue(10)

```
s1 = [10]
```

---

### enqueue(20)

```
s1 = [10,20]
```

---

### enqueue(30)

```
s1 = [10,20,30]
```

---

### dequeue()

Move to **s2**

```
s1.pop → 30 → s2
s1.pop → 20 → s2
s1.pop → 10 → s2
```

Now:

```
s2 = [30,20,10]
```

Pop:

```
10 removed
```

Move back:

```
s1 = [20,30]
```

Queue now:

```
20 30
```

---

# ⭐ Important Idea

Stack **reverses order**.

So:

```
stack1 → stack2 → pop
```

gives **FIFO behaviour**.

---

# 🧠 Quick Check

After operations:


enqueue(5)
enqueue(10)
enqueue(15)
dequeue()
```

What will be removed?

✅ **Answer: 5**

Because queue always removes the **first inserted element**.

-


*/

public class QueueUsingStacks {

}
