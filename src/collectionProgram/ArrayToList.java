package collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		//Arrays to list 
		Integer []a= {1,2,3,6};
		//int[]a={1,3,2,1,8};
		List<Integer>l=Arrays.asList(a);
			//or we can write
		//	List<int[]>l=Arrays.asList(a);
			System.out.println(l);
			
			//List to array
			List<String> s=new ArrayList<>();
			s.add("fas");
			s.add("ajgs");
			s.add("shsa");
			String[] s1=s.toArray(new String[0]);
			System.out.println(Arrays.toString(s1));

	}

}
