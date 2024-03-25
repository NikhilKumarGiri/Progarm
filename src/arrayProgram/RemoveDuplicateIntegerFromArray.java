package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateIntegerFromArray {
	public static void main(String[] args) {
		Integer []arr= {1,2,3,2,3,4,5,6,87,87};
		HashSet<Integer> ele=new HashSet<>(Arrays.asList(arr));
//		for(int i=0;i<arr.length;i++)
//		{
//			ele.add(arr[i]);
//		}
		//int []newarr= new int[ele.size()];
		//convert the set to int array 
		System.out.println(ele);
		//Integer[] remove = ele.toArray(new Integer[ele.size()]);

	}

}
