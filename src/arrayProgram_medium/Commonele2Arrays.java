package arrayProgram_medium;

public class Commonele2Arrays extends Common2ArraysOpt {
	static void common(int []a,int []b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j< b.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+ " ");
					break;
					
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int []a= {1,2,2,3,4,7,8,9,10};
		int []b= {1,2,3,34,55,6,8,10,12};
		common(a, b);
		System.out.println();
		commonOpt(a,b);
	}

}
