package stringProgram;

public class Prat {
	static void reversewordsentense(String s) {
		String[] a = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		reversewordsentense("my is ja");
	}

}
