package one;

public class Main {
	public static void main(String[] args) {

		int[] a = new int[] { 12, 7, 9, 3, -1, -2, 333 };
		OuterClass outer = new OuterClass();
		outer.intArray = a;
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.calculate();
		System.out.println(inner.display());
	}
}

// ===================================
// OUTPUT
// Min of array is -2
// Max of array is 333
// Average of array is 51.00