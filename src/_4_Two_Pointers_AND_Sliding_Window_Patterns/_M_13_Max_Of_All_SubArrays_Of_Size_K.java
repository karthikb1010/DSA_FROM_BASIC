package _4_Two_Pointers_AND_Sliding_Window_Patterns;
/*
 🔥 Problem: Maximum of All Subarrays of Size K
Input:
arr = {1, 3, -1, -3, 5, 3, 6, 7}
k = 3

We need the maximum element in every window of size 3.

Windows:
[1  3  -1] → 3
[3 -1 -3] → 3
[-1 -3 5] → 5
[-3 5  3] → 5
[5  3  6] → 6
[3  6  7] → 7
Output:
3 3 5 5 6 7
 
 
 */

import java.util.*;

public class _M_13_Max_Of_All_SubArrays_Of_Size_K {

		    public static void main(String[] args) {

		        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		        int k = 3;

		        Deque<Integer> dq = new LinkedList<>();

		        for(int i = 0; i < arr.length; i++){

		            // Remove elements outside window
		            if(!dq.isEmpty() && dq.peek() == i - k){
		                dq.poll();
		            }

		            // Remove smaller elements from back
		            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
		                dq.pollLast();
		            }

		            dq.offer(i);

		            // Print result after first window
		            if(i >= k - 1){
		                System.out.print(arr[dq.peek()] + " ");
		            }
		        }
		    }
		}


