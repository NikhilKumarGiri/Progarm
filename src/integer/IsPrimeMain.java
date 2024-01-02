package integer;

public class IsPrimeMain {

	public static void main(String[] args) {
		boolean prime= true;
		int num=5;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			System.out.println("True");
			
		}
		else
			System.out.println("False");
	}

}
