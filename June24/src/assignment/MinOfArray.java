package assignment;

public class MinOfArray {

	public static void main(String[] args) {
		System.out.println(String.format("Average of given array is %f: ",
				avgOfArray(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0,
						-22 })));
		System.out.println(String.format("Min of given array is %d: ",
				minofArray(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0,
						-22 })));
		System.out.println(upperToLower("lower 2 UPPER"));
	}

	// 1) Create a Java method
	//
	// static int min(int[] arrayOfInts)
	//
	// that outputs the minimum of an array of ints. Create a main method that
	// tests your
	// method on the following input array
	//
	// [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
	//
	// Test your method and make sure it works!
	static int minofArray(int[] arrayOfInts) {
		int min = 0;
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < min)
				min = arrayOfInts[i];
		}
		return min;
	}

	// 2) Do the same as above but instead of the minimum find the average of
	// the numbers in the array. Test it.

	static double avgOfArray(int[] arrayOfInts) {
		double avg = 0, sum = 0;
		for (int i = 0; i < arrayOfInts.length; i++) {
			sum += arrayOfInts[i];
		}
		avg = sum / arrayOfInts.length;
		return avg;
	}

	// 3) Write a program that reads a sentence and prints out the sentence with
	// all uppercase letters changed to lowercase and all lowercase letters
	// changed to uppercase.
	//
	// Hint : Look at the API documentation for the Character class to see which
	// methods
	// you can use.
	static String upperToLower(String input) {
		StringBuilder sb = new StringBuilder(input);
		for (int i = 0; i < input.length(); i++) {
			char toChange = input.charAt(i);
			if (toChange >= 'a' && toChange <= 'z') {
				sb.setCharAt(i, Character.toUpperCase(toChange));
			} else if (toChange >= 'A' && toChange <= 'Z') {
				sb.setCharAt(i, Character.toLowerCase(toChange));
			}
		}
		return sb.toString();
	}

}