package stringProgram;

public class StringExcatSum {

	static void sum(String s) {
		String b = s.replaceAll("[$]", "");
		System.out.println(b);
		int h = Integer.parseInt(b);
		int sum = 0, rem;
		while (h > 0) {
			rem = h % 10;
			sum = sum + rem;
			h = h / 10;
			//System.out.println(h);
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		sum("1$2$3$4");

	}
}
