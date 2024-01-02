package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Common_Element_In_3_Array {

	public static void main(String[] args) {
		Integer arr1[] = { 1, 2, 3, 4, 7, 8, 9, 0 };
		Integer arr2[] = { 7, 8, 9, 10, 11, 12 };
		Integer arr3[] = { 7, 8, 9, 13, 14, 15 };
		HashSet<Integer> h = new HashSet<>();
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		List<Integer> finallist = new ArrayList<Integer>();
		for (Integer number : h) {
			if ((l1.contains(number) && l2.contains(number)) || (l2.contains(number) && l3.contains(number))
					|| (l3.contains(number) && l1.contains(number))) {
				finallist.add(number);
			}
		}
		System.out.println(finallist);

	}

}
