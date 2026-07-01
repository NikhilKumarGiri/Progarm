package stringProgram;

import java.util.Arrays;

public class Anagram_method {
	public static boolean anagram(String a,String b){
        if(a.length()!=b.length())
        {
            return false;
        }
        else
        {
            String c=a.toLowerCase();
            String d=b.toLowerCase();
            char[]m=c.toCharArray();
            char[]n=d.toCharArray();
            Arrays.sort(m);
            Arrays.sort(n);
            return Arrays.equals(m,n);
        }   
    }
    
    public static void main(String[] args) {
        System.out.println(anagram("abc","cba"));
    }

}
