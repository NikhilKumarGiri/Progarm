package stringProgram;

public class CountTheCharString {
static int noOfChar(String s)
{
	int count=0;
	//char[] d=s.toCharArray();
	//for(char c:s.toCharArray())
	for(int i=0;i<s.length();i++)
	{
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		System.out.println(noOfChar("abcqds"));
		String f="ffhr";
		System.out.println(f.length());
	}

}
