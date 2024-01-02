package stringProgram;

public class RemoveJunkCharacter {
	public static String Remove(String s)
	{
		String afterRemovejunk="";
		String afterRemove$="";
		afterRemovejunk=s.replaceAll("[^A-Z a-z 0-9]", "");
		afterRemove$=s.replaceAll("[$]", "");
		return afterRemove$;
	}

	public static void main(String[] args) {
		System.out.println(RemoveJunkCharacter.Remove("$143$4.98$7$"));
	}

}
