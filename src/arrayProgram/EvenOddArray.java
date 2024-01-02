package arrayProgram;


public class EvenOddArray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		evenOdd(a);
	}
	static void evenOdd(int[] values)
	{
		for(int i=0;i<values.length;i++)
		{
			if(values[i]%2==0)
			{
				System.out.println("Even number is "+values[i]);
			}
			else
			{
				System.out.println("Odd number is "+values[i]);
			}
		}		
	}

}
