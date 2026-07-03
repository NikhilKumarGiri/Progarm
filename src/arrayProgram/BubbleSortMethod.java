package arrayProgram;

public class BubbleSortMethod {
	public static void sort(int []a)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.print(a[m]+" ");
		}
	}

	public static void main(String[] args) {
		int []a= {56,10,12,45,9,0,100,-1};
		sort(a);
		

	}

}
