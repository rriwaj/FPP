package q1;

public class MyQueue {
	private int front;
	private int back;
	private Object[] queue;
	private final int CAPACITY = 3;

	public MyQueue() {
		front = -1;
		back = -1;
		queue = new Object[CAPACITY];
	}

	public boolean insert(Object data) {
		back++;
		// insert at last
		if (isEmpty()) { // if empty list
			front = 0;
		} else if (back > queue.length - 1) {
			resize();
		}
		queue[back] = data;
		return true;
	}

	public Object remove() {
		Object data;
		if (isEmpty()) {
			throw new RuntimeException("Empty Queue");
		} else {
			data = queue[front];
			System.arraycopy(queue, front + 1, queue, front, size() - 1); // shift
																			// all
																			// elements
																			// to
																			// one
																			// position
																			// ahead
			queue[back] = null; // set last element to null as all
								// elements are shifted one position
								// ahead
			back--;
		}
		if (back == -1)
			front = -1;
		return data;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public int size() {
		return back + 1;
	}

	public Object peek() {
		if (front != -1)
			return queue[front];
		else
			return null;
	}

	public String displayAll() {
		StringBuilder sb = new StringBuilder();
		for (Object o : queue) {
			if (o == null) {
				break;
			}
			sb.append(" " + o + " ");
		}
		return sb.toString();
	}

	private void resize() {
		Object[] newQueue = new Object[size() * 2];
		System.arraycopy(queue, 0, newQueue, 0, size() - 1);
		queue = newQueue;
	}
}
