package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class StringCompress {
	static String Compress(String s)
	{
		HashMap<Character,Integer>hm=new HashMap<>();
		for(char c:s.toCharArray())
		{
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			sb.append(entry.getKey()).append(entry.getValue());
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(Compress("aabbhhhnnn"));

	}

}
