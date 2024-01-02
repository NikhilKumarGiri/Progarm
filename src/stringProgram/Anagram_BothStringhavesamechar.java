package stringProgram;

import java.util.Arrays;

public class Anagram_BothStringhavesamechar {

	public static void Anagram(String a, String b) {

		if (a.length() != b.length()) {
			System.out.println("Not Anagram");
		} else {
			String A = a.toLowerCase();
			String B = b.toLowerCase();
			char[] Asort = A.toCharArray();
			char[] Bsort = B.toCharArray();
			Arrays.sort(Asort);
			Arrays.sort(Bsort);
			//used the String constructor to convert the 
			//sorted character arrays (Asort and Bsort) back to strings
//			String sortedA = new String(Asort);
//			String sortedB = new String(Bsort);
//			if (sortedA.equals(sortedB))
			if(Arrays.equals(Asort, Bsort)){
				System.out.println("Anagram");
			} else {
				System.out.println("Not an anagram");
			}
		}
	}

	public static void main(String[] args) {
		Anagram("Hello", "0Lohe");
	}

}
