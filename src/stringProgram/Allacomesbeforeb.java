package stringProgram;

public class Allacomesbeforeb {
	public static boolean check(String s)
	{
		int firstb=s.indexOf('b');
		//if b is not present in the string it will return -1
		if(firstb==-1)
		{
			return true;
		}
		boolean hasA=s.substring(firstb).contains("a");
		return !hasA;
	}

	public static void main(String[] args) {
		System.out.println(check("aaabb"));
		System.out.println(check("abababa"));
		System.out.println(check("aaaa"));
	}

}
