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


/*

Got it 👍 you want **pure concept (no code)** for quick revision. Here’s the clean version 👇

---

# 🧠 Remove Nth Node From End — Concept Only

---

## 📌 Core Idea

We don’t count length separately.
Instead, we use **two pointers** to locate the node in **one pass**.

---

## 🔑 Main Concept (Two Pointer Gap)

👉 Maintain a gap of **n nodes** between two pointers:

* `fast` pointer goes ahead
* `slow` pointer follows

---

## ⚙️ How it Works

### 1️⃣ Start both at beginning (or dummy before head)

* Both `slow` and `fast` start at same position

---

### 2️⃣ Move fast pointer n steps ahead

👉 Now:

* Distance between `slow` and `fast` = **n nodes**

---

### 3️⃣ Move both together

* Move `slow` → 1 step
* Move `fast` → 1 step

👉 Keep moving until:

* `fast` reaches the **last node**

---

### 4️⃣ Key Observation

At this moment:

👉 `slow` is just **before the node to delete**

---

### 5️⃣ Remove node

👉 Skip the next node of `slow`

This effectively deletes the **Nth node from the end**

---

## 🎯 Why This Works

Because:

* `fast` started **n steps ahead**
* When `fast` reaches end
* `slow` is exactly at **(n+1)th node from end**

---

## ⚠️ Important Insight (Dummy Node)

👉 Needed when deleting the **first node (head)**

Example:

```
1 → 2 → 3, n = 3
```

* We must delete `1`
* Without extra node → difficult to handle
* With dummy → easy to remove head

---

## 🧠 Visualization (Quick)

```
Initial gap:

slow → dummy
fast → n steps ahead

Then:

slow → moves step by step
fast → reaches end

Final:

slow → just before target
```

---

## ⏱ Efficiency

* **Time:** O(n) → only one traversal
* **Space:** O(1) → no extra memory

---

## 🔥 One-Line Memory Trick

👉
**“Create gap of n → move together → slow reaches before target → delete next”**

---

## 🧩 Pattern Recognition

This is a classic **Slow–Fast Pointer pattern**

Used in:

* Find middle node
* Detect cycle
* Find cycle start
* Palindrome linked list
* Remove Nth node


*/

