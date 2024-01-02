package hackerrank;

	import java.util.Scanner;

	public class Anagram {

	    static boolean isAnagram(String a, String b) {
	        // Complete the function    
	        a=a.replace(" ", "").toLowerCase();
	        b=b.replace(" ","").toLowerCase();
	        char[] asort=a.toCharArray();
	        char[] bsort=b.toCharArray();
	        java.util.Arrays.sort(asort);
	        java.util.Arrays.sort(bsort);
	        if(java.util.Arrays.equals(asort,bsort))
	        {
	            return true;
	        }
	        return false;
	        
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

