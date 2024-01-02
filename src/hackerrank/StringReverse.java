package hackerrank;


import java.util.*;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		A.toLowerCase();
		sc.close();
		String og = A;
		String rev = "";
		for (int i = og.length()-1; i >=0; i--) {
			rev = rev + og.charAt(i);
		}
		System.out.println(rev);
		if (og.equals(rev)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


