package three;

import java.util.*;

public class GeometricObject {

	private final String DEFAULT_COLOR = "white";
	private final boolean DEFAULT_FILLED = false;
	private String color;
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		this.color = DEFAULT_COLOR;
		this.filled = DEFAULT_FILLED;
		this.dateCreated = new GregorianCalendar().getTime();
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new GregorianCalendar().getTime();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return String.format("created on: %s \ncolor: %s and filled %b",
				dateCreated, color, filled);
	}
}
