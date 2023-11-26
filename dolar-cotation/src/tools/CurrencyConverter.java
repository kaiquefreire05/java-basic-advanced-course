package tools;

public class CurrencyConverter {
	public static final double DOLLAR = 3.10;
	
	public static double converter(double pvalue) {
		pvalue += (pvalue * 0.06);
		return pvalue * DOLLAR;
	}
}
