package integer;

public class CountDigitOfInteger {

	public static int countDigit(int number)
	{
		int count=0;
		while(number!=0)
		{
			number=number/10;
			
			++count;
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(CountDigitOfInteger.countDigit(143122));
	}
}
