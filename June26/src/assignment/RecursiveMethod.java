package assignment;

public class RecursiveMethod {

	public static void main(String[] args) {
		System.out.println("the result is " + power(5, 10));
	}

	public static double power(double x, int n) {
		if (n == 1)
			return x;
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);
	}

}
