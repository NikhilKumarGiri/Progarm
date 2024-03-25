package arrayProgram;

public class MissingNumber {
	static void number(int[] num) {

		for (int a = 1; a <= 10; a++) {
			boolean present = false;
			for (int b = 0; b < num.length; b++) {
				if (num[b] == a) {
					present = true;
					break;
				}
			}
			if (!present) {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 7, 9 };
		number(num);

	}

}
