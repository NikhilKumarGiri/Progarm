package collectionProgram;

import java.util.HashMap;
import java.util.Map;

public class CharFreqString {
	static void charFrequency(String s) {

		Map<Character, Integer> mp = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			//char c=s.charAt(i);
			if(mp.containsKey(s.charAt(i)))
			{
				int count=mp.get(s.charAt(i));
				mp.put(s.charAt(i),++count);
			}
			else
			{
				mp.put(s.charAt(i),1);
			}
		}System.out.println(mp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charFrequency("nikhail");
	}

}
