package stringProgram;

public class ReverseWord {

	public static void main(String[] args) {
		String s="Hello World";
		String[] b=s.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
		    System.out.print(b[i]+ " ");
		}
	}
	}


