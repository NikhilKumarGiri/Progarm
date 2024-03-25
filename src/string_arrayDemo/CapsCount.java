package string_arrayDemo;

public class CapsCount {
	static int count(String s)
	{
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				count++;
			}
			
		}
		return count;
	}
	static int count2(String s)
	{
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=95)
			{
				count++;
			}
			
		}
		return count;
	}
	static int count3(String s)
	{
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
			{
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("V Bag Of caKe"));
		System.out.println(count2("V Bag Of caKe"));
		System.out.println(count3("V Bag Of caKe"));
	}

}
