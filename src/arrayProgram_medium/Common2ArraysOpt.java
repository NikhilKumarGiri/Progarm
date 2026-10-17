package arrayProgram_medium;

import java.util.HashSet;
import java.util.Set;

public class Common2ArraysOpt {
	 static void commonOpt(int []a, int[] b)
	 {
	        // Step 1: Put all elements of first array into a set
		 Set<Integer>s=new HashSet<>();
		 for(int i:a)
		 {
			 s.add(i);
		 }
	        // Step 2: Check elements of second array against setA
		 Set<Integer>result=new HashSet<>();
		for(int j:b)
		{
			if(s.contains(j))
			{
				result.add(j);
				
			}
			
		}System.out.print(result);
	 }
	 public static void main(String[] args) {
			int []a= {1,2,2,3,4,7,8,9,10,-5};
			int []b= {1,2,3,34,55,6,8,10,12,-6,-5};
			commonOpt(a,b);
		}
}
