package arrayProgram_medium;

import java.util.Arrays;

public class MoveAll0End {
	public static void move0(int a[])
	{
		int index=0;// position for next non-zero
		// Step 1: Move non-zeros forward
		for(int num:a)
		{
			if(num!=0)
			{
				a[index++]=num;
				
			}
		}
		// Step 2: Fill remaining with zeros
		while(index<a.length)
		{
			a[index++]=0;
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,0,3,0,4,5,9,0};
		move0(a);
		System.out.println(Arrays.toString(a));

	}

}
