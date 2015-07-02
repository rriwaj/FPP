package three;

public class CurrencyConverter {

	static final double CONVERSION_RATE = 100;

	static class StaticInnerClass {
		static double convertCurrency(double nativeAmt) {
			return nativeAmt / CONVERSION_RATE;
		}
	}
}
