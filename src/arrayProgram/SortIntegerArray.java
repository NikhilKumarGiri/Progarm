package arrayProgram;

public class SortIntegerArray {
	//2 for loop
	public static void main(String[] args) {
		int[] a= {1,5,9,8,2,7,0,8};
		int temp=0;
		System.out.print("Before sorting : ");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.print("\nAfter sorting : ");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}

}
