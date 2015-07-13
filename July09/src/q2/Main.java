package q2;

public class Main {

	public static void main(String[] args) {
		PQueue pq = new PQueue();
		pq.insert(19);
		System.out.println(pq.displayAll());
		pq.insert(33);
		System.out.println(pq.displayAll());
		pq.insert(1);
		System.out.println(pq.displayAll());
		pq.insert(3);
		System.out.println(pq.displayAll());
		System.out.println("Next item in queue is:" + pq.peek());
		pq.remove();
		System.out.println(pq.displayAll());
	}

}
