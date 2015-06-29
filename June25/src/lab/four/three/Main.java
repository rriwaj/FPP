package lab.four.three;

public class Main {

	public static void main(String[] args) {
		MyStringList strlist = new MyStringList();
		strlist.add("Bob");
		strlist.add("Steve");
		strlist.add("Susan");
		strlist.add("Mark");
		strlist.add("Dave");
		System.out.println(strlist.get(2));
		System.out.println(strlist.find("Susan"));
		System.out.println(strlist.toString());
		System.out.println("Array size before removing: " + strlist.size());
		strlist.remove("Dave");
		System.out.println(strlist.toString());
		System.out.println("Array size after removing: " + strlist.size());
	}
}