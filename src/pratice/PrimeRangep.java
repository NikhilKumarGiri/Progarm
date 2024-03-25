package pratice;

public class PrimeRangep {
	static void number(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int count =0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}if(count==2)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
number(10,100);
		
	}

}
