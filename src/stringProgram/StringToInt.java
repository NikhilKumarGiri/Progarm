package stringProgram;

public class StringToInt {

	public static void main(String[] args) {
		String s="12415";
		int a=Integer.parseInt(s);
		System.out.println(a);
		int b=Integer.valueOf(s);
		System.out.println(b);
		//int c=new Integer(s).intValue();
		
	}

}
