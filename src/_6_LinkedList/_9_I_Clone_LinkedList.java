package _6_LinkedList;

import java.util.HashMap;

public class _9_I_Clone_LinkedList {
	
	static Node cloneList(Node head){

        if(head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;

        // Step 1: Create copy of each node
        while(curr != null){
            map.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        // Step 2: Assign next and random pointers
        curr = head;

        while(curr != null){

            Node copy = map.get(curr);

            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            curr = curr.next;
        }

        // Step 3: Return cloned head
        return map.get(head);
    }
	
	static void printList(Node head) {
	    Node temp = head;

	    while(temp != null) {
	        int randomData = (temp.random != null) ? temp.random.data : -1;
	        System.out.print(temp.data + "(" + randomData + ") -> ");
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

		    // 🔹 Set random pointers
		    n1.random = n3;
		    n2.random = n1;
		    n3.random = n4;
		    n4.random = n2;

		    Node head = n1;

		    System.out.println("Original List:");
		    printList(head);

		    // 🔹 Clone the list
		    Node clonedHead = cloneList(head);

		    System.out.println("Cloned List:");
		    printList(clonedHead);
		    
		    System.out.println(head == clonedHead); // false
		
		
	}

}


/*

📌 🔹 Problem Summary
Each node has:
data
next pointer
random pointer (can point anywhere or null)

👉 Goal: Create a deep copy of the list
✔ New nodes
✔ Same structure (next + random)
✔ No shared memory with original

📌 🔹 Core Idea

Use a HashMap to store mapping:

👉 original node → cloned node

This helps in:

Quickly finding cloned nodes
Handling random pointers easily
📌 🔹 Algorithm Steps
🔹 Step 1: Create Clone Nodes
Traverse original list
For each node:
Create a new node with same data
Store in map

👉 At this stage:

Nodes exist
No connections yet
🔹 Step 2: Assign Links

Traverse again:

For each original node:

Set next of clone using map
Set random of clone using map

👉 Key idea:

Use map to find corresponding cloned nodes
🔹 Step 3: Return Result
Return cloned version of head using map
📌 🔹 Important Concepts
🔸 1. Deep Copy
New nodes are created
No reference shared with original
🔸 2. Why HashMap?

Because:

Random pointer can point anywhere
We need fast lookup (O(1))
🔸 3. Handling Null
If next or random is null:
Map returns null
Safe, no error
🔸 4. Two Traversals
1st pass → create nodes
2nd pass → connect nodes
📌 🔹 Complexity
Time Complexity: O(n)
Space Complexity: O(n) (extra HashMap)

*/
 