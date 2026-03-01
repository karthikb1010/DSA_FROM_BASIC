package _4_Two_Pointers_AND_Sliding_Window_Patterns;

/*
🔴 FIRST NEGATIVE NUMBER IN EVERY WINDOW OF SIZE K 🔴
📌 Problem (very simple words)

Given:

arr = [12, -1, -7, 8, -15, 30, 16, 28]
k = 3

For every window of size 3, print the first negative number.

🧠 First understand manually (NO CODE)

Array with indices:

Index:  0    1    2   3    4    5   6   7
Value: 12   -1   -7   8  -15   30  16  28

k = 3

🔹 Window 1 → indices (0,1,2)
[12, -1, -7]

First negative = -1

🔹 Window 2 → indices (1,2,3)
[-1, -7, 8]

First negative = -1

🔹 Window 3 → indices (2,3,4)
[-7, 8, -15]

First negative = -7

🔹 Window 4 → indices (3,4,5)
[8, -15, 30]

First negative = -15

🔹 Window 5 → indices (4,5,6)
[-15, 30, 16]

First negative = -15

🔹 Window 6 → indices (5,6,7)
[30, 16, 28]

No negative → print 0

🎯 Final Output:
-1  -1  -7  -15  -15  0
🧠 Now think about difficulty

In previous problem (max sum),
we only tracked a number.

Here we must track:

👉 First negative element inside window.

🔴 Important Question

When window moves:

Example:

From:

[12, -1, -7]

To:

[-1, -7, 8]

Which negative stays useful?

👉 -1 (because it is still inside window)

But when window moves further:

From:

[-1, -7, 8]

To:

[-7, 8, -15]

-1 leaves window.

So we must remove it.

🧠 So what do we need?

We need a structure that:

✔ Stores negative numbers
✔ Removes them when they leave window
✔ Gives first negative quickly

That structure is:

👉 Queue



🧠 Now here is the real thinking part

We don’t care about ALL numbers.

We only care about:

👉 Negative numbers
👉 And especially the FIRST negative

🔴 Why Queue is perfect here?

A queue:

• Stores elements in order
• First element = oldest element
• Can remove from front
• Can add at back

That is exactly what window needs.

🧠 How we will think logically

As window moves:

1️⃣ When we see a negative number → add it to queue
2️⃣ When window moves → check:

If leaving element equals queue front

Then remove from queue
3️⃣ First negative = queue front

🔥 Example Walkthrough Conceptually

Window 1:

[12, -1, -7]

Queue =

[-1, -7]

First negative = -1

Window moves →

Leaving = 12
12 is not negative → nothing removed

Queue still:

[-1, -7]

First negative = -1

Window moves →

Leaving = -1
Now -1 is queue front

So remove it.

Queue becomes:

[-7]

Correct first negative now = -7

🎯 That is the entire sliding logic for this problem.


*/
import java.util.*;
public class _J_10_FirstNegativeInWindow {
	    public static void main(String[] args) {

	        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
	        int k = 3;

	        Queue<Integer> queue = new LinkedList<>();

	        // Step 1: Process first window
	        for(int i = 0; i < k; i++){
	            if(arr[i] < 0){
	                queue.add(arr[i]);
	            }
	        }

	        // Print result for first window
	        if(queue.isEmpty()){
	            System.out.print("0 ");
	        } else {
	            System.out.print(queue.peek() + " ");
	        }

	        // Step 2: Slide the window
	        for(int i = k; i < arr.length; i++){

	            // Remove element leaving window
	            if(!queue.isEmpty() && arr[i - k] == queue.peek()){
	                queue.poll();
	            }

	            // Add new element entering window
	            if(arr[i] < 0){
	                queue.add(arr[i]);
	            }

	            // Print result for current window
	            if(queue.isEmpty()){
	                System.out.print("0 ");
	            } else {
	                System.out.print(queue.peek() + " ");
	            }
	        }
	    }
	}


