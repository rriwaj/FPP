package practice;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {		
		SLinkList slist = new SLinkList();
		System.out.println(slist.toString());
		System.out.println("Size of Linked list is: " + slist.getSize());
		slist.insert("D"); // insert at last
		System.out.println("\nAfter inserting D at last");
		System.out.println(slist.toString());

		slist.insertAtFirst("A"); // insert at first
		System.out.println("\nAfter inserting A at first");
		System.out.println(slist.toString());

		slist.insert("B", 1); // insert at specified position
		System.out.println("\nAfter inserting B at index 1");
		System.out.println(slist.toString());

		slist.insert("C", 2);
		System.out.println("\nAfter inserting B at index 2");
		System.out.println(slist.toString());

		slist.insert(3, 1);
		System.out.println("\nAfter inserting 3 at index 1");
		System.out.println(slist.toString());

		slist.insert(65, 2);
		System.out.println("\nAfter inserting 65 at index 2");
		System.out.println(slist.toString());

		slist.insertAtFirst(13);
		System.out.println("\nAfter inserting 13 at first");
		System.out.println(slist.toString());

		slist.insert(27);
		System.out.println("\nAfter inserting 27 at last");
		System.out.println(slist.toString());

		// removing
		slist.removeAtFirst();
		System.out.println("\nAfter removing 13 from first");
		System.out.println(slist.toString());

		slist.removeAtLast();
		System.out.println("\nAfter removing 27 from last");
		System.out.println(slist.toString());

		slist.remove(2);
		System.out.println("\nAfter removing 65 from 2 index");
		System.out.println(slist.toString());

		slist.remove(new Integer(3));
		System.out.println("\nAfter removing 3 from list");
		System.out.println(slist.toString());

		// get data at 3 index
		Object data = slist.getData(5);
		System.out.println("\nData at index 3: " + data);
	}
}