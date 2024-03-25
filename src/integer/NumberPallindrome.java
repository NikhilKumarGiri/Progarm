package integer;

public class NumberPallindrome {
	static boolean isPallindrome(int num) {
		int after = num;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == after) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPallindrome(6556));

	}
}
