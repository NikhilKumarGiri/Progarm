package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class WordFreqShort {
	public static void freq(String s)
	{
		String words[]=s.split(" ");
		Map<String,Integer>m=new HashMap<>();
		for(String word:words)
		{
			m.put(word, m.getOrDefault(word, 0)+1);
		}
		System.out.print(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freq("i am a good a am");

	}

}
