package three;

public class Main {
	public static void main(String[] args) {
		GeometricObject object = new GeometricObject();
		Circle circle = new Circle(4.25, "red", true);
		object = circle;
		System.out.printf("Area of circle is %f \n", circle.getArea());
		System.out.printf("Diameter of circle is %f \n", circle.getDiameter());
		System.out
				.printf("Perimeter of circle is %f \n", circle.getPerimeter());
		System.out.println(object);
		Rectangle rect = new Rectangle(10, 12);
		object = rect;
		System.out.printf("Area of Rectangle is %f \n", rect.getArea());
		System.out.printf("Perimeter of Rectangle is %f \n",
				rect.getPerimeter());
		System.out.println(object);
	}
}

// OUTPUT
// ===================================================
// Area of circle is 56.745017
// Diameter of circle is 8.500000
// Perimeter of circle is 26.703538
// created on: Tue Jun 30 11:09:32 CDT 2015
// color: red and filled true
// Area of Rectangle is 120.000000
// Perimeter of Rectangle is 44.000000
// created on: Tue Jun 30 11:09:32 CDT 2015
// color: white and filled false
