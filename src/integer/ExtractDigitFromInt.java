 package integer;

public class ExtractDigitFromInt {
	static void extract(int num)
	{
		while(num>0)
		{
			int digit=num%10;
			System.out.println(digit);
			//num/=10;
			num=num/10;
		}
	}
	public static void main(String[] args) {
		extract(123);
	}
}
