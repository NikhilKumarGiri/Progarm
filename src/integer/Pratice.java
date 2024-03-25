package integer;

public class Pratice {
	static boolean amstrong(int n)
	{
		int l=String.valueOf(n).length();
		int temp=n,rem;
		double sum=0;
		for(int i=0;i<=l;i++)
		{
			rem=n%10;
			sum=sum+Math.pow(rem, l);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Amstrong ");
			return true;
		}return false;
	}
	public static void main(String[] args) {
		System.out.println(amstrong(153));
	}

}
