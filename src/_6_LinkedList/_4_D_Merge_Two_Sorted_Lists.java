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
