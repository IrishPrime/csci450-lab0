/**
 * @author:  Michael O'Neill <irish.dot@gmail.com>
 * @version: 2012.01.09
 *
 * An implementation of a linked list.
 */

public class LList {
	Node head;

	// Initialize new empty list
	public LList() {
		this.head = null;
	}

	// Add new node to the front of the list
	void prepend(int key, int val) {
		this.head = new Node(key, val, this.head);
	}

	// Iterate over the list using a loop, searching for the node which matches the key argument
	int search(int key) {
		for(Node n = this.head; n.next != null; n = n.next) {
			if(n.key == key) {
				return n.value;
			}
		}

		return -1;
	}

	// Recursively iterates over the list, searching for the node which matches the key argument
	int searchr(int key, Node cur) {
		if(cur == null) {
			return -1;
		}

		if(cur.key == key) {
			return cur.value;
		}

		return searchr(key, cur.next);
	}

	// A simple test
	public static void main(String[] args) {
		LList l = new LList();
		int v1, v2;

		l.prepend(4,16);
		l.prepend(3,9);
		l.prepend(2,4);
		l.prepend(1,1);

		v1 = l.search(3);
		v2 = l.searchr(2, l.head);

		System.out.println("Search result 1 is " + v1 + ", 2 is " + v2);
	}
}
