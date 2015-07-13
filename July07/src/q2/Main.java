package q2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		RandomArray arr = new RandomArray();
		arr.add((int) getRandomNo(0, 33));
		arr.add((int) getRandomNo(0, 33));
		arr.add((int) getRandomNo(0, 10));
		arr.add((int) getRandomNo(0, 12));
		arr.add((int) getRandomNo(0, 9));
		arr.add((int) getRandomNo(0, 5));
		arr.add((int) getRandomNo(25, 39));
		arr.add((int) getRandomNo(0, 44));
		arr.add((int) getRandomNo(30, 33));

		System.out.println("Original Array size: " + arr.getLength());
		for (int i : arr.getItems()) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");
		// remove duplicate values
		arr.removeDuplicates();
		System.out
				.println("After removing duplicates size: " + arr.getLength());
		for (int i : arr.getItems()) {
			System.out.printf("%d ", i);

		}
		// get item at specified index
		System.out.println("\n");
		System.out.printf("Item at index %d is %d", 3, arr.getItem(3));

		System.out.println();
		// generating sublist of array
		System.out.println("Sublist of array from index 0 to 3 is");
		for (int i : arr.getSublist(0, 3)) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");

		// sort array in descending order
		arr.sort(SortOrder.DESC);
		System.out.println("Sorting in descending order: ");
		for (int i : arr.getItems()) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");

		// sort array in ascending order
		arr.sort(SortOrder.ASC);
		System.out.println("Sorting in ascending order: ");
		for (int i : arr.getItems()) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");

		// remove all items from array
		arr.removeAll();
		System.out.println("After removing all size of array is: "
				+ arr.getLength());
		for (int i : arr.getItems()) {
			System.out.printf("%d ", i);
		}

	}

	public static int getRandomNo(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1);
	}
}
// OUTPUT
// ============================================
// Original Array size: 9
// 6 4 0 1 1 2 14 34 1
//
// After removing duplicates size: 7
// 6 4 0 1 2 14 34
//
// Item at index 3 is 1
//
// Sublist of array from index 0 to 3 is
// 6 4 0
//
// Sorting in descending order:
// 34 14 6 4 2 1 0
//
// Sorting in ascending order:
// 0 1 2 4 6 14 34
//
// After removing all size of array is: 0