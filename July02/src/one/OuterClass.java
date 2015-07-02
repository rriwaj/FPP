package one;

public class OuterClass {
	int[] intArray;

	class InnerClass {
		private int max = -1;
		private double avg = 0;
		private int min = intArray[0];

		void calculate() {
			int sum = 0;
			for (int i : intArray) {
				if (i > max) {
					max = i;
				} else if (i < min) {
					min = i;
				}
				sum += i;
			}
			avg = sum / intArray.length;
		}

		String display() {
			return String
					.format("Min of array is %d \nMax of array is %d\nAverage of array is %.2f",
							min, max, avg);
		}
	}
}
