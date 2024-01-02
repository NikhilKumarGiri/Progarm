package hackerrank;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		NumberFormat usformat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat chinaformat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat indiaformat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String us = usformat.format(new BigDecimal(payment));
		//e NumberFormat class not being able to handle double values
		//directly in the format method. To resolve this, you can convert the double to a BigDecimal
		String india = indiaformat.format(new BigDecimal(payment));
		String china = chinaformat.format(new BigDecimal(payment));
		String france = franceformat.format(new BigDecimal(payment));
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
