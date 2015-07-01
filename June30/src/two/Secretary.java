package two;

public class Secretary implements Employee {
	private double numberOfHoursPerMonth;
	private double numberOfYears;
	private String secretaryName;
	private String address;
	private int employeeId;
	private int managerId;

	public Secretary(String secretaryName, String address, int employeeId,
			int managerId, double numberOfHoursPerMonth, double numberOfYears) {
		this.secretaryName = secretaryName;
		this.address = address;
		this.employeeId = employeeId;
		this.managerId = managerId;
		this.numberOfHoursPerMonth = numberOfHoursPerMonth;
		this.numberOfYears = numberOfYears;
	}

	public double calculateSalary() {
		double monthlySalary = BASE_SALARY * numberOfHoursPerMonth;
		if (numberOfYears > 5) {
			monthlySalary += 0.1 * monthlySalary;
		}
		if (numberOfHoursPerMonth > 150) {
			double extraHours = numberOfHoursPerMonth - 150;
			monthlySalary += extraHours * EXTRA_HOURS_BONUS;
		}
		return monthlySalary;
	}

	public String getEmployeeDetails() {
		return String
				.format("Employee Id: %d\nSecretary Name: %s\nAddress: %s\nManager Id: %d\nHours per month: %.2f",
						employeeId, secretaryName, address, managerId,
						numberOfHoursPerMonth);
	}

}
