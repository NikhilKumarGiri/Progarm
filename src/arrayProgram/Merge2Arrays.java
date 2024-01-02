package arrayProgram;

import java.util.Arrays;

public class Merge2Arrays {
  static void merge2array(int[]n1,int[]n2)
	{
		int n3[]=new int [n1.length+n2.length];
		for(int i=0;i<n1.length;i++)
		{
			n3[i]=n1[i];
			//{1 2 3 0 0 0}
		}
		for(int i=0;i<n2.length;i++)
		{
			n3[i+n1.length]=n2[i];
		}
		//directly array element can not be print so converting to string
		System.out.println(Arrays.toString(n3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n1= {1,2,3};
		int [] n2= {98,7,8};
		merge2array(n1, n2);
	}

}
