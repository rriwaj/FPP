package q2;

public class Main {
	public static void main(String[] args) {
		MyLinkedList slist = new MyLinkedList();
		System.out.println(slist.toString());
		System.out.println("Size of Linked list is: " + slist.size());
		slist.add("D"); // add at last
		System.out.println("\nAfter adding D at last");
		System.out.println(slist.toString());

		slist.addAtFirst("A"); // add at first
		System.out.println("\nAfter adding A at first");
		System.out.println(slist.toString());

		slist.add("B", 1); // add at specified position
		System.out.println("\nAfter adding B at index 1");
		System.out.println(slist.toString());

		slist.add("C", 2);
		System.out.println("\nAfter adding C at index 2");
		System.out.println(slist.toString());

		slist.add(3, 1);
		System.out.println("\nAfter adding 3 at index 1");
		System.out.println(slist.toString());

		slist.add(65, 2);
		System.out.println("\nAfter adding 65 at index 2");
		System.out.println(slist.toString());

		slist.addAtFirst(13);
		System.out.println("\nAfter adding 13 at first");
		System.out.println(slist.toString());

		slist.add(27);
		System.out.println("\nAfter adding 27 at last");
		System.out.println(slist.toString());

		// removing
		slist.removeFirst();
		System.out.println("\nAfter removing 13 from first");
		System.out.println(slist.toString());

		slist.removeLast();
		System.out.println("\nAfter removing 27 from last");
		System.out.println(slist.toString());

		slist.remove(2);
		System.out.println("\nAfter removing 65 from 2 index");
		System.out.println(slist.toString());

		slist.remove(new Integer(3));
		System.out.println("\nAfter removing 3 from list");
		System.out.println(slist.toString());

		// get data at 3 index
		Object data = slist.get(3);
		System.out.println("\nData at index 3: " + data);
	}
}
