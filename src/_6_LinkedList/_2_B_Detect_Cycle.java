package _6_LinkedList;

/*

Floyd’s Cycle Detection Algorithm (Tortoise & Hare)
1️⃣ Purpose

Used to detect whether a linked list contains a cycle (loop).

1 → 2 → 3 → 4
      ↑     ↓
      ← ← ←
Node 4 points back to 2, so the list never ends.

2️⃣ Idea of the Algorithm

Use two pointers:

| Pointer | Speed         |
| ------- | ------------- |
| slow    | moves 1 step  |
| fast    | moves 2 steps |


If there is no cycle

fast reaches null

If there is a cycle

fast and slow will eventually meet


3️⃣ Algorithm Steps
Initialize two pointers
slow = head
fast = head

Traverse the list
while(fast != null && fast.next != null)

Move pointers
slow = slow.next
fast = fast.next.next

Check if they meet
if(slow == fast)
    cycle exists

If loop ends
no cycle


Just like a faster runner catching a slower runner on a circular track.

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |


8️⃣ Where This Algorithm Is Used
Detect cycle in linked list
Find start of cycle
Find length of cycle
Used in LeetCode problem 142
Used in memory leak detection concepts

*/

public class _2_B_Detect_Cycle {
	
	
	static boolean detectCycle(Node head) {
		
		Node slow= head;
		Node fast = head;

		while(fast!= null && fast.next != null) {
		
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
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
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		Node head = n1; 
		
		
	//	printList(head);
		
		n4.next = n2;
		
	//	printList(head);   if we remove comment it will go infinite cycle
 		
		boolean hasCycle = detectCycle(head);
		
		 System.out.println("Cycle present: " + hasCycle);

		
	}

}
