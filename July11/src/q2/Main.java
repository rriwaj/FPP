package q2;

public class Main {
	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add("Computer");
		hashSet.add("Desktop");
		hashSet.add("Laptop");
		hashSet.add("Tablet");
		hashSet.add("Mobile");
		hashSet.add("Phablet");

		System.out.println("Size of hash set:" + hashSet.size());

		System.out.println("Keys of hash set are:");
		hashSet.show();
		System.out.println("Key removed from HashSet is: "
				+ hashSet.remove("Tablet"));
	
		System.out.println("Finding Tablet in key set");
		System.out.println("Keys of hash set are:");
		hashSet.show();
		System.out
				.println(hashSet.find("Tablet") ? "Key found"
						: "Key not found");
	}
}

// OUTPUT
// =====================================================
// Size of hash set:6
// Keys of hash set are:
// Desktop
// Laptop
// Mobile
// Tablet
// Computer
// Phablet
//
// Key removed from HashSet is: Tablet
// Finding Tablet in key set
// Keys of hash set are:
// Desktop
// Laptop
// Mobile
// Computer
// Phablet
//
// Key not found

