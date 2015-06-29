package lab.four.one;

import java.util.ArrayList;

//4. Create a class Main having a main method that does the following:
public class Main {
	public static void main(String[] args) {
		// a. It creates a new Employee object employee (you can invent your own
		// arguments for the constructor)
		ArrayList<Employee> empArray = new ArrayList<Employee>();
		empArray.add(new Employee("John Snow", 100000, 2014, 3, 12));
		empArray.add(new Employee("Martin Guptill", 50000, 2014, 7, 12));
		empArray.add(new Employee("Taylor Swift", 30000, 2014, 9, 12));

		// b. Then it creates a checking account, savings account and retirement
		// account for employee, each with a starting balance of $300.
		Accountv1 johnAcct = new Accountv1(empArray.get(0), "checking", 300);
		Accountv1 martinAcct = new Accountv1(empArray.get(1), "savings", 300);
		Accountv1 taylorAcct = new Accountv1(empArray.get(1), "retirement", 300);

		// c. Then it prints to the console the account data for each of these
		// accounts (making use of the toString() method that has been provided
		// in Account)
		PrintAccountData(johnAcct);
		PrintAccountData(martinAcct);
		PrintAccountData(taylorAcct);
		
		System.out.println("Printing data of Recactored account class.................");

		// Using refactored Accountv2 class
		Account johnAcctv2 = new Account(empArray.get(0),
				AccountType.CHECKING, 300);
		Account martinAcctv2 = new Account(empArray.get(1),
				AccountType.SAVINGS, 300);
		Account taylorAcctv2 = new Account(empArray.get(1),
				AccountType.RETIREMENT, 300);

		PrintAccountv2Data(johnAcctv2);
		PrintAccountv2Data(martinAcctv2);
		PrintAccountv2Data(taylorAcctv2);
	}

	// Then it creates a checking account, savings account and retirement
	// account for employee, each with a starting balance of $300.
	private static void PrintFederalTax(Employee emp) {
		System.out.println("Yearly federal tax of " + emp.getName()
				+ " earning " + emp.getSalary() + " is: "
				+ emp.yearlyFederalTax());
	}

	private static void PrintAccountData(Accountv1 acct) {
		String printText = String.format(
				"Account information of \"%s\" \n %s ", acct.getEmployee()
						.getName(), acct.toString());
		System.out.println(printText);
	}

	private static void PrintAccountv2Data(Account acct) {
		String printText = String.format(
				"Account information of \"%s\" \n %s ", acct.getEmployee()
						.getName(), acct.toString());
		System.out.println(printText);
	}
}
