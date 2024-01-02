package arrayProgram;

public class CheckGivenValuePresence {
	static void presence(int[] a, int value) {
		boolean ispresent = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				ispresent = true;
				break;
			}

		}
		if (ispresent == true) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6, 9 };
		presence(a, 9);
	}

}
