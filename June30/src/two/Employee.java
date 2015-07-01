package two;

public interface Employee {

	double BASE_SALARY = 10;
	double BONUS = 2;
	double EXTRA_HOURS_BONUS = 15;

	String getEmployeeDetails();

	double calculateSalary();
}
