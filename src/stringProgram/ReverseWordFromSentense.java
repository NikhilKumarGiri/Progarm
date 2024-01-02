package stringProgram;

public class ReverseWordFromSentense {

	public static void main(String[] args) {
		// my name is ram
		// ram is name my
		String s = "my name is Nikhil";
		String[] words = s.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

	}

}
