package _6_LinkedList;


class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class _1_A_Reverse_List {
	
	
	static Node reverse(Node head) {
		
		Node prev = null;
		Node curr = head;

		while(curr!= null) {
			Node next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		return prev;
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
		
		System.out.println("Original List");
		printList(head);

		head = reverse(head);
		
		System.out.println("Reversed List");
		printList(head);

		
	}

}
