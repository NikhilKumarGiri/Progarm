package arrayProgram_medium;

import java.util.HashMap;

public class FrequencyEachInt {
	

	public static void main(String[] args) {
		int arr[]= {1,2,1,1,2,3,3,4,0};
		freqInt(arr);
	}

	private static void freqInt(int[] arr) {
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int n:arr)
		{
			if(freq.containsKey(n))
			{
				freq.put(n,freq.get(n)+1);
			}
			else
			{
				freq.put(n,1);
			}
		}
		System.out.println(freq);
	}

}
