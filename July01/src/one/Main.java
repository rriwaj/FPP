package one;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("Core Java Vol.1", "Cary H. Horstman", "Ninth",
				"700", true, 240);
		Book clonedBook = (Book) book.clone();
		String res = book.equals(clonedBook) ? "equal" : "not equal";
		System.out.println("book and clonedBook object are " + res);
		System.out.println("Hash code of Book is: " + book.hashCode());
		System.out.println("Hash code of Cloned Book is: " + book.hashCode());
		System.out.println();

		Book xeroxBook = new Book("Core Java Vol.1", "Cary H. Horstman",
				"Ninth", "700", true, 240);
		res = book.equals(xeroxBook) ? "equal" : "not equal";
		System.out.println("book and xeroxBook object are " + res);
		System.out
				.println("Hash code of xeroxBook is: " + xeroxBook.hashCode());
		System.out.println();
		Book newBook = new Book("Advanced Java", "Dietel & dietel", "Ninth",
				"700", true, 240);
		res = newBook.equals(book) ? "equal" : "not equal";
		System.out.println("book and newBook object are " + res);
		System.out.println("Hash code of newBook is: " + newBook.hashCode());
	}
}