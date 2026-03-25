package _5_Queue;	
import java.util.*;

/*

LRU Cache (Least Recently Used Cache)

Definition:
LRU Cache is a cache replacement algorithm that removes the least recently used item when the cache becomes full and a new item needs to be inserted.

Key Idea

The element that has not been used for the longest time is removed first.

Example:

Cache size = 3

Access order:
1, 2, 3 → cache full

Access 1 → recently used
Add 4 → remove 2 (least recently used)

Final cache:

1, 3, 4


Operations in LRU Cache
1. get(key)
Returns the value of the key if it exists.
Moves the key to most recently used position.
2. put(key, value)
Inserts or updates a value.
If cache is full → remove least recently used item.
Data Structures Used

To achieve O(1) time complexity, LRU cache uses:

Hash Map
Stores key → node reference
Enables fast lookup
Doubly Linked List
Maintains order of usage
Head → Most recently used
Tail → Least recently used

Time Complexity
Operation	Complexity
get()	O(1)
put()	O(1)

*/


/*



LRU Cache (HashMap + Doubly Linked List with Dummy Nodes)
import java.util.*;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int k, int v){
        key = k;
        value = v;
    }
}

class LRUCache {

    int capacity;
    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    LRUCache(int cap){

        capacity = cap;
        map = new HashMap<>();

        head = new Node(0,0); // dummy head
        tail = new Node(0,0); // dummy tail

        head.next = tail;
        tail.prev = head;
    }

    // remove node from list
    void removeNode(Node node){

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // insert node before tail (most recent)
    void addNode(Node node){

        node.prev = tail.prev;
        node.next = tail;

        tail.prev.next = node;
        tail.prev = node;
    }

    int get(int key){

        if(!map.containsKey(key))
            return -1;

        Node node = map.get(key);

        removeNode(node);
        addNode(node);

        return node.value;
    }

    void put(int key, int value){

        if(map.containsKey(key)){

            Node node = map.get(key);
            removeNode(node);
        }

        Node node = new Node(key,value);

        addNode(node);
        map.put(key,node);

        if(map.size() > capacity){

            Node lru = head.next;

            removeNode(lru);
            map.remove(lru.key);
        }
    }
}


and below is a code with above
*/

public class _4_LRU_Cache {

	class Node {
	    int key;
	    int value;
	    Node prev;
	    Node next;

	    Node(int key, int value) {
	        this.key = key;
	        this.value = value;
	        prev = null;
	        next = null;
	    }
	}

	class LRUCache {

	    int capacity;
	    HashMap<Integer, Node> map = new HashMap<>();

	    Node head = null;
	    Node tail = null;

	    LRUCache(int cap){
	        capacity = cap;
	    }

	    void remove(Node node){

	        if(node.prev != null)
	            node.prev.next = node.next;
	        else
	            head = node.next;

	        if(node.next != null)
	            node.next.prev = node.prev;
	        else
	            tail = node.prev;
	    }

	    void insert(Node node){

	        node.next = null;
	        node.prev = tail;

	        if(tail != null)
	            tail.next = node;

	        tail = node;

	        if(head == null)
	            head = node;
	    }

	    int get(int key){

	        if(!map.containsKey(key))
	            return -1;

	        Node node = map.get(key);

	        remove(node);
	        insert(node);

	        return node.value;
	    }

	    void put(int key, int value){

	        if(map.containsKey(key)){
	            remove(map.get(key));
	        }

	        Node node = new Node(key,value);

	        insert(node);
	        map.put(key,node);

	        if(map.size() > capacity){

	            map.remove(head.key);
	            remove(head);
	        }
	    }
	}	
}
