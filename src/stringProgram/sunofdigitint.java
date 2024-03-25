package stringProgram;

public class sunofdigitint {
	static void sumofint(int a) {
		int Sum = 0, digit;
		while (a > 0) {
			digit = a % 10;
			Sum = Sum + digit;
			a = a / 10;
		}
		System.out.println(Sum);
	}

	public static void main(String[] args) {
		sumofint(12315);
	}

}
