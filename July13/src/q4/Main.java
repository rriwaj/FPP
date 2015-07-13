package q4;

public class Main {
	public static void main(String[] args) throws InsufficientAmountException {
		CustomerAccount ac = new CustomerAccount("Ram", "0202155100", 20);
		ac.deposit(50);
		System.out.println("Account balance is: " + ac.getBalance());		
		ac.withdraw(20);
	}
}

// OUTPUT
// =============================================================
// Account balance is: 70.0
// Exception in thread "main" q4.InsufficientAmountException: Insufficient
// balance in account
// at q4.CustomerAccount.withdraw(CustomerAccount.java:40)
// at q4.Main.main(Main.java:9)
