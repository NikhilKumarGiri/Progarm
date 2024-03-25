package string_arrayDemo;

public class SubString {
	public static void main(String[] args) {
		String s="nikhil";
		char c=s.charAt(s.length()-1);
		char lastu=(Character.toUpperCase(c));
		String d=s.substring(0,s.length()-1)+lastu;
		System.out.println(lastu);
		String  first=s.substring(0,1).toUpperCase();
		String last=s.substring(s.length()-1);
		System.out.println(last);
		//System.out.println(s.substring(0,1 ));
		//System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()));
	}
}
