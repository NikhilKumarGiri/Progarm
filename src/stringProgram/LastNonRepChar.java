package stringProgram;

public class LastNonRepChar {

	public static void main(String[] args) {
		String s="amnabsj";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.print(c);
				break;
				
			}
		}
	}

}
