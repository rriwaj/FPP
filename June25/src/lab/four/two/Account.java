package lab.four.two;

import lab.four.one.AccountType;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType + "\nCurrent bal: " + balance;
	}

	public AccountType getAcctType() {
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
