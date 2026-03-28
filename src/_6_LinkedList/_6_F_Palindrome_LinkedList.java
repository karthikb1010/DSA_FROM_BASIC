package _6_LinkedList;

public class _6_F_Palindrome_LinkedList {

	static boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node prev = null;
		Node curr = slow;

		while (curr != null) {

			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		Node first = head;
		Node second = prev;

		while (second != null) {
			if (first.data != second.data) {
				return false;
			}
			first = first.next;
			second = second.next;
		}
		return true;

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

		// not  a palindrome list
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;


		//palindrome list
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Node head = n1;
		
		//for even list
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(2);
//		Node n4 = new Node(1);
//
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//
//		Node head = n1;

		System.out.println("Original List ");
		printList(head);
		
		System.out.println("Is palindrome or not : " + 	isPalindrome(head));
	

	}

}

/*

🧠 Palindrome Linked List — Quick Revision
🔑 Core Idea

👉 Convert problem into:
“Compare first half with reversed second half”

⚙️ Steps (Remember this order)
1️⃣ Find middle
Use slow & fast pointer
slow → 1 step
fast → 2 steps

👉 slow reaches middle

2️⃣ Reverse second half
Start from slow
Reverse till end
3️⃣ Compare both halves
first → head
second → reversed half

👉 Compare node by node

If mismatch → ❌ false
If all match → ✅ true
4️⃣ (Optional but important)

👉 Reverse again to restore list

🧠 Key Observations

✔ Only compare half list
✔ Odd case → middle auto handled
✔ Even case → perfectly split

⚠️ Edge Cases

✔ Empty list → true
✔ Single node → true

⏱ Complexity
Time → O(n)
Space → O(1)
🔥 One-Line Memory Trick

👉
“Middle → Reverse → Compare → (Restore)”

🧩 Pattern Used
Slow–Fast pointer
Linked List Reversal
🎯 When to use this pattern

👉 Whenever problem says:

palindrome
symmetry
compare from both ends

*/





