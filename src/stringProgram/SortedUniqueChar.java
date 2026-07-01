package stringProgram;

import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueChar {
	public static void sorted(String s) {
		String after = s.replaceAll(" ", "");
		Set<Character> c = new TreeSet<>();
		for (char m : after.toCharArray()) {
			c.add(m);
		}
		System.out.println(c);
		StringBuffer sf = new StringBuffer();
		for (char ch : c) {
			sf.append(ch);
		}

		System.out.println(sf);
	}

	public static void main(String args[]) {
		sorted("zfahs ajsbh");
	}

}
