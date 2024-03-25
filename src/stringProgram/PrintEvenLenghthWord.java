package stringProgram;

public class PrintEvenLenghthWord {
	static void extractStringByEvenorder(String s) {

		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			// int wordlen=a[i].length();
			if (a[i].length() % 2 == 0) {

				System.out.print(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extractStringByEvenorder("i am a disco dancer");
	}

}
