package stringProgram;

public class LongestString {

	public static void main(String[] args) {
		String s = "Start small. Ship something.";
		String[] m = s.split(" ");
		String word = m[0];
		for (String v : m) {
			if (word.length() < v.length()) {
				word = v;
			}
		}
		System.out.println(word);
	}

}
