package string_arrayDemo;

public class ConvertSmall_To_Caps {

	static StringBuffer convertTocaps(String s)
	{
		StringBuffer str=new StringBuffer(s);
		for (int j = 0; j < s.length(); j++) {
			char c=s.charAt(j);
			if(Character.isLowerCase(c))
			{
				str.setCharAt(j, Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c))
			{
				str.setCharAt(j, Character.toLowerCase(c));
			}
			
			
		}
		return str;
	}
//	static String convertTocaps1(String s)
//	{
//		String reg=""
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertTocaps("mY nAME"));
	}

}
