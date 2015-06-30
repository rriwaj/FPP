package two;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(double salary) {
		super(salary);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
