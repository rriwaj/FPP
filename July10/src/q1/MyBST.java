package q1;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int size;

	public MyBST() {
		root = null;
		size = 0;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left); // L
			System.out.print(t.element + ","); // V
			printTree(t.right); // R
		}
	}

	private void printPreOrderTree(BinaryNode t) {
		if (t == null)
			t = root;
		else {
			System.out.print(t.element + ","); // V
			printTree(t.left); // L
			printTree(t.right); // R
		}
	}

	private void printPostOrderTree(BinaryNode t) {
		if (t == null)
			t = root;
		else {
			printTree(t.left); // L
			printTree(t.right); // R
			System.out.print(t.element + ","); // V
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);			
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}
				
			}
			size++;
		}
	}

	public boolean contains(int key) {
		Integer x = key;
		if (root == null) {
			return false;
		} else {
			BinaryNode n = root;
			Boolean found = false;
			while (!found)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left.element == key) {
						found = true;
					}
					// keep searching on left
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right.element == key) {
						found = true;
					}
					// keep searching on right
					else {
						n = n.right;
					}
				}
				// exact match
				else {
					found = true;
				}
			}
			return found;
		}
	}

	public BinaryNode getRoot() {
		return root;
	}

	public int leafNodes(BinaryNode t) {
		int leafCount = 0;
		if (t == null) {
			return 0;
		}
		if (t.left == null && t.right == null) {

			leafCount++;
		} else {
			return leafNodes(t.left) + leafNodes(t.right); // using recursion
															// find node whose
															// left and right
															// are null

		}
		return leafCount;

	}

	private BinaryNode minimum(BinaryNode t) {
		BinaryNode leftChild = t == null ? root : t;

		while (leftChild.left != null) {

			leftChild = leftChild.left;
		}
		return leftChild;
	}

	private BinaryNode maximum(BinaryNode t) {
		BinaryNode rightChild = t == null ? root : t;
		while (rightChild.right != null) {

			rightChild = rightChild.right;
		}
		return rightChild;
	}

	public int size() {
		return size;
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child

		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);
		mybst.printTree();
		System.out.println("\nMinimum value of tree is: "
				+ mybst.minimum(null).element);
		System.out.println("\nMaximum value of tree is: "
				+ mybst.maximum(null).element);
		System.out.println("Size of tree is: " + mybst.size());
		mybst.printPostOrderTree(null);

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
}
