package integer;

public class SumOfDigit {
	static void digitsumtosingledigit(int a) {
		int sum = 0;

		while (a > 0 || sum > 9) {
			if (a == 0) {
				a = sum;
				sum = 0;
			}
			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
System.out.println(sum);
	}

	public static void main(String[] args) {
		digitsumtosingledigit(7323);
	}

}
