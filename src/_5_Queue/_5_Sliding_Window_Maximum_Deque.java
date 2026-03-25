package _5_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
/*

1️⃣ Problem

Given an array and window size k, find the maximum element in every window.

Example:

arr = [4,2,12,3,8]
k = 2

Windows:

[4 2] → max = 4
[2 12] → max = 12
[12 3] → max = 12
[3 8] → max = 8

Output:

4 12 12 8


3️⃣ Optimized Idea (Deque)

We use a Deque to store indexes of useful elements.

Deque rules:

1️⃣ Remove indexes outside window
2️⃣ Remove smaller elements from back
3️⃣ Front of deque always has maximum

*/




public class _5_Sliding_Window_Maximum_Deque {

	public static void main(String[] args) {
		int[] arr = {4,2,12,3,8};
        int k = 2;

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++){

            if(!dq.isEmpty() && dq.peekFirst() == i-k)
                dq.pollFirst();

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offerLast(i);

            if(i >= k-1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }
}
