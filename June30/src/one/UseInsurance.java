package one;

import java.util.*;

public class UseInsurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chose type of Insurance: \n1.Health \n2.Life");
		int input = sc.nextInt();
		sc.close();
		switch (input) {
		case 1:
			createHealthInsurance();
			break;
		case 2:
			createLifeInsurance();
			break;
		}
	}

	private static void createHealthInsurance() {
		Health h = new Health("Health");
		h.setCost();
		System.out.println(h.display());
	}

	private static void createLifeInsurance() {
		Life lf = new Life("Life");
		lf.setCost();
		System.out.println(lf.display());

	}
}
// OUTPUT
// =============================================
// Chose type of Insurance:
// 1.Health
// 2.Life
// 1
// You chose Health Insurance
// Monthly Fee: 196.00

