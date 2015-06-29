package lab.four.one;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	// instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved!!
	// 5. Correct the implementation of getHireDay() in Employee, as discussed
	// in the lecture. (Use a GregorianCalendar object to hold the data.)
	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public double yearlyFederalTax() {
		double tax = 0.0;
		if (salary > 80000) {
			tax = 0.28 * salary;
		} else if (salary > 50000 && salary <= 80000) {
			tax = 0.24 * salary;
		} else if (salary > 26000 && salary <= 50000) {
			tax = 0.2 * salary;
		}
		return tax;
	}
}
