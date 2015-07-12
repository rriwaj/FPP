package practice;

public class SLinkList {
	ListNode head;
	int size;

	public SLinkList() {
		this.head = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	// insert at first
	public void insertAtFirst(Object data) {
		head = new ListNode(data, head);
		size++;
	}

	// insert at last
	public void insert(Object data) {
		// check if list is empty
		if (isEmpty()) {
			insertAtFirst(data);
			return;
		}
		// travel to last node
		ListNode current = head;
		while (current.getNext() != null) { // while condition breaks when next
											// points to null i.e. when last
											// node is found
			current = current.getNext();
		}
		current.setNext(new ListNode(data));
		size++;
	}

	// insert at ith index
	public boolean insert(Object data, int index) {
		// if list is empty
		if (isEmpty() || index == 0)
			insertAtFirst(data);
		else {
			// travel to that index
			ListNode current = head;
			for (int i = 0; i < size; i++) {
				if (i == index - 1) {
					current.setNext(new ListNode(data, current.getNext()));
					size++;
					break;
				} else {
					current = current.getNext();
				}
			}
		}

		return true;
	}

	// remove at first
	public Object removeAtFirst() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		ListNode removed = head;
		head = head.getNext();
		size--;
		return removed.getData();
	}

	// remove at last
	public Object removeAtLast() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		ListNode current = head;
		ListNode prev = null; // we set previous nodes next to null
		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		size--;
		return current.getData();
	}

	// remove at specified index
	public void remove(int index) {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		if (index == 0)
			removeAtFirst();
		else if (index == size)
			removeAtLast();
		else {
			ListNode prev = head;
			// find node at current index
			for (int i = 0; i < size; i++) {
				if (i == index - 1) { // one node before node to be deleted
					prev.setNext(prev.getNext().getNext());
					size--;
					break;
				} else {
					prev = prev.getNext();
				}
			}
		}
	}

	// remove data
	public void remove(Object data) {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		}
		if (head.getData().equals(data))
			removeAtFirst();
		ListNode prev = null;
		ListNode current = head;
		while (current != null && !current.getData().equals(data)) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(current.getNext());
		size--;
	}

	// get data at specified index
	public Object getData(int index) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Index out of bound");
		}
		ListNode current = head;
		for (int i = 0; i < size; i++) {
			if (i == index) {
				break;
			} else {
				current = current.getNext();
			}
		}
		return current.getData();
	}

	// get size
	public int getSize() {
		return size;
	}

	// print linkedlist
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (size == 0) {
			sb.append("Empty Linked List");
			return sb.toString();
		}

		ListNode current = head;
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
		return size == 0;
	}

}
