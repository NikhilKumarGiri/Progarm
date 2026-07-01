package arrayProgram;

public class SmallestInArray {
	static void smallestInteger(int a[])
	{
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Smallest is: "+small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,9,8,6,4,778,90};
		smallestInteger(a);

	}

}
