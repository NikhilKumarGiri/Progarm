package string_arrayDemo;

public class Input_aabbbc {

	public static void main(String[] args) {

		String s="a2b3c1";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				System.out.print(c);
			}
			else
			{
				int d=Character.getNumericValue(s.charAt(i));
				for(int j=1;j<d;j++)
				{
					System.out.print(s.charAt(i-1));
					/* i-1 because the i is a numeric,so the 
					previous char is alphabet,to print the
					 alphabet */

				}
			}
		}
			
		
	}

}
