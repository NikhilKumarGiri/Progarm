package stringProgram;

import java.util.ArrayList;
import java.util.List;


public class Spliting {

	public static void main(String[] args) {
		String s ="i am a good boy";
		List<String>a=new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				a.add(s.substring(i,j));
				
			}
		}
		System.out.println(a);
	}

}
