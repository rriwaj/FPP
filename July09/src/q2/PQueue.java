package q2;

public class PQueue {

	private Node first;

	public PQueue() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(int x) {
		Node newNode = new Node(x);
		Node previous = null;
		Node current = first;

		while (current != null && x > current.data) {
			previous = current;
			current = current.next;
		}

		if (previous == null) {
			newNode.next = first;
			first = newNode;
		}

		else {
			previous.next = newNode;
			newNode.next = current;
		}
	}

	public Node remove() {
		Node current = first;
		first = current.next;
		return current;
	}

	public String displayAll() {
		StringBuilder sb = new StringBuilder();
		Node current = first;
		while (current.next != null) {
			sb.append(current.data);
			sb.append(" => ");
			current = current.next;
		}
		if (current.next == null) {
			sb.append(current.data);
		}
		return sb.toString();
	}

	public int peek() {
		Node current = first;
		return current.data;
	}
}