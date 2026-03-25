package _5_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

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
