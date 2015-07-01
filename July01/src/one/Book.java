package one;

public class Book implements Cloneable {
	String title;
	String author;
	String edition;
	String pageCount;
	boolean hardcover;
	double price;

	public Book(String title, String author, String edition, String pageCount,
			boolean hardcover, double price) {
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.pageCount = pageCount;
		this.hardcover = hardcover;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Book book = (Book) obj;
		if (!(this.author.equals(book.author))
				|| !(this.title.equals(book.title))
				|| !(this.edition.equals(book.edition))) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		return hash = 11 * hash + title.hashCode() + author.hashCode()
				+ edition.hashCode();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Book) super.clone();
	}
}
