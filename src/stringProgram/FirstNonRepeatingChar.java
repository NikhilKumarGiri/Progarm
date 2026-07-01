package stringProgram;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s="nikhil";
		//s.indexOf(c) = 1st index of the character 
		//and s.lastIndexOf(c) last index of char 
		//if both are equal the char is occur only once
		for(char c:s.toCharArray())
		{
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
	}

}
