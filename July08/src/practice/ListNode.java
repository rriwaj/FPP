package practice;

//Single Linked List Example
public class ListNode {
	private Object data;
	private ListNode next;

	ListNode(Object data, ListNode node) {
		this.data = data;
		this.next = node;
	}

	ListNode(Object data) {
		this(data, null); // calling default constructor
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}	
}
