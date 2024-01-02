package stringProgram;

public class Swap2CharFromString {
	static void swap2char(String s) {
		char a[] = s.toCharArray();
		for (int i = 0; i < a.length - 1; i += 2) {

			char temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;

		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		swap2char("abcdefghq");
	}
}
