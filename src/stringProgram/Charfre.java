package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class Charfre {
	static void freq(String s) {
		Map<Character, Integer> charfrq = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (charfrq.containsKey(c)) {
 				int count = charfrq.get(c);

				charfrq.put(c, ++count);
			} else {
				charfrq.put(c, 1);
			}
		}
		System.out.println(charfrq);
	}

	public static void main(String[] args) {
		freq("jhjuyfj");
	}
}
