package arrayProgram;

import java.util.Arrays;

public class SortIntegerArray {
	//2 for loop
	public static void main(String[] args) {
		int[] a= {3,43,1,5,9,8,2,7,0,10,100,988,98,101,-98};
		int temp;
//		System.out.print("Before sorting : ");
//
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i] +" ");
//		}
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
		System.out.print("After sorting : "+Arrays.toString(a));

//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i] +" ");
//		}
	}

}
