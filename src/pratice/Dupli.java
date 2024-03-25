package pratice;

import java.util.HashSet;
import java.util.Set;

public class Dupli {
	public static void main(String[] args) {
		int a[]= {1,2,1,2,1,4,4,6};
		Set<Integer > dp=new HashSet<>();
		for(int i:a)
		{
			if(!dp.add(i))
			{
				System.out.print(i+ " ");
			}
		}
	}

}
