package lab;

import java.util.*;
//Write a program that asks the user to enter a String. The program then writes to console
//all substrings of this String . (By "substring", we mean any sequence of characters that
//occur consecutively and in the same order in the given String . Therefore, "erg" is a
//substring of "energy", but "gre" and "eng" are not. Note that the empty string "" is
//considered a substring of every string.)
//Note: You will need to make sure that you do not output the same substring twice. For
//instance, if the user types in "abbab", you might accidentally output the String "ab" twice,
//since it occurs in two places in this String.

public class Prog9 {
	public static void main(String[] args) {
		String text = "abbab";
		int beginIndex, endIndex;
		ArrayList<String> arr;
		for (int i = 0; i <= text.length(); i++) {
			System.out.println(String.format("Substring of length %d is:", i));
			beginIndex = 0;
			endIndex = beginIndex + i;
			arr = new ArrayList<String>();
			for (endIndex = beginIndex + i; endIndex <= text.length(); endIndex = beginIndex
					+ i) {
				String subString = text.substring(beginIndex, endIndex);

				boolean isUnique = false; // variable to check if substring is
											// unique
				if (beginIndex == 0) {
					arr.add(subString);// add first substring to arrayList
				}
				for (String s : arr) {
					if (!s.equals(subString)) { // check if substring is unique
						isUnique = true;
					} else {
						isUnique = false;
						break;
					}
				}
				if (isUnique) {
					arr.add(subString); // add all unique substring
				}
				if (endIndex == text.length()) { // print substring
					for (String s : arr) {
						System.out.println("[" + s + "]");
					}
				}
				beginIndex++;
			}
		}
	}
}