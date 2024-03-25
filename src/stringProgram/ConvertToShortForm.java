package stringProgram;

public class ConvertToShortForm {
static void convertoshortform(String s)
{
	String[] c=s.split(" ");
	for(int i=0;i<c.length;i++)
	{
		String a=c[i];
		System.out.print(a.charAt(0)+" ");
	}
	

}
public static void main(String[] args) {
	convertoshortform("nIkhil kaumat kajhk");
}
}
