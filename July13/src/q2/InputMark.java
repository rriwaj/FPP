package q2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMark {
	public static void main(String[] args) {
		System.out.println("Please enter the marks");
		Scanner sc = new Scanner(System.in);
		try {
			int number = sc.nextInt();
			sc.close();
			if (number < 0 || number > 100) {
				throw new IOException(
						"Exception Occurred:- Input number not in range");
			}
			System.out.println("Valid Input");
		} catch (IOException ex) {
			System.out.println(ex.toString());
		} catch (InputMismatchException ex) {
			System.out.println("Exception Occurred:- " + ex.toString());
		}
	}
}
// OUTPUT 
// =============================================
// Please enter the marks
// 200
// java.io.IOException: Exception Occurred:- Input number not in range
//=======================================================================
// Please enter the marks
// SD
// Exception Occurred:- java.util.InputMismatchException
//===========================================
// Please enter the marks
// 80
// Valid Input
