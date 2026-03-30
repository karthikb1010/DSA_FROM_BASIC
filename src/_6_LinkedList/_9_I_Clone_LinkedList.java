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
