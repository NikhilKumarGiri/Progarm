package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_In_Array {
	static  void duplicateElement(int[ ] a)
	{
		Set<Integer> duplicate=new HashSet<>();
		for(int i:a)
		{
			if(!duplicate.add(i))
			{
			System.out.print(i+" ");
			}
		}
		//return a;
		
	}

	public static void main(String[] args) {
		int[]a= {1,2,1,2,1,5,6};
		duplicateElement(a);
	}

}
