package lab.four.one;

public class Accountv1 {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Accountv1(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Accountv1(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public String getAcctType() {
		return acctType;
	}

	public double getBalance() {
		return balance;

	}

	public Employee getEmployee() {
		return employee;
	}

	public void makeDeposit(double deposit) {

		// updates the balance field and returns true, unless
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// withdrawal amount is too large; in that case,
		// it does not modify the balance field, and returns false
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else
			return false;

	}

	public double computeInterest() {
		double interest = 0.0;
		switch (acctType) {
		case CHECKING:
			interest = balance * 0.02;
			break;
		case SAVINGS:
			interest = balance * 0.04;
			break;
		case RETIREMENT:
			interest = balance * 0.05;
			break;
		}
		return interest;
	}
}
