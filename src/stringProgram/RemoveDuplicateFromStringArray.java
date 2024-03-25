package stringProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromStringArray {
	static void removechar(String[] a) {
		Set<String> b = new HashSet<String>();
		
		for (int i = 0; i < a.length; i++) {
			b.add(a[i]);

		}
		System.out.println(b);

	}

	public static void main(String[] args) {
		String[] a = { "java", "C00", "C00", "java", "Ko" };
		removechar(a);

	}

}
