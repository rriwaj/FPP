package lab;

public class CheckPalindrome {

	public static void main(String[] args) {
		String input = "“abcd,,ef!!ghi@@ji  klmnn  mlkjihgfedcb,a”";
		boolean result = IsSentencePalindrome(input);
		System.out.println(String.format("%s is %s a palindrome", input,
				result ? "" : "not"));
	}

	/*
	 * 1) Write an application that determines if an input word is a palindrome.
	 * A palindrome is a string that reads the same forward and backward, for
	 * example, noon and madam. Ignore the case of the letter. (Definitely do
	 * for the midterm.)
	 */
	public static Boolean IsPalindrome(String input) {
		int i, j;
		for (i = 0, j = input.length() - 1; i < input.length() && j > i; i++, j--) {
			if (input.charAt(i) != input.charAt(j))
				return false;
		}
		return true;
	}

	/*
	 * 2) Prompt the user for a string. Save it in a StringBuffer object. a.
	 * Append “bye” to the above. Print it out. b. Make all lowercase letters
	 * uppercase, and uppercase letters lowercase. Print the new string. (For
	 * lowercase you can use something like if ((char1 >= ‘a’) && (char1 <=
	 * ‘z’)) … Also check out the Character class!)
	 */
	// a
	public static void AppendBye(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.append("bye");
		System.out.println(input);
	}

	// b
	static String upperToLower(String input) {
		StringBuilder sb = new StringBuilder(input);
		for (int i = 0; i < input.length(); i++) {
			char toChange = input.charAt(i);
			if (toChange >= 'a' && toChange <= 'z') {
				sb.setCharAt(i, Character.toUpperCase(toChange));
			} else if (toChange >= 'A' && toChange <= 'Z') {
				sb.setCharAt(i, Character.toLowerCase(toChange));
			}
		}
		return sb.toString();
	}

	/*
	 * Lab Level 2 : 1) Write an application that determines if an input
	 * sentence is a palindrome, for example, “A man, a plan, a canal, Panama!”
	 * You ignore the punctuation marks, blanks, and the case (upper or lower)
	 * of the letters. Test your program THOROUGHLY!
	 */
	public static Boolean IsSentencePalindrome(String input) {
		input = input.toLowerCase();
		int i, j;
		for (i = 0, j = input.length() - 1; i < input.length() && j > i; i++, j--) {
			if (!(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {
				j++;
				continue;
			}
			if (!(input.charAt(j) >= 'a' && input.charAt(j) <= 'z')) {
				i--;
				continue;
			}
			if (input.charAt(i) != input.charAt(j))
				return false;
		}
		return true;
	}
}
