package lab.four.two;

import lab.four.one.AccountType;
import java.util.*;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,
				monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public String getEmployeeName() {
		return this.name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		default:
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean isWithdrawValid = false;
		switch (acctType) {
		case CHECKING:
			isWithdrawValid = checkingAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			isWithdrawValid = retirementAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			isWithdrawValid = savingsAcct.makeWithdrawal(amt);
			break;
		}
		return isWithdrawValid;
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		if (this.checkingAcct != null) {
			sb.append(this.checkingAcct.toString());
			sb.append("\n");
		}
		if (this.savingsAcct != null) {
			sb.append(this.savingsAcct.toString());
			sb.append("\n");
		}
		if (this.retirementAcct != null) {
			sb.append(this.retirementAcct.toString());
			sb.append("\n");
		}
		return sb.toString();

	}
}