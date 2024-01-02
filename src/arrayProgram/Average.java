package arrayProgram;

public class Average {
static int averageint(int[] a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
	}
	int avg=sum/a.length;
	return avg;
}
	public static void main(String[] args) {
		int[]a= {1,2,4,6};
		System.out.println(averageint(a));
	}

}
