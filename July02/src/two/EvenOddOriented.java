package two;

public class EvenOddOriented {
	int[] arr;

	public String evenOddOriented() {
		class LocalClass {
			private int evenSum = 0;
			private int oddSum = 0;

			private void calculateOddEvenSum() {
				for (int n : arr) {
					if (n % 2 == 0) {
						evenSum += n;
					} else {
						oddSum += n;
					}
				}
			}

			private String displayResult() {
				StringBuilder sb = new StringBuilder();
				sb.append(String.format("Sum of Even numbers: %d \n", evenSum));
				sb.append(String.format("Sum of Odd numbers: %d \n", oddSum));
				sb.append(String.format("Given array is %s %s",
						evenSum > oddSum ? "Even" : "Odd", "Oriented"));
				return sb.toString();
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.calculateOddEvenSum();
		return localClass.displayResult();
	}
}
