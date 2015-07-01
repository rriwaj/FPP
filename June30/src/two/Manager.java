package two;

public class Manager implements Employee {
	private double numberOfHoursPerMonth;
	private double numberOfYears;
	private double extraHours;
	private String managerName;
	private String address;
	private int employeeId;

	public Manager(String managerName, String address, int employeeId,
			double numberOfHoursPerMonth, double numberOfYears) {
		this.managerName = managerName;
		this.address = address;
		this.employeeId = employeeId;
		this.numberOfHoursPerMonth = numberOfHoursPerMonth;
		this.numberOfYears = numberOfYears;
	}

	public String getEmployeeDetails() {
		return String
				.format("Employee Id: %d\nManager Name: %s\nAddress: %s\nNumber of years of work: %.1f\nHours per month: %.2f",
						employeeId, managerName, address, numberOfYears,
						numberOfHoursPerMonth);
	}

	public double calculateSalary() {
		double monthlySalary = BASE_SALARY * 2 * numberOfHoursPerMonth;
		if (numberOfHoursPerMonth > 150) {
			extraHours = numberOfHoursPerMonth - 150;
			monthlySalary += extraHours * EXTRA_HOURS_BONUS;
		}
		return monthlySalary;
	}

}
