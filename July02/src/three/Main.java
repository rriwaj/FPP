package three;

public class Main {
	public static void main(String[] args) {

		double nativeAmt = 300000;
		String result = String.format(
				"NRS. %.2f = US $ %.2f \nConversion Rate NRS %.2f = 1 US$",
				nativeAmt,
				CurrencyConverter.StaticInnerClass.convertCurrency(30000),
				CurrencyConverter.CONVERSION_RATE);
		System.out.println(result);
	}
}

// OUTPUT
// ==================================================
// NRS. 300000.00 = US $ 300.00
// Conversion Rate NRS 100.00 = 1 US$
