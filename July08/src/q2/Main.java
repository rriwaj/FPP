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
// OUTPUT
// ==========================================================
// Empty Linked List
// Size of Linked list is: 0
//
// After adding D at last
// D
//
// After adding A at first
// A => D
//
// After adding B at index 1
// A => B => D
//
// After adding C at index 2
// A => B => C => D
//
// After adding 3 at index 1
// A => 3 => B => C => D
//
// After adding 65 at index 2
// A => 3 => 65 => B => C => D
//
// After adding 13 at first
// 13 => A => 3 => 65 => B => C => D
//
// After adding 27 at last
// 13 => A => 3 => 65 => B => C => D => 27
//
// After removing 13 from first
// A => 3 => 65 => B => C => D => 27
//
// After removing 27 from last
// A => 3 => 65 => B => C => D
//
// After removing 65 from 2 index
// A => 3 => B => C => D
//
// After removing 3 from list
// A => B => C => D
//
// Data at index 3: D

