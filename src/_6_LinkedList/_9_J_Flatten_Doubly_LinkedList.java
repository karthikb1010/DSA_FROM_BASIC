package _6_LinkedList;

public class _9_J_Flatten_Doubly_LinkedList {
	
	static Node flattenList(Node head) {
		
		if(head == null ) return null;
		
		Node curr = head;
		
		while( curr != null) {
		
		if(curr.child == null) {
			curr = curr.next;			
			}
		else 
			{
			Node next =  curr.next;
			
			curr.next = curr.child;
			curr.child.prev = curr;
			
			Node temp = curr.child;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = next;
			
			if(next != null) {
				next.prev = temp;
			}
			curr.child = null;
			
			curr = curr.next;
				
			}
	
	}
		return head;
	}

	public static void main(String[] args) {
		

	}

}

/*

📘 Flatten Doubly Linked List (Revision Notes)
🔹 Problem Understanding
You are given a doubly linked list
Each node has:
next
prev
child (another doubly linked list)

👉 Goal:
Convert this into a single-level doubly linked list
(i.e., remove all child pointers and merge everything in order)

🔹 Key Idea (Core Logic)

👉 Traverse the list node by node

For each node:

If no child → move forward
If child exists:
Insert the child list between current node and next node
🔹 Step-by-Step Logic

When curr.child != null:

1. Save next node
Store curr.next in a variable (next)
Because we will modify links
2. Attach child list
Connect:
curr.next → curr.child
child.prev → curr

👉 Now child list becomes part of main list

3. Go to end of child list
Traverse child list to find last node
(using temp pointer)
4. Connect back to main list
Attach last node of child list to saved next
If next != null, update its prev
5. Remove child pointer
Set curr.child = null

👉 Important: problem requires removing child links

6. Move forward
Continue traversal from curr.next
🔹 Visual Understanding

Before:

1 ⇄ 2 ⇄ 3
      |
      4 ⇄ 5

After flatten:

1 ⇄ 2 ⇄ 4 ⇄ 5 ⇄ 3
🔹 Important Points

✔ Always save next node before modifying links
✔ Maintain both next and prev pointers correctly
✔ Remove child after merging
✔ Traverse child fully before reconnecting

🔹 Time Complexity
O(N)
👉 Each node is visited once
🔹 Space Complexity
O(1)
👉 No extra space used (in-place)
🔹 Type of Approach
Iterative
In-place pointer manipulation
🔹 Common Mistakes

❌ Forgetting to update prev pointers
❌ Losing reference to next node
❌ Not setting child = null
❌ Not traversing till end of child list

*/
