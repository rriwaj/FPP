package q2;

public class MyLinkedList {
	Node head;
	int listCount;

	public MyLinkedList() {
		this.head = null;
		this.listCount = 0;
	}

	public int listCount() {
		return this.listCount;
	}

	// add at first
	public void addAtFirst(Object data) {
		head = new Node(data, head);
		listCount++;
	}

	// add at last
	public void add(Object data) {
		// check if list is empty
		if (isEmpty()) {
			addAtFirst(data);
			return;
		}
		// travel to last node
		Node current = head;
		while (current.getNext() != null) { // while condition breaks when next
											// points to null i.e. when last
											// node is found
			current = current.getNext();
		}
		current.setNext(new Node(data));
		listCount++;
	}

	// add at ith index
	public boolean add(Object data, int index) {
		// if list is empty
		if (isEmpty() || index == 0)
			addAtFirst(data);
		else {
			// travel to that index
			Node current = head;
			for (int i = 0; i < listCount; i++) {
				if (i == index - 1) {
					current.setNext(new Node(data, current.getNext()));
					listCount++;
					break;
				} else {
					current = current.getNext();
				}
			}
		}

		return true;
	}

	// remove at first
	public Object removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		Node removed = head;
		head = head.getNext();
		listCount--;
		return removed.getData();
	}

	// remove at last
	public Object removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		Node current = head;
		Node prev = null; // we set previous nodes next to null
		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		listCount--;
		return current.getData();
	}

	// remove at specified index
	public Object remove(int index) {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		Object data = null;
		if (index == 0)
			data = removeFirst();
		else if (index == listCount)
			data = removeLast();
		else {
			Node prev = head;

			// find node at current index
			for (int i = 0; i < listCount; i++) {
				if (i == index - 1) { // one node before node to be deleted
					prev.setNext(prev.getNext().getNext());
					data = prev.getNext().getData();
					listCount--;
					break;
				} else {
					prev = prev.getNext();
				}
			}
		}
		return data;
	}

	// remove data
	public boolean remove(Object data) {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		if (head.getData().equals(data))
			removeFirst();
		Node prev = null;
		Node current = head;
		while (current != null && !current.getData().equals(data)) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(current.getNext());
		listCount--;
		return true;
	}

	// get data at specified index
	public Object get(int index) {
		if (index < 0 || index > listCount) {
			throw new RuntimeException("Index out of bound");
		}
		Node current = head;
		for (int i = 0; i < listCount; i++) {
			if (i == index) {
				break;
			} else {
				current = current.getNext();
			}
		}
		return current.getData();
	}

	// get listCount
	public int size() {
		return listCount;
	}

	// print linkedlist
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (listCount == 0) {
			sb.append("Empty Linked List");
			return sb.toString();
		}

		Node current = head;
		while (current.getNext() != null) {
			sb.append(current.getData());
			sb.append(" => ");
			current = current.getNext();
		}
		if (current.getNext() == null)
			sb.append(current.getData());
		return sb.toString();
	}

	// check if null
	public boolean isEmpty() {
		return listCount == 0;
	}

	private class Node {

		private Object data;
		private Node next;

		Node(Object data, Node node) {
			this.data = data;
			this.next = node;
		}

		Node(Object data) {
			this(data, null); // calling default constructor
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

}
