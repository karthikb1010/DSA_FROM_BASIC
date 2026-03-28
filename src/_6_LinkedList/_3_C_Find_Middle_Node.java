package _6_LinkedList;
 

/*

1️⃣ Problem

Given the head of a singly linked list, return the middle node.

Example:

1 → 2 → 3 → 4 → 5 → null

Output:

3

2️⃣ Key Idea (Slow–Fast Pointer Technique)

Use two pointers:

| Pointer | Movement      |
| ------- | ------------- |
| slow    | moves 1 step  |
| fast    | moves 2 steps |

When fast reaches the end, slow will be at the middle.

4️⃣ When loop ends

slow is at middle node

Return:

slow

6️⃣ Even Length Case

1 → 2 → 3 → 4

| Step  | slow | fast |
| ----- | ---- | ---- |
| Start | 1    | 1    |
| 1     | 2    | 3    |
| 2     | 3    | null |

Result = 3

This algorithm returns second middle node.

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |

9️⃣ Where This Pattern Is Used

Slow–Fast pointer technique is used in:

1️⃣ Detect Cycle in Linked List
2️⃣ Find Middle Node
3️⃣ Find Start of Cycle
4️⃣ Check Palindrome Linked List
5️⃣ Remove Nth Node From End

This is one of the most important Linked List patterns.

*/


public class _3_C_Find_Middle_Node {
	
	
	static Node middleNode(Node head) {
		
		Node slow= head;
		Node fast = head;

		while(fast!= null && fast.next != null) {
		
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow;
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
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
	//	Node n6 = new Node(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
	//	n5.next = n6;
		
		Node head = n1;
		 
		System.out.println("Original List");
		printList(head);
		
		Node middle = middleNode(head);
		System.out.println( "Middle Node is : " + middle.data );
		

		
	}

}
