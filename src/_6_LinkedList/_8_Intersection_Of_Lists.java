package _6_LinkedList;

public class _8_Intersection_Of_Lists {
	
	static Node intersection(Node head1 , Node head2) {
		
		Node p1 = head1;
		Node p2 = head2;
		
		while( p1 != p2) {
		if(p1 == null) {
			p1 = head2;
		}else {
			p1 = p1.next;
		}
		
		if(p2 == null) {
			p2 = head1;
		}else {
			p2 = p2.next;
		}
		}
		return p1;
	}

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		Node n6 = new Node(6);
		Node n7 = new Node(7);

		Node n8 = new Node(8);
		Node n9 = new Node(9);

		// List A
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n8;   // connect to intersection

		// List B
		n6.next = n7;
		n7.next = n8;   // connect to same intersection

		// Common part
		n8.next = n9;

		// Heads
		Node head1 = n1;
		Node head2 = n6;
		
		Node ans = intersection(head1, head2);

		if(ans != null){
		    System.out.println("Intersection at node: " + ans.data);
		}else{
		    System.out.println("No intersection");
		}

	}

}
/*

🧠 Problem

Given two linked lists, find the node where they intersect.

👉 Intersection means:

✔ Same node reference
❌ Not same value
🎯 Key Idea (Most Important)

👉 Make both pointers travel equal distance

p1 travels: A + B
p2 travels: B + A

👉 So they meet at intersection

⚙️ Algorithm (Step-by-step)

Initialize two pointers:

p1 = head1
p2 = head2
Traverse both lists:
If pointer reaches null, switch to other list

Stop when:

p1 == p2
Return:
Intersection node OR null

*/
