package hackerrank;

import java.util.Scanner;

/*Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive*/
public class Parallelogram_hackerrankmethod {
	static boolean flag = false;
	static int B, H;

	static {
		Scanner s = new Scanner(System.in);
		B = s.nextInt();
		H = s.nextInt();

		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		s.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
