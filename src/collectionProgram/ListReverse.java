package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ListReverse {
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.add(6);
		i.add(0);
		i.add(9);
		System.out.println(i);
		Collections.reverse(i);
		System.out.println("After reverse: "+i);
	}
}
