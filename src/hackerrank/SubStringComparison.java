package hackerrank;

import java.util.Scanner;

public class SubStringComparison {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = smallest;
		for (int i = 1; i <= s.length() - k; i++) {
			String slipby3 = s.substring(i, i + k);
			smallest = slipby3.compareTo(smallest) < 0 ? slipby3 : smallest;
			largest = slipby3.compareTo(largest) > 0 ? slipby3 : largest;

		}
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
