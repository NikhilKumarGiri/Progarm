package arrayProgram_medium;

import java.util.Arrays;

public class SeparateEvenOdd {
	static void OddEven(int []a)
	{
		int ecount=0;
		int ocount=0;
		// Step 1: Count evens and odds
		for(int num:a)
		{
			if(num%2==0)
			{
				ecount++;
			}
			ocount++;
		}
		  // Step 2: Create arrays of exact size
		int evens[]=new int[ecount];
		int odds[]=new int[ocount];
		int eindex=0,oidex=0;
		// Step 3: Fill arrays
		for(int num:a)
		{
			if(num%2==0)
			{
				evens[eindex++]=num;
			}
			else
			{
				odds[oidex++]=num;
			}
		}
		System.out.println(Arrays.toString(odds));
		System.out.println(Arrays.toString(evens));

	}


public static void main(String args[])
{
	int []a= {-1, 12, 3, 4, 5, 9};
	OddEven(a);
}
}
