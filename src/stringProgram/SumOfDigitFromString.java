package stringProgram;

public class SumOfDigitFromString {

	static int sum(String s)
	{
		int sum=0,rem;
		String b=s.replaceAll("[^\\d]", "");
		int a=Integer.parseInt(b);
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum("adas12rayaf43"));
	}
}
