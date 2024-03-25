package stringProgram;

import java.util.HashMap;

public class Frequency_Of_Word_Sentense {

	public static void main(String[] args) {
 		String sentense="java is a program languagae a a";
		String words[]=sentense.split(" ");
		HashMap<String, Integer> value=new HashMap<>();
		for(String word:words)
		{
			if(value.containsKey(word))
			{
				value.put(word, value.get(word)+1);
			}
			else
			{
				value.put(word,1);
			}
		}
		System.out.println(value);

	}

}
