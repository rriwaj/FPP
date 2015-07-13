package q1;

public class ArrayException {
	static int numer[] = new int[] { 4, 8, 16, 32, 64, 128, 256, 512 };
	static int denom[] = new int[] { 2, 6, 4, 5, 0, 8 };

	public static void main(String[] args) {
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.printf("%d / %d = %d \n", numer[i], denom[i],
						numer[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Exception occurred:- " + ex.toString());
			} catch (ArithmeticException ex) {
				System.out.println("Exception occurred:- " + ex.toString());
			}
		}
	}
}

// OUTPUT 
// ===========================================

// 4 / 2 = 2
// 8 / 6 = 1
// 16 / 4 = 4
// 32 / 5 = 6
// Exception occurred:- java.lang.ArithmeticException: / by zero
// 128 / 8 = 16
// Exception occurred:- java.lang.ArrayIndexOutOfBoundsException: 6
// Exception occurred:- java.lang.ArrayIndexOutOfBoundsException: 7
