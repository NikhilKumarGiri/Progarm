package stringProgram;


public class StringToStringArray {

	public static void main(String[] args) {
		String s="i am nikhil";
		String []d=s.split(" ");
		for(int i=0;i<=d.length-1;i++)
		{
			System.out.println(d[i]);
		}
		int[]a= {4,6,878,827};
		System.out.println(a.length);
	}

}
