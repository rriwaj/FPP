package two;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	public Secretary(double salary) {
		super(salary);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double computeSalary() {
		return super.computeSalary() + 12 * overtimeHours;
	}
}