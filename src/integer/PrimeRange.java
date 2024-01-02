package integer;

public class PrimeRange {

	public static void main(String[] args) {
		boolean prime=true;
		int range=100;
		for(int i=2;i<=range;i++)
		{
			if(i%2==0)
			{
				prime=false;
			}
			else
			{
				System.out.println(i);
			}
		}
//		if(prime==true)
//		{
//			System.out.println(i);
//			
//			
//		}
//		else
//		{
//			System.out.println("not");
//		}
	}
}
