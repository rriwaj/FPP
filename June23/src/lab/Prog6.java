package lab;

import java.util.ArrayList;
//Write a program (called Prog6) that accepts String arguments (stored in args) from the
//main method, removes all duplicates, and outputs these arguments (without duplicates) in              a comma-separated format. For example, if the input into the main method is
//["horse", "dog", "cat", "horse","dog"]
//then the output would be
//"horse","dog","cat"
//
//Typical output:
//Original list: [ horse dog cat horse dog horse cat horse ]
//List without duplicates: [ horse dog cat ]

public class Prog6 {
	public static void main(String[] args) {
		removeDuplicate(new String[] { "a", "a", "b", "c", "b" });
	}

	public static void removeDuplicate(String[] arr) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			boolean isUniqueItem = true;
			for (int j = 0; j < arrList.size(); j++) {
				if (!arr[i].equals(arrList.get(j))) {
					isUniqueItem = true;
				} else {
					isUniqueItem = false;
					break;
				}
			}
			if (isUniqueItem) {
				arrList.add(arr[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Original list: [");
		for (String s : arr) {
			sb.append(String.format("%s ", s));
		}
		sb.append("]\n");
		System.out.println(sb.toString());
		sb = new StringBuilder();
		sb.append("List without duplicates: [");
		for (String s : arrList) {
			sb.append(String.format("%s ", s));
		}
		sb.append("]\n");
		System.out.println(sb.toString());
	}
}