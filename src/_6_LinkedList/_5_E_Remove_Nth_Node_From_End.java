package _6_LinkedList;

public class _5_E_Remove_Nth_Node_From_End {
	
	static Node removeNthNode(Node head, int n) {
		
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node slow = dummy;
		Node fast = dummy;
		
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
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
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node head = n1;
		
		System.out.println("Original List ");
		printList(head);
		

		
		Node removeNthNode = removeNthNode(head , 2);
		
		System.out.println("List without N th  Node");
		printList(removeNthNode);

	}

}
