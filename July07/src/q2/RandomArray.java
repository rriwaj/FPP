package q2;

public class RandomArray {

	int[] arr;
	int size;
	final static int ARRAY_SIZE = 3;

	public RandomArray() {
		arr = new int[ARRAY_SIZE];
		size = 0;
	}

	// add item to last of list
	public boolean add(int item) {
		// if (size == 0)
		// arr[size++] = item;
		if (size == arr.length) {
			resize();
			arr[size++] = item;
		} else {
			arr[size++] = item;
		}

		return true;
	}

	{
		// // using shift operation
		// public void removeDuplicates() {
		// for (int j = 0; j < size; j++) {
		// int toCompare = arr[j];
		// for (int i = j + 1; i < size; i++) {
		// if (arr[i] == toCompare) {
		// // shift all elements one position before
		// int nextPos = i + 1;
		// while (nextPos <= size) {
		// arr[nextPos - 1] = arr[nextPos];
		// nextPos++;
		// }
		// size--;
		// }
		// }
		// }
		// }
	}

	// remove duplicate items from list
	public void removeDuplicates() {
		// using array copy operation
		// replace using recursion
		for (int j = 0; j < size; j++) {
			int toCompare = arr[j];
			for (int i = j + 1; i < size; i++) {
				if (arr[i] == toCompare) {
					// copy all elements after duplicate
					System.arraycopy(arr, i + 1, arr, i, size - i);
					size--;
				}
			}
		}
	}

	public void removeAll() {
		for (int i = 0; i < size; i++) {
			arr[i] = 0;
		}
		size = 0;
	}

	public int[] getItems() {
		int[] items = new int[size];
		System.arraycopy(arr, 0, items, 0, size);
		return items;
	}

	public int getLength() {
		return size;
	}

	public int getItem(int index) {
		if (index > size)
			return -1;
		else
			return arr[index];
	}

	public int[] getSublist(int start, int end) {
		int[] items = new int[end - start];
		System.arraycopy(arr, start, items, 0, end - start);
		return items;
	}

	private void resize() {
		int[] newArr = new int[arr.length * 2];
		System.arraycopy(arr, 0, newArr, 0, size);
		arr = newArr;
	}

	public void sort(SortOrder order) {

		// replace by recursion
		boolean isSorted = false;
		int swapCount;
		int temp;
		while (!isSorted) {
			swapCount = 0;
			for (int i = 0; i + 1 < size; i++) {
				switch (order) {
				case ASC:
					if (arr[i + 1] < arr[i]) {
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						swapCount++;
					}
					break;
				case DESC:
					if (arr[i + 1] > arr[i]) {
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						swapCount++;
					}
					break;
				}

			}
			if (swapCount == 0) {
				isSorted = true;
			}
		}

	}
}