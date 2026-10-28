package arrayProgram_medium;

import java.util.HashMap;

public class FrequencyEachIntJava8 {
	public static void freqint (int arr[]) {
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int n:arr)
		{
			freq.merge(n, 1, Integer::sum);
		}
		System.out.println(freq);
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,1,2,3,3,4,0};
		freqint(arr);
		}

}
/*Integer::sum refers java 8 lamba 
Key: The key to look up in the map (in your code, n).
Value: The default value to insert if the key doesn't exist yet (1).
BiFunction (remapping function): What to do if the key already exists. 
It takes two parameters—the old value currently in the map and the new value (1) you passed in.*/
