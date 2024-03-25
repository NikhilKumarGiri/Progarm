package stringProgram;

import java.util.HashMap;

public class CharPrat {
	public static void main(String[] args) {
		String s="Javaj";
		char[]c=s.toCharArray();
		HashMap<Character,Integer>hp=new HashMap<>();
		for(char d:c)
		{
			if(hp.containsKey(d))
			{
				hp.put(d,  hp.get(d)+1);
			}
			else
			{
				hp.put(d, 1);
			}
			
		}System.out.println(hp);
	}

}
