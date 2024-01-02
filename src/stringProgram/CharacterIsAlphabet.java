package stringProgram;

public class CharacterIsAlphabet {
	static boolean isAlphabet(char c)
	{
		if(Character.isAlphabetic(c))
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAlphabet('0'));
	}

}
