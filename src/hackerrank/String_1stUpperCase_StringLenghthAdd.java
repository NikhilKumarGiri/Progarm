package hackerrank;

import java.util.*;

public class String_1stUpperCase_StringLenghthAdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		int sum = A.length() + B.length();
		System.out.println(sum);
		int a = A.compareTo(B);
		int b = B.compareTo(A);
		if (a > b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));
	}
}
