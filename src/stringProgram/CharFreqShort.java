package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class CharFreqShort {
	public static void frequency(String s)
	{
		Map<Character,Integer>mp=new HashMap<>();
		for(char c:s.toCharArray())
		{
			mp.put(c,mp.getOrDefault(c, 0)+ 1);
		}
		System.out.println(mp);
	}
	
	public static void main(String[] args) {

		frequency("naghjsa");
	}

}
