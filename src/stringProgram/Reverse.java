package stringProgram;

public class Reverse {
	 static String reverse(String s)
	    {
	        String rev="";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            rev=rev+s.charAt(i);
	        }
	        //System.out.println(rev);
			return rev;
	    }
		public static void main(String[] args) {
			System.out.println(reverse("Hello World"));
			String a="yiyi";
			String b="dsa";
			System.out.println(a+'\n'+b);
		}
	  

}
