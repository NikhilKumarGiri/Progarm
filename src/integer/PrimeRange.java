package integer;

public class PrimeRange {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;			

		for (int i = start; i <= end; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}

		}
	}
}
