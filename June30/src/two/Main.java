package two;

public class Main {
	public static void main(String[] args) {
		Secretary sc = new Secretary("Ram Prasad", "FL,USA", 23, 13, 330, 9);
		System.out.println(sc.getEmployeeDetails());
		System.out.println("Monthly Salary: " + sc.calculateSalary());
		System.out.println();
		Manager mgr = new Manager("George Clooney", "CA,USA", 13, 160, 5);
		System.out.println(mgr.getEmployeeDetails());
		System.out.println("Monthly Salary: " + mgr.calculateSalary());
	}
}
// OUTPUT
// ========================================================
// Employee Id: 23
// Secretary Name: Ram Prasad
// Address: FL,USA
// Manager Id: 13
// Hours per month: 330.00
// Monthly Salary: 6330.0
//
// Employee Id: 13
// Manager Name: George Clooney
// Address: CA,USA
// Number of years of work: 5.0
// Hours per month: 160.00
// Monthly Salary: 3350.0
