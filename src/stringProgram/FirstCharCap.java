package stringProgram;

public class FirstCharCap {
	public static String cap(String s)
	{
		return s.substring(0,1).toUpperCase()+s.substring(1);
	}
	

	public static void main(String[] args) {
		System.out.println(cap("nikhil"));

	}

}
