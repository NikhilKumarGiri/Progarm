package stringProgram;

import java.util.HashSet;

public class RemoveDuplicate {
	static void afterRemove(String s) {
		HashSet<Character> st = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			st.add(s.charAt(i));
		}
		System.out.println(st);// [a, s, t, e, w]

		for (Character c : st) {
			System.out.print(c);// astew
		}

	}

	public static void main(String[] args) {
		afterRemove("assaweat");
	}
}
