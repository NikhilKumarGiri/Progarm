package hackerrank;

import java.util.Scanner;

public class Convert_intto_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			// String s=???; Complete this line below
			String s = String.valueOf(n);
			// Write your code here

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}
