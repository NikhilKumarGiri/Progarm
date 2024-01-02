package hackerrank;
/*
Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long*/
import java.util.Scanner;

public class DataType {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				// Complete the code
				if (x >= -32768 && x <= 32767)
					System.out.println("* short");
				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
					System.out.println("* long");
				sc.close();

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
