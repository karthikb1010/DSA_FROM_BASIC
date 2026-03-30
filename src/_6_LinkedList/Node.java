package _6_LinkedList;

// here instead of writing same class in every problem we write once in package and it automatically understands it no import it required
//common for all linked list files
class Node{
	
	int data;
	Node next;
	Node random;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}