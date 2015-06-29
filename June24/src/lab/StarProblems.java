package lab;

import java.util.Scanner;

public class StarProblems {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		MidStar(n);
	}

	public static void RightStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(String.format("%s", " "));
				}
			}
			System.out.println();
		}
	}

	public static void LeftStar(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n; j++) {
				if (j == n || i == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(String.format("%s", " "));
				}
			}
			System.out.println();
		}
	}

	public static void MidStar(int n) {
		int noOfRows = n / 2 + 1;
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == noOfRows - i || j == noOfRows + i || i == noOfRows - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
