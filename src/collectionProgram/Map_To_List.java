package collectionProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_To_List {
	public static void main(String[] args) {
		// HashMap to Arraylist
		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("Java", 1);
		mp.put("C++", 2);
		mp.put("Python", 3);
		System.out.println(mp);
		List<Map.Entry<String, Integer>> l = new ArrayList<>(mp.entrySet());
		// System.out.println(l);
		// for loop
		for (Map.Entry<String, Integer> entry : l) {
			System.out.println(entry.getKey() + entry.getValue());
		}

	}

}
