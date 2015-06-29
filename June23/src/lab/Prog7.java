package lab;

import java.util.*;

//In this exercise, you will write a program (called Prog7) that creates and outputs an SQL
//statement based on user input. The program prompts the user for the following pieces of
//information:
//table name
//number of column names
//column name (as many occurrences as there are column names)
//salary value
//For this exercise, the table name will refer to an imaginary database table that stores
//customer information, including name, zip, salary, and other columns that you may
//invent. The SQL statement that your program will output will be of the form
//SELECT <column names>
//FROM <table name>
//WHERE salary > <salary value>

public class Prog7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("table name = ");
		String tableName = sc.nextLine();

		System.out.println("number of column names = ");
		int noOfColumn = sc.nextInt();
		sc.nextLine();
		String[] columnNames = new String[noOfColumn];

		for (int i = 0; i < columnNames.length; i++) {
			System.out.println("column name = ");
			String sd = sc.nextLine();
			columnNames[i] = sd;
		}
		System.out.println("salary value = ");
		double salary = sc.nextDouble();

		StringBuilder sb = new StringBuilder("SELECT");
		for (String columnName : columnNames) {
			sb.append(String.format(" %s,", columnName));
		}		
		String s = sb.deleteCharAt(sb.toString().length() - 1).toString();		
		sb.append(" FROM " + tableName);
		sb.append(" WHERE salary > " + salary);
		System.out.println(sb.toString());
	}
}
