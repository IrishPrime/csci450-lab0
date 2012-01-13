/**
 * @author:  Michael O'Neill <irish.dot@gmail.com>
 * @version: 2012.01.09
 *
 * A node for use in a linked list.
 */

public class Node {
	int key;
	int value;
	Node next;

	public Node(int k, int v, Node n) {
		this.key = k;
		this.value = v;
		this.next = n;
	}
}
