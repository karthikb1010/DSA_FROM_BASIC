package _6_LinkedList;

public class _7_G_Detect_And_Remove_Loop {
	
	
	static void removeLoop(Node head) {
		
		if(head == null || head.next == null) return;
		
		Node slow = head;
		Node fast = head;
		
		//detect cycle
		boolean hasCycle = false;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				hasCycle = true;
		        break;
			}
		}
		if(!hasCycle) {
			return;
		}
		
		//find loop start
		slow = head;
		
		while(slow != fast) {
			slow = slow.next;
			fast= fast.next;
		}
		
		//now slow = fast = start of loop
		//find loop start
		Node temp = slow;
		
		while(temp.next != slow) {
			temp = temp.next;
		}
		
		// break loop
		temp.next = null;
		
	}
	
	static void printList(Node head) {

		Node temp = head;

		while (temp != null) {
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
		n5.next = n3;
		
		Node head = n1;
		
//		System.out.println("Original List ");
//		printList(head);
		
		removeLoop(head);
		
		System.out.println("After removing loop ");
        printList(head);
		
	}

}



/*

🎯 What is a Loop?

A loop means:
👉 A node points back to a previous node instead of null

1 → 2 → 3 → 4 → 5
          ↑     ↓
          ← ← ← ←
🔍 Step 1: Detect Loop
Idea:
Use two pointers:
Slow → moves 1 step
Fast → moves 2 steps
Result:
If loop exists → fast catches slow
If no loop → fast reaches null
🎯 Key Insight

👉 In a loop, fast will lap slow and meet it.

🎯 Step 2: Find Start of Loop
Trick:
Move slow back to head
Keep fast at meeting point
Move both one step at a time
Result:

👉 They meet at start of loop

🧠 Important Logic
Distance from head to loop start
=
Distance from meeting point to loop start

👉 That’s why they meet exactly there

🔗 Step 3: Find Last Node of Loop
Idea:
Start from loop start
Traverse until a node points back to start

👉 That node is last node of loop

✂️ Step 4: Remove Loop
Action:
Break connection from last node

👉 Now list ends at null

🔁 Full Flow Summary
Detect → Find start → Find last → Break

*/
 