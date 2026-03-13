package _5_Queue;

/*

Circular Queue using Array (Java) — Notes
1️⃣ Concept

A Circular Queue is a queue in which the last position is connected to the first position.

This avoids the wastage of space that happens in a normal queue.

Queue follows:

FIFO (First In First Out)

Example:

enqueue(10)
enqueue(20)
enqueue(30)

Queue → 10 20 30

When we remove:

dequeue()
10 removed
2️⃣ Data Members
Array
int[] arr = new int[5];

Array used to store queue elements

Size = 5

Front Pointer
int front = -1;

Points to first element of queue

-1 means queue is empty

Rear Pointer
int rear = -1;

Points to last element of queue

Initial state:

front = -1
rear  = -1
Queue empty
3️⃣ Enqueue Operation

Used to insert an element into queue.

Step 1 — Check Queue Full
(rear + 1) % arr.length == front

If true:

Queue Full

This condition is used because the queue is circular.

Step 2 — First Element Case
if(front == -1)
front = 0

When first element is inserted, front is set to 0.

Step 3 — Move Rear
rear = (rear + 1) % arr.length

Moves rear circularly.

Example:

4 + 1 % 5 = 0

Rear moves back to start.

Step 4 — Insert Element
arr[rear] = x

Element is stored at rear index.

4️⃣ Dequeue Operation

Used to remove an element from queue.

Step 1 — Check Queue Empty
if(front == -1)

If true:

Queue Empty
Step 2 — Print Removed Element
Removed: arr[front]

Front element is removed.

Step 3 — Single Element Case
if(front == rear)
front = rear = -1

Meaning:

Queue had only one element

After removing it:

Queue becomes empty

So both pointers reset.

Step 4 — Move Front
front = (front + 1) % arr.length

Moves front circularly.

5️⃣ Display Operation

Used to print queue elements.

Steps:

Start from front

Print elements

Move circularly

Stop when rear is reached

Loop condition:

while(true)

Stop when:

i == rear
6️⃣ Example Flow from Main Method

Operations:

enqueue(10)
enqueue(20)
enqueue(30)
enqueue(40)

Queue:

10 20 30 40

After:

dequeue()
dequeue()

Queue becomes:

30 40

Then:

enqueue(50)
enqueue(60)

Because of circular movement:

Queue becomes:

30 40 50 60
7️⃣ Advantages of Circular Queue

Efficient use of memory

No space wastage

Faster operations

Used in CPU scheduling and buffering

✅ Short Exam Definition

A Circular Queue is a queue in which the last position is connected back to the first position,
 allowing efficient use of array space by performing insertion and deletion in a circular manner.
 
 overall summary

*/


public class _3_CircularQueue {

    int[] arr = new int[5];
    int front = -1;
    int rear = -1;

    void enqueue(int x){

        if((rear + 1) % arr.length == front){
            System.out.println("Queue Full");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = x;
    }

    void dequeue(){

        if(front == -1){
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Removed: " + arr[front]);

        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1) % arr.length;
        }
    }

    void display(){

        int i = front;

        while(true){
            System.out.print(arr[i] + " ");

            if(i == rear) break;

            i = (i + 1) % arr.length;
        }

        System.out.println();
    }

    public static void main(String[] args){

    	_3_CircularQueue q = new _3_CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(50);
        q.enqueue(60);

        q.display();
    }
}
