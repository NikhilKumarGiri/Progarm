package stringProgram;

public class CountVowelConst {
	public static void main(String[] args) {
	int vcount=0;
	int ccount=0;
	String s="my name is singh";
	String m=s.replaceAll("[\s]", "");
	String d=m.toLowerCase();
	for(int i=0;i<d.length();i++)
	{
		char c=d.charAt(i);
		if(c=='a'||c=='e'||c=='o'||c=='i'||c== 'u')
		{
			vcount++;
		}
		else
		{
			ccount++;
		}
	}
	System.out.println("Vowel count is--"+vcount);
	System.out.println("Consonant count is--"+ccount);
	}

}
