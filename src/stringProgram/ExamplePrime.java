package stringProgram;

public class ExamplePrime {


	public static void isprime(int num) {
		boolean prime = true;


		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) {
			System.out.println("Given number is a prime number");
		} else {
			System.out.println("Given number is not prime");
			// System.out.println( Math.sqrt(7));

		}
	}

	public static void main(String[] args) {
		isprime(4);
	}

}
