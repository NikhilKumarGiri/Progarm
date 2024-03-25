 package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementIn3Array {
	public static void common(Integer[]a,Integer[]b,Integer[]c)
	{

        Set<Integer> setA = new HashSet<>(Arrays.asList(a));
        Set<Integer> setB = new HashSet<>(Arrays.asList(b));
        Set<Integer> setC = new HashSet<>(Arrays.asList(c));

        // Find the intersection of all three sets
        setA.retainAll(setB);
        setA.retainAll(setC);

		
        Integer[] commonelement=setA.toArray(new Integer[0]);
		System.out.println(Arrays.toString(commonelement));
		
		
				
	}
	public static void main(String[] args) {
		Integer[]a= {1,2,3,4,5,8};
		Integer[]b= {1,2,8,0,9};
		Integer[]c= {1,2,8,0,9};
		common(a, b, c);
	}

}
