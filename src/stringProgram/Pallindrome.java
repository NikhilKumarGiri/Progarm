package stringProgram;

public class Pallindrome {
	 static boolean pallindrome(String s)
    {
     String rev="";
     String b=s;
    
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(b))
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.print(pallindrome("mawdam"));
	}
}
