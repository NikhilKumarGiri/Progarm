package arrayProgram_medium;

import java.util.HashSet;
import java.util.Set;

//25. Find elements present in the 2nd array but not the 1st.

public class ArrayDifference {
	static void difference(int a[],int b[])
	{
		HashSet<Integer>setA=new HashSet<>();
		for(int i:a)
		{
			setA.add(i); // Step 1: store all elements of first array
		}
		HashSet<Integer>result=new HashSet<>();
		for(int setB:b)
		{
			if(!setA.contains(setB)) // Step 2: check if element of b is not in a
			{
				result.add(setB); // Step 3: add to result
			}
		}System.out.println(result);
		
	}
	public static void main(String[] args) {
		int []a= {1,2,2,3,4,7,8,9,10,-5};
		int []b= {1,2,3,34,55,6,8,10,12,-6,-5};
		difference(a,b);
	}
	

}
