package stringProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveSpaceUniqueChar {
	public static void unique(String w) {
		String after=w.replaceAll(" ","");
		Set<Character> c=new HashSet<>();
		for(char ch:after.toCharArray())
		{
			c.add(ch);
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		unique("afy 2uhh afr");
	}

}
