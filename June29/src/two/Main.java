package two;

import java.util.*;

public class Main {
	static GregorianCalendar cal;

	public static void main(String[] args) {
		cal = new GregorianCalendar(2015, 2, 22);
		Professor p1 = new Professor("Steve Jobs", 1000, cal.getTime());
		p1.setNumberOfPublications(10);

		cal = new GregorianCalendar(2014, 3, 24);
		Professor p2 = new Professor("Dwyane Johnson", 2000, cal.getTime());
		p2.setNumberOfPublications(10);

		cal = new GregorianCalendar(2013, 1, 13);
		Professor p3 = new Professor("Tom Hanks", 3000, cal.getTime());

		cal = new GregorianCalendar(2015, 3, 20);
		Secretary s1 = new Secretary("Apil Tiwari", 100, cal.getTime());
		s1.setOvertimeHours(200);

		cal = new GregorianCalendar(2013, 3, 20);
		Secretary s2 = new Secretary("Bibek Karki", 200, cal.getTime());
		s2.setOvertimeHours(200);

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;

		System.out.println("Print sum of all salaries in the department.");
		Scanner sc = new Scanner(System.in);
		char choice = sc.nextLine().charAt(0);
		sc.close();
		double totalSalary = 0;
		if (Character.toLowerCase(choice) == 'y') {
			for (DeptEmployee dept : department) {
				totalSalary += dept.computeSalary();
			}
			System.out.printf("Sum of all salaries in department = %.2f",
					totalSalary);
		}
	}
}
/*
 * OUTPUT ==================================================================
 * Print sum of all salaries in the department. y
 * Sum of all salaries in department = 11100.00
 */