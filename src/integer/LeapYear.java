package integer;

public class LeapYear {
	static boolean isleap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isleap(2004));

	}
}
