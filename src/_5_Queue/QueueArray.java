package _5_Queue;

/*

Sure 👍 Karthik. I’ll repeat the **same explanation clearly again**.

---

# 🔴 11️⃣ Implement Queue using Array 🔴

We will follow the same structure:

1️⃣ Concept
2️⃣ Queue operations
3️⃣ Code
4️⃣ Example flow

---

# 1️⃣ Concept

Queue follows:

**FIFO**

**First In First Out**

Example:

```
enqueue(10)
enqueue(20)
enqueue(30)
```

Queue becomes:

```
10 20 30
```

If we remove:

```
dequeue()
```

First element leaves:

```
20 30
```

Just like a **line in a ticket counter** 🎫

The person who comes first leaves first.

---

# 2️⃣ Variables Used

We use three things:

**1️⃣ array →** to store elements
**2️⃣ front →** index of first element
**3️⃣ rear →** index of last element

Initial state:

```
front = 0
rear = -1
```

Array:

```
[ _  _  _  _  _ ]
```

---

# 3️⃣ Code

```java
public class QueueArray {

    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){

        if(rear == arr.length - 1){
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        arr[rear] = x;
    }

    void dequeue(){

        if(front > rear){
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + arr[front]);
        front++;
    }

    void display(){

        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
```

---

# 4️⃣ Example Execution Flow

## Initial state

```
front = 0
rear = -1
```

Array:

```
[ _ _ _ _ _ ]
```

---

# enqueue(10)

```
rear++
rear = 0
```

Insert:

```
arr[0] = 10
```

Array:

```
[10 _ _ _ _]
```

Queue:

```
10
```

---

# enqueue(20)

```
rear++
rear = 1
```

Insert:

```
arr[1] = 20
```

Array:

```
[10 20 _ _ _]
```

Queue:

```
10 20
```

---

# enqueue(30)

```
rear++
rear = 2
```

Insert:

```
arr[2] = 30
```

Array:

```
[10 20 30 _ _]
```

Queue:

```
10 20 30
```

---

# display()

Loop runs:

```
i = front → rear
0 → 2
```

Prints:

```
10 20 30
```

---

# dequeue()

Remove first element:

```
arr[front] = 10
```

Print:

```
Removed: 10
```

Move front:

```
front = 1
```

Queue now:

```
20 30
```

---

# display()

Loop:

```
i = 1 → 2
```

Print:

```
20 30
```

---

# Final Array State

Array still contains:

```
[10 20 30 _ _]
```

But logically queue is:

```
20 30
```

Because:

```
front = 1
rear = 2
```

---

# Important Insight ⚠️

Even though **10 still exists in the array**, the queue ignores it because:

```
front moved forward
```

Queue always considers elements from:

```
front → rear
```

---

# Quick Check

Operations:

```
enqueue(10)
enqueue(20)
enqueue(30)
dequeue()
dequeue()
```

Step by step:

After enqueue:

```
10 20 30
```

After first dequeue:

```
20 30
```

After second dequeue:

```
30
```

✅ **Final Queue:**

```
30
```

---

If you want, next I can also explain **the biggest problem of this queue implementation** (very important for exams and interviews):

🔴 **Why normal Queue using Array wastes space and why Circular Queue is needed.**


*/

public class QueueArray {

}
