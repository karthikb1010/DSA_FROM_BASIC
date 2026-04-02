package _6_LinkedList;

public class _4_D_Merge_Two_Sorted_Lists {
	
	static Node mergeList(Node list1 , Node list2) {
		
		Node dummy = new Node(0);
		Node tail = dummy;
		
		while(list1 != null  && list2 != null) {
			if(list1.data <= list2.data) {
				tail.next = list1;
				list1 = list1.next;
			}
			else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		
		if(list1 != null) {
			tail.next = list1;
		}
		if (list2 != null) {
            tail.next = list2;
        }
		return dummy.next;
	}
	
	
static void printList(Node head) {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		Node list1 = new Node(1);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		
		Node list2 = new Node(2);
		list2.next = new Node(4);
		list2.next.next = new Node(6);
		
		
		System.out.println("List 1 ");
		printList(list1);
		
		
		System.out.println("List 2 ");
		printList(list2);
		
		Node merge = mergeList(list1 , list2);
		
		System.out.println("Merged List");
		printList(merge);

	}

}

/*

🔹 Problem Understanding
You are given two sorted singly linked lists
Each list is sorted in ascending order

👉 Goal:
Merge them into one sorted linked list

🔹 Key Idea (Core Logic)

👉 Compare nodes from both lists and always pick the smaller one

Build a new list step-by-step
Maintain sorted order
🔹 Role of Dummy Node

👉 A dummy node is used to simplify logic

Acts as starting point of merged list
Avoids handling special case for head

✔ Final answer = dummy.next

🔹 Step-by-Step Logic
1. Initialize
Create dummy node
Use tail pointer to build result
2. Traverse both lists

While both lists are not null:

Compare list1.data and list2.data
Attach smaller node to tail.next
Move that list forward
Move tail forward
3. Attach remaining nodes

After loop:

Only one list may have elements left

👉 Directly attach remaining part:

No need to compare further (already sorted)
4. Return result
Return dummy.next
🔹 Visual Understanding

Before:

List1: 1 → 3 → 5  
List2: 2 → 4 → 6

After:

Merged: 1 → 2 → 3 → 4 → 5 → 6
🔹 Important Points

✔ Always move tail forward after attaching node
✔ Only compare while both lists are non-null
✔ Remaining list can be attached directly
✔ No new nodes are created → reuse existing nodes

🔹 Time Complexity
O(N + M)
👉 N = length of list1, M = length of list2
🔹 Space Complexity
O(1)
👉 No extra space (in-place merge)
🔹 Type of Approach
Iterative
Two-pointer technique

*/
