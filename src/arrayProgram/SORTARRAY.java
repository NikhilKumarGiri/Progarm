package arrayProgram;

import java.util.Arrays;

public class SORTARRAY {
	static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}System.out.println(Arrays.toString(a));
	}
public static void main(String[] args) {
	int[]a= {100,-98,1,2,44,1,2,0,56,-1};
	sort(a);
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
}
}
