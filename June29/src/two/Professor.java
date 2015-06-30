package two;

import java.util.*;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, double salary, Date hireDate) {
		super(name, salary, hireDate);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
