package integer;

public class NumberPallindrome {
	static boolean isPallindrome(int num) {
		int after = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if (rev == after) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPallindrome(654));

	}
}
