package stringProgram;

public class Prats {

	public static void main(String[] args) {
		String s="12416#@%1abc";
		String b=s.replaceAll("[^0-9]", "");
		System.out.println(b);
		int i=Integer.parseInt(b);
		int sum=0;
		while(i>0) {
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
		}System.out.println(sum);
	}

}
