package pratice;

import java.util.Arrays;

public class Anagramprat {
	public static boolean anagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			String lowa=a.toLowerCase();
			String lowb=b.toLowerCase();
			char []a1=lowa.toCharArray();
			char []b1=lowb.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			if(Arrays.equals(a1, b1))
			{
				return true;
			}
			return false;
			
		}

	}
	public static void main(String[] args) {
		System.out.println(anagram("hello","lloeH"));
	}

}
