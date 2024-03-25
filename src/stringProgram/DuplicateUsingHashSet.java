package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateUsingHashSet {

	public static void main(String[] args) {
		int [] inputarr= {1,2,3,2,4,6,8};
		DuplicateUsingHashSet.findDuplicateusingHashmap(inputarr);

	}
	public static void findDuplicateusingHashmap(int []arr)
	{
		Map<Integer,Integer> hm=new HashMap<>();
		//iterating value of arr using for each loop
		for(int j :arr)
		{
			if(!hm.containsKey(j))
			{
				hm.put(j, 1);
			}
			else
			{
				hm.put(j, hm.get(j)+1);
			}
		}
		for(Integer j :hm.keySet())
		{
			if(hm.get(j) >1)
			{
				System.out.println("Duplicate are: " +j);
			}
		}
		
	}
}
