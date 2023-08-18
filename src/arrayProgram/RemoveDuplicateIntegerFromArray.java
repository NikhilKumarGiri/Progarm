package arrayProgram;

import java.util.HashSet;

public class RemoveDuplicateIntegerFromArray {
	public static void main(String[] args) {
		int []arr= {1,2,3,2,3,4,5,6};
		HashSet<Integer> ele=new HashSet<Integer>();
		for(int num:arr)
		{
			ele.add(num);
		}
		//int []newarr= new int[ele.size()];
		for(int i=1;i<=ele.size();i++ )
		{
			System.out.println(i);
		}
	}

}
