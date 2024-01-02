package string_arrayDemo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
static void afterRemove(String s)
{
	Set<Character>st=new HashSet<>();
	for(int i=0;i<s.length();i++)
	{
		st.add(s.charAt(i));
	}
	System.out.println(st);//[a, s, t, e, w]

	for(Character c:st)
	{
		System.out.print(c);//astew
	}
	
}
public static void main(String[] args) {
	afterRemove("assaweat");
}
}
