package stringProgram;

public class CountTheCharString {
static int noOfChar(String s)
{
	int count=0;
	
	for(char c:s.toCharArray())
	{
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		System.out.println(noOfChar("abcds"));
	}

}
