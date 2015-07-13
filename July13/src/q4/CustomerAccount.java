package q4;

public class CustomerAccount {
	private String cusName;
	private String accNo;
	private double balance;

	public CustomerAccount(String cusName, String accNo, double balance) {
		this.cusName = cusName;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double balance) throws InsufficientAmountException {
		if (balance > this.balance || this.balance < 100)
			throw new InsufficientAmountException(
					"Insufficient balance in account");
		this.balance -= balance;
	}

	public double getBalance() {
		return this.balance;
	}
}
