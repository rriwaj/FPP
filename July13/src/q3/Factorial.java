package q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		try {
			int input = sc.nextInt();
			sc.close();
			System.out.println("Factorial of number is: " + fact(input));
		} catch (InputMismatchException ex) {
			System.out.println("Exception occurred:- " + ex.toString());
		}
	}

	public static int fact(int num) throws IllegalArgumentException {
		if (num < 0 || num > 50) {
			throw new IllegalArgumentException("Number not in range");
		}
		if (num == 1) {
			return 1;
		}
		return num * fact(num - 1);
	}
}
// OUTPUT
// ==========================================================
// Enter number to find factorial
// 53
// Exception in thread "main" java.lang.IllegalArgumentException: Number not in
// range
// at q3.Factorial.fact(Factorial.java:20)
// at q3.Factorial.main(Factorial.java:12)
// =====================================================================
// Enter number to find factorial
// -33
// Exception in thread "main" java.lang.IllegalArgumentException: Number not in
// range
// at q3.Factorial.fact(Factorial.java:20)
// at q3.Factorial.main(Factorial.java:12)
// =====================================================================
// Enter number to find factorial
// 4
// Factorial of number is: 24
