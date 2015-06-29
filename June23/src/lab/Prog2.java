package lab;

// 1) Create a class Prog2. Inside its main method, create float variables to
// store each of the following numbers: 1.27, 3.881, 9.6 Output to the console
// the following two values: a. the sum of the floats as an integer, obtained by
// casting the sum to type int b. the sum of the floats as an integer, obtained
// by rounding the sum to the nearest
 
public class Prog2 {
	public static void main(String[] args) {
		float[] numbers = { 1.27f, 3.881f, 9.6f };
		float sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of floats as an integer obtained by casting: "
				+ (int) sum);
		System.out.println("Sum of floats as an integer obtained by rounding: "
				+ Math.round(sum));

	}
}