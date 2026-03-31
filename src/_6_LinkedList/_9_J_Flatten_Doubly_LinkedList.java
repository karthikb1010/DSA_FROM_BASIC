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
