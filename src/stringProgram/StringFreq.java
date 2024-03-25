package stringProgram;

import java.util.HashMap;

public class StringFreq {
	public static void frequStr(String s) {
		String []x=s.split(" ");
		HashMap<String,Integer> hp=new HashMap<>();
		for(String f:x)
		{
			if(hp.containsKey(f))
			{
				hp.put(f, hp.get(f)+1);
			}
			else
			{
				hp.put(f, 1);
			}
		}System.out.println(hp);
		
		
	}

	public static void main(String[] args) {
		frequStr("My name is name is ");
	}

}
