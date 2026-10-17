package arrayProgram_medium;

import java.util.HashMap;

public class HighestFreqArray {
	public static void highFre(int a[])
	{
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i:a)
		{
		hm.put(i,hm.getOrDefault(i, 0)+1);
		
		}
		//frequency can`t be 0
		int maxFre=0;
		//its a sentinel(no element chosen yet.”) 
		//value ,element can't int lowest num which is stored in the declared int array
		int element =Integer.MIN_VALUE;
		for(HashMap.Entry<Integer,Integer>entry:hm.entrySet())
		{
			if(maxFre<entry.getValue())
			{
				maxFre=entry.getValue();
				element=entry.getKey();
			}
		}
		System.out.println(element);
	}
	
					

	public static void main(String[] args) {
		int a[]= {1,2,3,2,2,2,2,4,5,5,5,5,5,5,5,5,5};
		highFre(a);

	}

}
