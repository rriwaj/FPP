package lab.four.four;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(33.65);
		Rectangle r = new Rectangle(17, 9);
		Triangle t = new Triangle(8, 10);

		String formattedOutput = String
				.format("Area of Triangle is %f \nArea of Rectangle is %f \nArea of Circle is %f ",
						t.computeArea(), r.computeArea(), c.computeArea());
		System.out.println(formattedOutput);
	}

}