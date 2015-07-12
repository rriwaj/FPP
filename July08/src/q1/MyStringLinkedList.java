package q1;

// Doubly linked list
public class MyStringLinkedList {
	Node header;
	int size;

	MyStringLinkedList() {
		header = null;
		size = 0;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
		size++;
	}

	public void addLast(String item) {
		if (isEmpty()) { // if empty add new node set next and prev to null
			header = new Node(null, item, null);
		} else {
			Node current = header;
			Node newNode;
			while (current.next != null) { // travel to new node
				current = current.next;
			}
			newNode = new Node(current, item, null); // set prev of new node to
														// current node
			current.next = newNode;
			current = newNode;
		}
		size++;
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		Node newNode;
		// find node to add after
		if (n == null) // list is empty
			header = new Node(null, value, null);
		else if (n.next == null) { // n is last node
			addLast(value);
			return;
		} else {
			newNode = new Node(n, value, n.next);
			n.next.previous = newNode;
			n.next = newNode;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
			return;
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}
		size++;
	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}
		}
		size--;
	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	private class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();//
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		System.out.println("First element of list is: " + mySL.getFirst()
				+ "\n");
		System.out.println("Last element of list is: " + mySL.getLast() + "\n");

		mySL.removeFirst();
		System.out.println("After removing first element");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.removeLast();
		System.out.println("After removing last element");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println("Size of list is: " + mySL.size() + "\n");
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
	}

	public Object getFirst() {
		if (header == null) {
			throw new RuntimeException("Empty Linked List");
		} else {
			return header;
		}
	}

	public Object getLast() {
		if (header == null) {
			throw new RuntimeException("Empty Linked List");
		} else {
			Node node = header;
			while (node.next != null) {
				node = node.next;
			}
			return node;
		}
	}

	public void removeFirst() {
		if (header == null) {
			throw new RuntimeException("Empty Linked List");
		} else {
			header.next.previous = null;
			header = header.next;
			size--;
		}
	}

	public void removeLast() {
		if (header == null) {
			throw new RuntimeException("Empty Linked List");
		} else {
			Node node = header;
			while (node.next != null) {
				node = node.next;
			}
			node.previous.next = null;
			size--;
		}
	}
}
