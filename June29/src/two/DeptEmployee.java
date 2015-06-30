package two;

import java.util.Date;

public class DeptEmployee {
	String name;
	private double salary;
	Date hireDate;

	
	public DeptEmployee(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double computeSalary() {
		return salary;
	}
}