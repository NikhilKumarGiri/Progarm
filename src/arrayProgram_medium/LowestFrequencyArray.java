package arrayProgram_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LowestFrequencyArray {
	public static void lowestFreq(int []a)
	{
        // Step 1: Count frequencies
		HashMap<Integer,Integer> fre=new HashMap<>();
		for(int i:a)
		{
			fre.put(i,fre.getOrDefault(i, 0)+1);
		}
        // Step 2: Find minimum frequency
		int min=Integer.MAX_VALUE;
		//for(HashMap.Entry<Integer,Integer>entry:fre.entrySet())
		for(int value:fre.values())	
		{
			if(value < min)
			{
				min=value;
				
			}
		}
		// Step 3: Collect all elements with that minimum frequency
		List<Integer> elements=new ArrayList<>();
		for(HashMap.Entry<Integer,Integer>entry:fre.entrySet())
		{
			if(entry.getValue()==min)
			{
				elements.add(entry.getKey());
			}
		}
		System.out.println(elements);

		
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,4};
		lowestFreq(a);
	}

}
