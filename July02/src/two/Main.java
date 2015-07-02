package two;

public class Main {

	public static void main(String[] args) {
		EvenOddOriented ev = new EvenOddOriented();
		ev.arr = new int[] { 11, 17, 20, 30, 25 };
		System.out.println(ev.evenOddOriented());
	}
}


// ======================
// OUTPUT
// Sum of Even numbers: 50
// Sum of Odd numbers: 53
// Given array is Odd Oriented
