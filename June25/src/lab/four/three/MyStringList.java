package lab.four.three;

public class MyStringList {

	private String[] strArray = new String[0];

	public void add(String s) {
		// - adds s to the end of the underlying array
		String[] temp = new String[strArray.length + 1];
		for (int i = 0; i < strArray.length; i++) {
			temp[i] = strArray[i];
		}
		temp[temp.length - 1] = s;
		strArray = temp;
	}

	public String get(int i) {
		// - retrieves the String at the ith position in the underlying array
		return strArray[i];
	}

	public boolean find(String s) {
		// - returns true if String s is found in the array, false otherwise
		for (String str : strArray) {
			if (str.equalsIgnoreCase(s))
				return true;
		}
		return false;		
	}

	public boolean remove(String s) {
		// - removes first occurrence of String s if it is found in the
		// underlying array
		// if found, returns true; if not found returns false
		boolean isStringFound = false;
		for (String str : strArray) {
			if (str.equalsIgnoreCase(s))
				isStringFound = true;
		}
		if (isStringFound) {
			int j = 0;
			String[] temp = new String[strArray.length - 1];
			for (String str : strArray) {
				if (str.equalsIgnoreCase(s))
					continue;
				else {
					temp[j] = str;
					j++;
				}
			}
			strArray = temp;
		}
		return isStringFound;
	}

	public String toString() {
		// - returns a String representation of the underlying array
		// here is a typical output: [Bob, Steve, Susan, Mark, Dave]
		StringBuilder sb = new StringBuilder();
		for (String str : strArray) {
			sb.append(str);
			sb.append(" ");
		}
		return sb.toString();
	}

	public int size() {
		return strArray.length;
	}

}