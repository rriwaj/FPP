package lab.four.four;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}