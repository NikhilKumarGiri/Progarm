package hackerrank;

import java.util.*;

public class Splitingstringcount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		// Write your code here.
		s = s.trim();
		String[] tokens = s.split("[^a-zA-Z0-9]+");
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(tokens.length);
		}
		for (String token : tokens) {
			System.out.println(token);
		}
	}
}
//He is a very very good boy, isn't he?

