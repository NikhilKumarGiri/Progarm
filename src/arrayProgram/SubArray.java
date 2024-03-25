package arrayProgram;

public class SubArray {
	static void subArray(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			for(int j=i;j<a.length;j++)
			{
				/*to print i to j; i=0 j=1,i=0,j=2,i=0,j=3,i=0,j=4
				i is constant in every loop
				so it is i=0 the j=i,k=i*/
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		subArray(a);
	}

}
