package stringProgram;

import java.util.Arrays;

public class Anagram {
	static boolean isAnagram(String first,String second)
	{
		if(first.length()==(second.length()))	
		{
			String a=first.toUpperCase();
			String b=second.toUpperCase();
			char []c=a.toCharArray();
			char[]d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			if(Arrays.equals(c,d))
			
			return true;
				
		}
		return false;
	}
		public static void main(String args[])
		{
			System.out.println(isAnagram("OSGF","GFDS"));
		}
}
