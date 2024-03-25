package string_arrayDemo;


public class Convert_Capstos_Small_viceVersa {

	static StringBuffer convert(String s) {
		StringBuffer sf = new StringBuffer(s);
		for (int i = 0; i < sf.length(); i++) {
			char c=sf.charAt(i);
			if(Character.isUpperCase(c))
			{
				sf.setCharAt(i, Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c))
			{
				sf.setCharAt(i, Character.toUpperCase(c));
			}
			

		}return sf;
	}
	public static void main(String[] args) {
		System.out.println(convert("i am NiKhIL"));
	}
}
