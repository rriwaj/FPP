package q1;

public class Course {
	private String name;
	private String[] faculty;

	public Course() {
		name = null;
		faculty = new String[10];
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

}