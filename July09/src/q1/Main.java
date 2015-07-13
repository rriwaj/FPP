package q1;

public class Main {
	public static void main(String[] args) {
		MyQueue q1 = new MyQueue();
		q1.insert("A");
		q1.insert("B");
		q1.insert("C");

		System.out.println("Size of queue is: " + q1.size());

		System.out.println("Next item in queue is: " + q1.peek());
		System.out.println(q1.displayAll());

		q1.remove();
		System.out.println("Next item in queue is: " + q1.peek());
		System.out.println(q1.displayAll());

		q1.remove();
		System.out.println("Next item in queue is: " + q1.peek());
		System.out.println(q1.displayAll());

		q1.remove();
		System.out.println("Next item in queue is: " + q1.peek());
		System.out.println(q1.displayAll());
		q1.insert("D");
		q1.insert("E");
		System.out.println("Next item in queue is: " + q1.peek());
		System.out.println(q1.displayAll());
		
	}
}
