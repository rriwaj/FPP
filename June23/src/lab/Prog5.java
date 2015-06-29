package lab;

import java.util.Scanner;

//a)  Write a program (called Prog5) that asks the user to input a String. The output is the
//characters of this String in reverse order. (For example, if the input string is "Hello", the
//output string would be "olleH".) (Do not use arrays and do not create a new String
//object.)  (Definitely do for the midterm.)
//
//b)  Output the number of  ‘x’s  in the string from the user.
//For example if the user types in  “Exit  abc  exit”, 
//then the output would be  “2  ‘x’ characters”
public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string ");
		String userInput = sc.nextLine();

		reverseString(userInput);

		System.out.println("Enter character to scan ");
		char charToCheck = sc.next().charAt(0);
		countCharOccurrenceInString(userInput, charToCheck);
		sc.close();
	}

	public static void reverseString(String userInput) {
		String reverseString = "";
		int userInputLength = userInput.length();
		for (int i = userInputLength - 1; i >= 0; i--) {
			reverseString += userInput.charAt(i);
		}
		System.out.println(reverseString);
	}

	public static void countCharOccurrenceInString(String userInput,
			char charToCheck) {
		int count = 0;
		int userInputLength = userInput.length();
		for (int i = 0; i < userInputLength; i++) {
			if (charToCheck == userInput.charAt(i))
				count++;
		}
		System.out.println("Total Occurrence of " + charToCheck + "  is: "
				+ count);
	}
}
