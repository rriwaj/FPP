package q1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Marketing> arr = new ArrayList<Marketing>();
		// add objects to marketing
		arr.add(new Marketing("a", "1 Product", 200));
		arr.add(new Marketing("b", "2 Product", 500));
		arr.add(new Marketing("Michael Clark", "5 Product", 1500));
		arr.add(new Marketing("Arnold Shaw", "4 Product", 3500));
		// remove objects
		arr.remove(1);
		arr.set(0, new Marketing("Don Bradman", "3 Product", 600));
		// Sort by employeeName
		Collections.sort(arr, new CompareByName());
		System.out.println("Sorted list by Employee name");
		for (Marketing m : arr) {
			System.out.println(m.toString());
		}

		// Sort by sales amount
		System.out.println("\nSorted list by Sales amount");
		Collections.sort(arr, new CompareByAmount());

		for (Marketing m : arr) {
			System.out.println(m.toString());
		}
	}
}

// OUTPUT
// ==============================================================
// Sorted list by Employee name
// Employee Name: "Arnold Shaw" Product Name: "4 Product", Sales Amount:
// "3500.00"
// Employee Name: "Don Bradman" Product Name: "3 Product", Sales Amount:
// "600.00"
// Employee Name: "Michael Clark" Product Name: "5 Product", Sales Amount:
// "1500.00"
//
// Sorted list by Sales amount
// Employee Name: "Don Bradman" Product Name: "3 Product", Sales Amount:
// "600.00"
// Employee Name: "Michael Clark" Product Name: "5 Product", Sales Amount:
// "1500.00"
// Employee Name: "Arnold Shaw" Product Name: "4 Product", Sales Amount:
// "3500.00"
