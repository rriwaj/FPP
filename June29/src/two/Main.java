package two;

import java.util.*;

public class Main {
	static GregorianCalendar cal;

	public static void main(String[] args) {
		Professor p1 = new Professor(1000);
		cal = new GregorianCalendar(2015, 2, 22);
		p1.name = "Steve Jobs";
		p1.hireDate = cal.getTime();
		p1.setNumberOfPublications(10);

		Professor p2 = new Professor(2000);
		p2.name = "Dwyane Johnson";
		p2.setNumberOfPublications(10);
		cal = new GregorianCalendar(2014, 3, 24);
		p2.hireDate = cal.getTime();

		Professor p3 = new Professor(3000);
		p3.name = "Tom Hanks";
		p3.setNumberOfPublications(10);
		cal = new GregorianCalendar(2013, 1, 13);
		p3.hireDate = cal.getTime();

		Secretary s1 = new Secretary(100);
		s1.name = "Apil Tiwari";
		cal = new GregorianCalendar(2015, 3, 20);
		s1.hireDate = cal.getTime();
		s1.setOvertimeHours(200);

		Secretary s2 = new Secretary(200);
		s2.name = "Bibek Karki";
		cal = new GregorianCalendar(2013, 3, 20);
		s2.hireDate = cal.getTime();
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