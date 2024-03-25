package pratice;

import java.util.HashMap;

public class CharOcc {
	static void charoc(String s)
	{
		String b=s.replaceAll("[\\s]", "");
		HashMap<Character,Integer>hp=new HashMap<>();
		for(int i=0;i<b.length();i++ )
		{
			char c=b.charAt(i);
			if(hp.containsKey(c))
			{
			hp.put(c,hp.get(c)+1);
			}
			else
			{
				hp.put(c, 1);
			}
		}System.out.println(hp);
	}

	public static void main(String[] args) {
		charoc("nikhil kumar giri");
		}

}
