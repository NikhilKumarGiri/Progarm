package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateIntegerFromArray {
	public static void main(String[] args) {
		int []arr= {1,2,3,2,3,4,5,6,87,87};
		HashSet<Integer> ele=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			ele.add(arr[i]);
		}
		//int []newarr= new int[ele.size()];
		//convert the set to int array 
		Integer[] remove = ele.toArray(new Integer[ele.size()]);
//		for(int i=1;i<=ele.size();i++ )
//		{
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(remove));
	}

}
